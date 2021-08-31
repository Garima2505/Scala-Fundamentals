package lecture.part1_basics

object DefaultAndNamedArguments extends App {

  def trFact(n: Int, acc: Int = 1): Int = { // assigned default value
    if (n <= 1) acc
    else trFact(n-1, n*acc)
  }

  println(trFact(4))

  println(trFact(4, 2)) // overwrite default value

  // Default values are useful when we have a function that is called many many times with same parameters
  // To pass later arguments, there are two methods:
  // 1. pass in every leading argument
  // 2. name the arguments

  def greet(name: String = "Superman", age: Int = 3): String = {
    s"Hi, I'm $name, and I'm $age year old."
  }

  print(greet(age = 10))


}
