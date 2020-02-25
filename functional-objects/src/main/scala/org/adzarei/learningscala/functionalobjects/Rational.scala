package org.adzarei.learningscala.functionalobjects

// Class that models the behaviour of rational numbers.
// Class Parameters:
//   - n represents the 'numerator'
//   - d represents the 'denominator'
class Rational(n: Int, d: Int) {
  // Scala compiler will add any code inside these curly brackets to the constructor.
  require(d != 0, "Numerator can't be 0.")

  val num: Int = n
  val denom: Int = d

  override def toString: String = n + "/" + d

  def add (that: Rational): Rational = {
    new Rational((this.n * that.denom) + (that.num * this.d), this.d * that.denom)
  }

}
