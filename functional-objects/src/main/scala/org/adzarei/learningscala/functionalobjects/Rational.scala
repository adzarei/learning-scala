package org.adzarei.learningscala.functionalobjects

import scala.annotation.tailrec

// Class that models the behaviour of rational numbers.
// Class Parameters:
//   - n represents the 'numerator'
//   - d represents the 'denominator'
// NOTE: Class Parameters can't be accessed outside the object.
class Rational(n: Int, d: Int) {
  // Scala compiler will add any code inside these curly brackets to the constructor.
  require(d != 0, "Numerator can't be 0.")

  // This are fields. If public they can be accessed outside the object.
  private val g = grtCommonDivisor(n, d)
  val numer: Int = n / g
  val denom: Int = d / g

  override def toString: String = n + "/" + d

  def add (that: Rational): Rational = new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )
  def lessThan(that: Rational): Boolean = this.numer * that.denom < that.numer * this.denom
  def greaterThan (that: Rational): Boolean = this.numer * that.denom > that.numer * this.denom
  def max(that: Rational): Rational = if( this > that ) this else that
  def min(that: Rational): Rational = if( this < that ) this else that
  def + (that: Rational): Rational = add(that)
  def < (that: Rational): Boolean = lessThan(that)
  def > (that: Rational): Boolean = greaterThan(that)

  @tailrec
  private def grtCommonDivisor(a: Int, b: Int): Int = {
    if (b == 0) a else grtCommonDivisor(b, a % b)
  }

}
