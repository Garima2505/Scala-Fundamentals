package lecture.part1_basics

object Functions extends App {

  // def FunctionName(parameter: type, parameter: type): ReturnType =
  def aFunction(a: String, b: Int): String =
    a +  " " + b

  // Compiler cam figure out the return type so we don't need to specify the return type

  def aFunctionBlock(a: String, b: Int): String = { // can also write as a block
    a +  " " + b
  }

  println(aFunction("hello", 4))  // Calling a function is also an expression

  //parameter less functions can also be call just by name
  // exmple: aFunction() == aFunction

  // Recursive function -> When you need loop use RECURSIVE FUNCTION
  def aRepeatedFunction(n: Int, aString: String): String = {
    if (n == 1) aString
    else aString + ' ' + aRepeatedFunction(n-1, aString)
  }

  // Though compiler can figure out the return type of a function, it cannot figure out the return type of a
  // recursive function. So it's a best practice to always specify the return type.
  println(aRepeatedFunction(3, "hello"))

  // Unit as return type -> defining a function that uses side effect
  def aFucntionWithSideEffect(aString: String): Unit = println(aString)

  aFucntionWithSideEffect("Side Effect")

  // code block also allow auxiliary function
  def aBigFunction(n: Int): Int = {

    def aSmallFunction(a: Int, b: Int): Int = a+b

    aSmallFunction(n, n-1)
  }



}
