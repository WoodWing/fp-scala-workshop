package com.woodwing.fpws.collections

import io.fester.util.test.UnitSpec

class Collections1Spec extends UnitSpec {

  behavior of "collections"

  they should "be traversable" in {
    val l = 1 :: List(2, 3)
    (l map (_ + 2)) shouldBe List(3, 4, 5)
  }
}
