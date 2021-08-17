package lecture.part1_basics

object Functions extends App {

  // def FunctionName(parameter: type, parameter: type): ReturnType =
  def aFunction(a: String, b: Int): String =
    a +  " " + b


  def aFunctionBlock(a: String, b: Int): String = { // can also write as a block
    a +  " " + b
  }

  println(aFunction("hello", 4))

}
