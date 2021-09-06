package lecture.part1_basics

object StringOperations extends App{

  val str: String = "Hello World"

  // String Methods

  println(str.charAt(2))
  println((str.substring(7, 11)))
  println(str.split(" ").toList)

  // tests
  println(str.startsWith("hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  // Scala utility
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')     // prepending and appending
  println(str.reverse)
  println(str.take(2))

  // Scala specific: String Interpolator

  // S - Interpolator
  val name = "David"
  val age = 12
  val greeting = s"Hello my name is $name and I'm $age years old" // embed values in string
  println(greeting)

  val greeting2 = s"I'll turn ${age+1} years old" // add expression in a string
  println(greeting2)

  // F - Interpolator : also check for type correctness.
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burger per minute" //float number format
  println(myth)

  // raw - interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
  println(s"$escaped")




}
