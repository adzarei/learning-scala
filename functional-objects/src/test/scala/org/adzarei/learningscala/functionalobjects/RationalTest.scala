package org.adzarei.learningscala.functionalobjects

import org.scalatest.funsuite.AnyFunSuite

class RationalTest extends AnyFunSuite {

  test("Rational Object should have passed Numerator numer"){
    val rational = new Rational(1,2)
    assert(rational.numer == 1)
  }

  test("Rational Object should have passed Denominator denom"){
    val rational = new Rational(1,2)
    assert(rational.denom == 2)
  }

  test("Rational Object should have normalised fraction") {
    val rational = new Rational(2,4)
    assert(rational.numer == 1 && rational.denom == 2)
  }



}
