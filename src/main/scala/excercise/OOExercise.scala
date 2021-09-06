package excercise

import java.io.Writer

object OOExercise extends App {

  val author = new Writer("charles", " John", 1987)
  val novel = new Novel("First Novel", 2076, author)
  println(novel.authorAge())
  println(novel.isWrittenBy(author))

  val count = new Counter(4)

  println(count.inc)
  print(count.inc(4))
}

// 1. Define Novel and Writer Class
// 2. Writer should have name, surname, year and a method to return Fullname
// 3. Novel: name, year of release, author(instance of Writer)
// - method authorAge: return age of author at that release time
// - isWrittenBy(author)
// - copy: new year of release = new instance of Novel

class Writer(val name: String, val surname: String, val year: Int){
  def fullname: String= name+" "+surname
}

class Novel(val name: String, val yearRelease: Int, var author: Writer){

  def authorAge(): Int= yearRelease - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel= new Novel(name, newYear, author)

}


// Create a counter class
// - receives an int value
// - method current count
// - overload inc/dec to receive an amount

class Counter(val count: Int){

  def inc = new Counter(count+1)  //immutability: Instances are fixed and cannot be modified

  def dec = new Counter(count-1)

  def inc(n: Int) = new Counter(count+n)

  def dec(n: Int) = new Counter(count-n)
}
