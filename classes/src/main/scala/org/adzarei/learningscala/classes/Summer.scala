package org.adzarei.learningscala.classes

import org.adzarei.learningscala.classes.ChecksumAccumulator.{calculate_functional, calculate_imperative}

object Summer {

  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      println("[IMPERATIVE] " + arg + " : " + calculate_imperative(arg))
      println("[FUNCTIONAL] " + arg + " : " + calculate_functional(arg))
    }
  }

}
