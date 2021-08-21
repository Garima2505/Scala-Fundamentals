package lecture.part1_basics

import scala.annotation.tailrec

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
    @tailrec    // tell the compiler that the given function is a recursive
    def factHelper(x: Int, accumulator: Int): Int = {
      if (x==1) accumulator
      else factHelper(x-1, x*accumulator)     //TAIL RECURSION - use the recursive call as the last expression
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(4))

  /*
  anotherFactorial(10) = factHelper(10,1)
                       = factHelper(9, 1*10)
                       = factHelper(8, 1*10*9)
                       = factHelper(7, 1*10*9*8)
                       ...
   */

}
