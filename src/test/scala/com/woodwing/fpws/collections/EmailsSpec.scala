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

package com.woodwing.fpws.collections

import com.woodwing.fpws.functional.Lesson1._
import io.fester.util.test.UnitSpec


object EmailsSpec {
  final val emails = Set(
    Email())
}


class EmailsSpec extends UnitSpec {
  import EmailsSpec._

//  "" match {
//    case "".r(m) ⇒
//  }

  behavior of "email filters"

  they should "filter an email inbox" in {
    Given("An email inbox")
    val inbox = emails

    When("Using a recipient filter")

    Then("The filtered list should match")

  }
}
