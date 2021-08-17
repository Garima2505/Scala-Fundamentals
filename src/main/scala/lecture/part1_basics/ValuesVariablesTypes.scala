package lecture.part1_basics

object ValuesVariablesTypes extends App {
  println("hello world")

  // val is immutable => val name: type = value
  // value cannot be reassign

  val x: Int = 42
  println(x)

  // does not need to specify the type because the compiler is smart enough to  infer the type
  val y = 34

  // String type
  val aString: String = "hello"

  // Boolean Type
  val aBoolean: Boolean = false

  // Character type - single character
  val aChar: Char = 'a'

  // Short = represent by 2 bits
  val aShort: Short = 23223

  // Int = represent by 4 bits
  val aInt: Int = 23

  // Long = represent by 8 bits
  val aLong: Long = 2323442342234234L

  // Decimal/Float
  val aFloat: Float = 23.4f

  // Decimal/Float
  val aDouble: Double = 3.15

  // Variables => are mutable can can be reassign
  var aVariable: Int = 4

  aVariable = 8 // side effects


}
