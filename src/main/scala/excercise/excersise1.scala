package excercise

import java.security.KeyStore.TrustedCertificateEntry

object excersise1 extends App {

  // Greeting Function (name, age)
  def greeting(name: String, age: Int): Unit = {
    print("Hi, my name is " + name + " I'm " + age + " year old")
  }
  greeting("sam", 12)

  println(greeting("sam", 5))

  // Factorial Function
  def factorial(x : Int): Int = {

    if (x == 1) 1 else x * factorial(x-1)
  }

  println(factorial(4))

  // Fibonacci
  def fibonacci(x: Int): Int = {
    if ((x == 1) || (x == 2)) 1
    else fibonacci(x - 1) + fibonacci(x - 2)

  }

  println(fibonacci(4))


  // Check Prime
  def checkPrime(x: Int): Boolean = {

      def repeat(n: Int): Boolean = {
        if (n<= 1) true
        else x%n != 0 && repeat(n-1)

      }
    repeat(x/2)
  }

  println(checkPrime(2))
  println(checkPrime(6))

}
