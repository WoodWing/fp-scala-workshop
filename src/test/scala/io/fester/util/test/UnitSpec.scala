package io.fester.util.test

import org.scalactic.TimesOnInt
import org.scalatest.{ PrivateMethodTester, _ }

abstract class UnitSpec
    extends FlatSpec
    with Matchers
    with OptionValues
    with Inside
    with Inspectors
    with GivenWhenThen
    with PrivateMethodTester
    with TimesOnInt {
}
