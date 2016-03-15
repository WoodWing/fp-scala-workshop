package com.woodwing.fpws.sampledata

object Emails {

  case class Email(
                    subject: String,
                    body: String,
                    sender: String,
                    recipient: String
                  )

}
