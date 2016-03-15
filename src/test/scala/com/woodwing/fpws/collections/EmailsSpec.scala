package com.woodwing.fpws.collections

import com.woodwing.fpws.collections.Emails.Email
import io.fester.util.test.UnitSpec


class EmailsSpec extends UnitSpec {

  behavior of "email filters"

  they should "xx" in {
    Given("An email inbox")
    val emails = List(
      Email())

    When("Using a recipient filter")

    Then("The filtered list should match")

  }
}
