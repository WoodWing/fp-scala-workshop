/*
 * Copyright (c) 2016 woodwing.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.woodwing.fpws.functional

object Lesson1 {

  case class Email(
      subject: String,
      body: String,
      sender: String,
      recipient: String
  )

  val emails = Set.empty[Email]

  // Given a collection of Email objects, write functions that filter .. :
  // (input: Seq[Email]) -> filter -> (output: Seq[Email])

  // sentByOneOf(senders: Seq[String])

  def filterEmails(emails: Set[Email])(f: EmailFilter): Set[Email] =
    emails filter f

  type EmailFilter = Email ⇒ Boolean

  val senders = ("jtb@woodwing.com" :: Nil).toSet
  filterEmails(emails) { email ⇒ senders.contains(email.sender) }
  filterEmails(emails)(email ⇒ senders.contains(email.sender))

  val sentByOneOf: (Set[String]) ⇒ EmailFilter =
    (s) ⇒ e ⇒ s.contains(e.sender)

  // filters emails _not_ sent by any of senders in given set
  val notSentByAnyOf: (Set[String]) ⇒ EmailFilter = ???

  // filter emails with a minimum body size
  val minimumBodySize = ???

  // filter emails with a maximum body size
  val maximumBodySize = ???

  filterEmails(emails)(sentByOneOf(senders))

  // notSentByAnyOf: Seq[String]

  // minimumBodySize(min: Int)

  // maximumBodySize(max: Int)
}
