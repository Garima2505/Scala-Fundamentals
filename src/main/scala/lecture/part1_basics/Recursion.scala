package lecture.part1_basics

object Recursion extends App {

  // recursive function
  def factorial(x: Int): Int =
    if (x <= 1) 1 else x * factorial(x-1)

  // In order to run a recursive function the java virtual machine on top of which scala run
  // uses a call stack to keep partial results so that it can get back to computing the
  // desired results. so each call of the recursive function uses what we call a stack frame.
  // However JVM keeps all the stack to the internal memory which is limits which often led
  // to stack overflow error.
  // Stack overflow error: happens when the recursive depth is too big

  // To resolve this issue we need to write our code smartly

  def anotherFactorial(n: Int): Int = {

    def factHelper(x: Int, accumulator: Int): Int = {
      if (x==1) accumulator
      else factHelper(x-1, x*accumulator)
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(4))

  /*

   */

}
