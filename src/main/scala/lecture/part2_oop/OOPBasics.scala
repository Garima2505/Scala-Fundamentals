package lecture.part2_oop

object OOPBasics extends App {

  val person = new Person("john", 20) // initialize class Person - concreat realization of class
  println(person)

  val person2 = new Person2("sam", 40)
  println(person2.age)

  val person3 = new Person3("josh", 36)
  person3.greet()
  person3.greet("Danial")

}

// class definition- classes are like a blueprint of how things look like (data) and
// how things works (behaviour/ functionality)

class Person(name: String, age: Int) // constructor with class parameters

// class parameters are not Fields
// to add class parameters to Fields add val or var

class Person2(name: String, val age: Int)// constructor with class fields. Fields can be get using '.' operator

class Person3(name: String, val age: Int){
  // body

  val x = 2 // val and var definitions inside a class are called Fields
  println(x)

  // define function is a class
  def greet(name: String = name): Unit = {
    println(s"$name says hello ${this.name}!")
  }

  // Overloading means defining methods with same name but different signature
  def greet(): Unit = println("hello world!")

  // However the compiler will confuse when we have same function and signature but different
  // return types

  // In scala, we can implement multiple constructors using this
  def this(name : String) = this(name, 0) // call primary constructor to define secondary constructor
}
