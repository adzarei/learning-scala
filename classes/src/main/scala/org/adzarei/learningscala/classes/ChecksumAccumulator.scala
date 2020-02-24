package org.adzarei.learningscala.classes

import scala.collection.mutable

class ChecksumAccumulator {

  // No modifier is defaulted to public.
  private var sum = 0

  def add(b: Byte): Unit = { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1

}

// Singleton Object
// Companion Object
object ChecksumAccumulator {

  private val cache = mutable.Map.empty[String, Int]

  // Calculate the checksum of a string in an imperative style.
  def calculate_imperative(s: String): Int = {
    if (cache.contains(s))
      cache(s)
    else {
      val cacc = new ChecksumAccumulator
      for (c: Char <- s)
        cacc.add(c.toByte)
      val checksum = cacc.checksum()
      cache += (s -> checksum)
      checksum
    }
  }

  // Calculate the checksum of a string in a functional style.
  def calculate_functional(s: String): Int = {
    if (cache.contains(s))
      cache(s)
    else {
      val cacc = new ChecksumAccumulator
      s.foreach((c: Char) => cacc.add(c.toByte))
      val checksum = cacc.checksum()
      cache += (s -> checksum)
      checksum
    }
  }


}