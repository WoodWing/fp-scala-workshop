package com.woodwing.fpws.sampledata

object EnronEmails {

  case class Email(
      subject: String,
      body: String,
      sender: String,
      recipient: String
  )

  final val Inbox = List(
    Email(
      sender = "arsystem@mailman.enron.com",
      recipient = "k..allen@enron.com",
      subject = "Your Approval is Overdue: Access Request for matt.smith@enron.com",
      body =
        """Request ID          : 000000000067320
Request Create Date : 10/11/01 10:24:53 AM
Requested For       : matt.smith@enron.com
Resource Name       : Risk Acceptance Forms Local Admin Rights - Permanent
Resource Type       : Applications"""
    ),
    Email(
      sender = "arsystem@mailman.enron.com",
      recipient = "k..allen@enron.com",
      subject = "Your Approval is Overdue: Access Request for matt.smith@enron.com",
      body =
        """Request ID          : 000000000067320
Request Create Date : 10/11/01 10:24:53 AM
Requested For       : matt.smith@enron.com
Resource Name       : Risk Acceptance Forms Local Admin Rights - Permanent
Resource Type       : Applications"""
    ),
    Email(
      sender = "brad.jones@enron.com",
      recipient = "",
      subject = "Gas P&L by day",
      body =
        """Thanks,
Brad Jones"""
    ),
    Email(
      sender = "jsmith@austintx.com",
      recipient = "k..allen@enron.com",
      subject = "Properties for sale",
      body =
        """Thanks,

Jeff Smith
The Smith Company
9400 Circle Drive
Austin, Texas  78736
512-394-0908 office
512-394-0913 fax
512-751-9728 mobile
jsmith@austintx.com

 - Metropolitan sales sheet.xls
 - south center oaks sales sheet.xls
 - Treaty Oaks Sales Sheet.xls"""
    ),
    Email(
      sender = "wise.counsel@lpl.com",
      recipient = "k..allen@enron.com",
      subject = "Huntley/question",
      body =
        """Phillip,

Could you please do me a favor?  I would like  to read your current title policy to see what it says about easements.
  You  should have received a copy during your closing.  I don't know how many  pages it will be but let me know how
  you want to handle getting a copy  made.  I'll be happy to make the copy, or whatever makes it easy for  you.

Thanks,

Bob Huntley"""
    ),
    Email(
      sender = "renee.ratcliff@enron.com",
      recipient = "k..allen@enron.com",
      subject = "Distribution Form",
      body =
        """Pursuant to your request, please see the attached.

Thanks,

Renee"""
    ),
    Email(
      sender = "msimpkins@winstead.com",
      recipient = "pallen@enron.com, pallen70@hotmail.com",
      subject = "Blackline of First Amendment to Contract",
      body =
        """Enclosed please find a blackline of the First Amendment to Contract showing
the revisions.  I have forwarded a clean version of the Amendment to you for
your signature.  If you have any questions or concerns, please contact me at
(512) 370-2836.  Thanks.

Michelle L. Simpkins
Winstead Sechrest & Minick P.C.
100 Congress Avenue, Suite 800
Austin, Texas  78701
(512) 370-2836
(512) 370-2850 Fax
msimpkins@winstead.com


 - 3MMPRED.DOC"""
    ),
    Email(
      sender = "david.port@enron.com",
      recipient = "k..allen@enron.com",
      subject = "FW: Gas P&L by day",
      body =
        """-----Original Message-----
From: 	Hayden, Frank
Sent:	Monday, December 10, 2001 5:22 PM
To:	Port, David
Subject:	FW: Gas P&L by day



 -----Original Message-----
From: 	Jones, Brad
Sent:	Monday, December 10, 2001 5:00 PM
To:	'daniel.mcdonagh@chase.com'; Allen, Phillip K.; 'pallen70@hotmail.com'
Cc:	Hayden, Frank; Gossett, Jeffrey C.
Subject:	Gas P&L by day

Attached is the information you have requested.

Thanks,
Brad Jones"""
    ),
    Email(
      sender = "james.bruce@enron.com",
      recipient = "k..allen@enron.com, tom.alonso@enron.com, kysa.alport@enron.com, ",
      subject = "Edition 2 New Gen Weekly",
      body =
        """O:_Dropbox/West New Gen/Weekly/2_10_26_01

If you have any comments about this report (including ease of access) please direct them to me as soon as possible.


James Bruce
Enron North America		(503) 464-8122
West Power Desk		(503) 860-8612 (c)
121 SW Salmon, 3WTC0306	(503) 464-3740 (fax)
Portland, OR 97204		James.Bruce@Enron.com"""
    ),
    Email(
      sender = "kathryn.sheppard@enron.com",
      recipient = "cooper.richey@enron.com, chris.gaskill@enron.com, mike.grigsby@enron.com, ",
      subject = "Reminder:  Portland Fundamental Analysis Strategy Meeting/NEW",
      body =
        """PLEASE NOTE:   Call-in information has changed.

The call-in information for the Tuesday Portland Fundamental Analysis Strategy Meeting is as follows:


						Date:			Tuesday, 10/30/01
						Time:			1:00 p.m. (PST)

						Dial In Number:	888-285-4585
						Participant Code:  	124573


If you have any questions, please contact Kathy Sheppard at 503-464-7698.

Thanks."""
    ),
    Email(
      sender = "arsystem@mailman.enron.com",
      recipient = "k..allen@enron.com",
      subject = "Your Approval is Overdue: Access Request for matt.smith@enron.com",
      body =
        """Request ID          : 000000000067320
Request Create Date : 10/11/01 10:24:53 AM
Requested For       : matt.smith@enron.com
Resource Name       : Risk Acceptance Forms Local Admin Rights - Permanent
Resource Type       : Applications"""
    ),
    Email(
      sender = "arsystem@mailman.enron.com",
      recipient = "k..allen@enron.com",
      subject = "Your Approval is Overdue: Access Request for matt.smith@enron.com",
      body =
        """Request ID          : 000000000067320
Request Create Date : 10/11/01 10:24:53 AM
Requested For       : matt.smith@enron.com
Resource Name       : Risk Acceptance Forms Local Admin Rights - Permanent
Resource Type       : Applications"""
    ),
    Email(
      sender = "enron_update@concureworkplace.com",
      recipient = "pallen@enron.com",
      subject = "Expense Reports Awaiting Your Approval",
      body =
        """Owner: James W Reitmeyer
Report Name: JReitmeyer 10/24/01
Days In Mgr. Queue: 5"""
    ),
    Email(
      sender = "mery.l.brown@accenture.com",
      recipient = "pallen@enron.com",
      subject = "Room for Tomorrow's Meeting",
      body =
        """Ina scheduled the conference room for tomorrow, so she's probably already
got it on your schedule, but FYI - our meeting will be in the new Enron
building, Room 6104.

See you at 10:00.
Mery


This message is for the designated recipient only and may contain
privileged, proprietary, or otherwise private information.  If you have
received it in error, please notify the sender immediately and delete the
original.  Any other use of the email by you is prohibited."""
    ),
    Email(
      sender = "gthorse@about-cis.com",
      recipient = "k..allen@enron.com",
      subject = "",
      body =
        """This attachment is my start on your 1031 search.  From my experience, you
will probably need to park the money until we find the right investment for
you.  I have not had time to analize all of the possibilities.

Are you coming on Friday? Do you want me to drive by these properties
tomorrow, or are we going to do it Friday?

Please reply



 - Phillip Allen 1031 Spreadsheet.xls"""
    ),
    Email(
      sender = "ryan.o'rourke@enron.com",
      recipient = "k..allen@enron.com, tom.alonso@enron.com, robert.badeer@enron.com, ",
      subject = "West NatGas Prices 1127",
      body =
        """That is how I will start to publish this sheet.

-Ryan
 5-3874"""
    ),
    Email(
      sender = "melissaspears@open2win.oi3.net",
      recipient = "pallen@enron.com",
      subject = "PHILLIP, FREE Stock Alerts, Make Money on Your Stocks!",
      body =
        """[IMAGE]
[IMAGE]


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
This email is not sent unsolicited. This is an Open2Win mailing!
This message is sent to subscribers ONLY.
The e-mail subscription address is: pallen@enron.com
To unsubscribe please click here. or
Send an email with remove as the subject to remove@opthost.com
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
08943A37-C26C-43AE-897A-13856DF90795"""
    ),
    Email(
      sender = "arsystem@mailman.enron.com",
      recipient = "k..allen@enron.com",
      subject = "Your Approval is Overdue: Access Request for matt.smith@enron.com",
      body =
        """Request ID          : 000000000067320
Request Create Date : 10/11/01 10:24:53 AM
Requested For       : matt.smith@enron.com
Resource Name       : Risk Acceptance Forms Local Admin Rights - Permanent
Resource Type       : Applications"""
    ),
    Email(
      sender = "pallen70@hotmail.com",
      recipient = "pallen@enron.com",
      subject = "",
      body =
        """Get your FREE download of MSN Explorer at http://explorer.msn.com
 - DESIGNSELECTIONS_DyalRoberts.doc"""
    )
  )

}
