package com.woodwing.fpws.collections

import java.util.NoSuchElementException

import com.woodwing.fpws.sampledata.EnronEmails
import com.woodwing.fpws.sampledata.EnronEmails.Email
import io.fester.util.test.UnitSpec

import scala.util.{Success, Try}


object CollectionsExample {
  final val Inbox = EnronEmails.Inbox
  final val Numbers = List(2, 5, 7, 9, 12, 45)
}


class CollectionsExample extends UnitSpec {
  import CollectionsExample._

  "inbox" should "have all recipients changed when mapped" in {
    val in = Inbox map { email ⇒ email.copy(recipient = "scala@rulez.co") }
    assert(in forall (_.recipient == "scala@rulez.co"))
  }

  "inbox" should "be filtered from long bodies" in {
    val bodyLengthFilter: Email ⇒ Boolean = (email) ⇒ email.body.length < 100
    val in = Inbox filter bodyLengthFilter
    assert(in forall { e ⇒ e.body.length < 100 })
  }

  "a list of numbers" should "yield the sum of its elements when folded" in {
    val sum = (Numbers foldLeft 0) { (s, e) ⇒ s + e }
    assert(sum === 80)
  }

  /** `Option[A]` is also a collection with 0 or 1 element of type `A` */

  "An empty Option[Int]" should "map to None" in {
    val opt = Option.empty[Int] // or `val opt: Option[Int] = None`
    assert((opt map (_ * 4)) === None)
    assert((opt flatMap (n ⇒ Some(n * 4))) === None)
    assertThrows[NoSuchElementException](opt get)
    assert((opt getOrElse 8) === 8)
    assert((opt fold 7) (n ⇒ n + 2) === 7)
    opt foreach println // should not print anything
  }

  "An Option[Int] with value 2" should "allow collection operations" in {
    val opt = Option(2)
    assert((opt map (_ * 2) get) === 4)
    assert((opt get) === 2)
    assert((opt fold 7) (n ⇒ n + 2) === 4)
    opt foreach println // should print 2
  }

  /** The same counts for `Try[A]` */

  "A failed Try[Int]" should "map to Failure[E <: Exception]" in {
    val res = Try(throw new IllegalArgumentException(s"NaN 'a'"))
    assert(res.isFailure === true)
    assert(res.toOption === None)
    val recover = res recover { case ex ⇒ 1 → ex.getMessage }
    assert((recover get) ===(1, "NaN 'a'"))
  }

  "A success Try[Int]" should "allow collection operations" in {
    val res = Try(4)
    assert(res.isSuccess === true)
    assert((res get) === 4)
    assert((res map (_ + 2)) === Success(6))
    res foreach println // should print 4
  }
}
