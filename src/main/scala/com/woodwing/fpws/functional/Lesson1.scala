package com.woodwing.fpws.functional

object Lesson1 {

  case class Email(
    subject: String,
    body: String,
    sender: String,
    recipient: String
  )

  // Given a collection of Email objects, write functions that filter .. :
  // (input: Seq[Email]) -> filter -> (output: Seq[Email])

  // sentByOneOf(senders: Seq[String])

  // notSentByAnyOf: Seq[String]

  // minimumBodySize(min: Int)

  // maximumBodySize(max: Int)
}
