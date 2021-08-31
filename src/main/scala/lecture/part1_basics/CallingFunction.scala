package lecture.part1_basics

object CallingFunction extends App{

  def callByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callByName(x: => Long): Unit = { // calling by name as value is evaluated every time
    println("by value: " + x)
    println("by value: " + x)
  }

  callByValue(System.nanoTime())
  // Return identical value for both print statements

  callByName(System.nanoTime())
  // return different values for both the print statements
  // because value of x is evaluated twice
  // useful in Lazy streams

  // Call by Value: value is computed before call and same value used everywhere

  // Call by Name: expression is passed literally and expression is evaluated at every use within

}
