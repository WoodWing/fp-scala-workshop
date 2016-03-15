package com.woodwing.fpws.collections

object Emails {

  sealed trait Something

  case class Email(
    subject: String,
    text: String,
    sender: String,
    recipient: String
  ) extends Something

  //  val inbox = List(
  //    Email("")
  //  )

  // write functions to filter emails

  // input: List[Email]
  // output: List[Email]

  // sentByOneOf list of senders

  // notSentByOneOf list of senders

  // minimumSize bytes

  // maximumSize bytes

  type EmailFilter = (Email) ⇒ Boolean

  val sentByOneOf: (Set[String]) ⇒ EmailFilter =
    (senders) ⇒ email ⇒ senders.contains(email.sender)

  //  senders => email => senders.contains(email.sender)
  val notSentByAnyOf: (Set[String]) => EmailFilter =
    (senders) => email => !senders.contains(email.sender)

  val minimumSize: (Int) => EmailFilter = (n) => email => email.text.length >= n
  val maximumSize: (Int) => EmailFilter = (n) => email => email.text.length <= n
}
