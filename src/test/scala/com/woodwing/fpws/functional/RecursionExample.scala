package com.woodwing.fpws.functional

import io.fester.util.test.UnitSpec

import scala.annotation.tailrec


class RecursionExample extends UnitSpec {

  "a recursive function" should "sum a sequence" in {
    /** tail recursive !! */
    @tailrec def sum(start: Int, seq: Seq[Int]): Int =
      if (seq.nonEmpty)
        sum(start + seq.head, seq.tail)
      else
        start

    val s = sum(0, Seq.fill(50)(1))
    println(s)
  }
}
