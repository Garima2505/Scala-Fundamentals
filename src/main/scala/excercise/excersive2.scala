package excercise

object excersive2 extends App{

  // 1. Concatenate a string n times

  def stringConcatenation(str: String, n: Int): String = {

    def helper(strAccum: String, n: Int): String = {
      if (n == 0) strAccum
      else helper(str + strAccum, n - 1)
    }
    helper("", n)
  }

  println("exersise 1")
  println(stringConcatenation("hello ", 3))

  // 2. IsPrime function tail recursive

  def isPrime(n: Int): Boolean={

    def helper(div: Int): Boolean={
      if (div == 1)  true
      else if (n%div == 0) false
      else helper(div-1)
    }

    helper(n/2)
  }

  println(isPrime(2003))
  println(isPrime(6))

  // 3.Fibonacci Function Tail Recursion

  def fib(idx: Int): Int={

    def helper(n: Int, curr_accum: Int, prev_accum: Int): Int={
      if (n == idx) curr_accum
      else helper(n+1, curr_accum+prev_accum, curr_accum)
    }

    if (idx == 0) 1
    else helper(1, 1, 1)
  }

  println(fib(0))


}
