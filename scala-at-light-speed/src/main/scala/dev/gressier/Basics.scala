package dev.gressier

object Basics {

  // Defining a value
  val meaningOfLife: Int = 42 // Constant
  //meaningOfLife = 43

  val aBoolean = false // Type inference
  // Int, Boolean, Char, Double, Float, String

  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // Expressions: structures that can be reduced to a value
  val anExpression = 2 + 3
  // In Scala, everything is an expression

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999
  val chainedIfExpression  =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

  // Code blocks
  val aCodeBlock = {
    // Definitions
    val aLocalValue = 67

    // Value of a block is the value of last expression
    aLocalValue + 3
  }

  // Defining a function
  def myFunction(x: Int, y: String): String = y + " " + x
  // Same function with a code block:
  def myFunctionAlt(x: Int, y: String): String = { y + " " + x }

  // Recursive functions
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  // factorial(5) = 5 * factorial(4) = 5 * 24 = 120
  // factorial(4) = 4 * factorial(3) = 4 * 6
  // factorial(3) = 3 * factorial(2) = 3 * 2
  // factorial(2) = 2 * factorial(1) = 2 * 1
  // factorial(1) = 1

  // In Scala, we don't use loops or iteration, we use RECURSION!

  // The Unit type (i.e., no meaningful value)
  println("I love Scala") // System.out.prinln
  // Unit = the type of side effects

  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }
  val theUnit = ()
}