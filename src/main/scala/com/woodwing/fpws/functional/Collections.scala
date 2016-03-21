package com.woodwing.fpws.functional

import com.woodwing.fpws.sampledata.EnronEmails.Email


/** == Lesson 3 ==
  * Collections
  */
object Collections {

  final val Inbox = Set.empty[Email]

  def mapExample() = Inbox map (_.copy(recipient = "jtb@woodwing.com"))

  type StringFilter = String ⇒ Boolean

  val tdr: StringFilter = (s) ⇒ s.startsWith("a")
  //  val e1: String ⇒ StringFilter =
}
