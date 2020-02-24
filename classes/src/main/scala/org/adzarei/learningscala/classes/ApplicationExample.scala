package org.adzarei.learningscala.classes

import org.adzarei.learningscala.classes.ChecksumAccumulator.{calculate_functional, calculate_imperative}

// By extending the trait scala.App, the code inside the singleton object will be executed just like if there were a
// main method.
object ApplicationExample extends App {

  // Program arguments can be accessed through the 'args' variable.
  for (arg <- args) {
    println("[IMPERATIVE] " + arg + " : " + calculate_imperative(arg))
    println("[FUNCTIONAL] " + arg + " : " + calculate_functional(arg))
  }

}
