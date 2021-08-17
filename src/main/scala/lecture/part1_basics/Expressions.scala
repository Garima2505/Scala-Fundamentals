package lecture.part1_basics

import java.security.KeyStore.TrustedCertificateEntry

object Expressions extends App {

  // Expression
  val x = 1 + 2

  println(x)

  // operation => + - * & << >> >>> (right shift with zero extension)

  // logical == != >=  < <=
  println(1==x)

  // boolean for logic  ! && ||
  // ! - logical negation

  var y = 2
  y += 3 // also works work  -= *= /= ..... side effects
  print(y)

  // Instruction VS Expression

  // instruction is telling the computer to "do" something - Python or java
  // Expression is something that has value and/or a type, i.e. every bit of code computes a value -
  // 'If' in scala is expression
  //Example:
  val aCondition = true

  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSION -> GIVES BACK A VALUE
  println(aConditionValue)

  // loops create side effects
  //LOOPS -> side effects, return Unit

  var i = 0
  while (i<10){
    println(i)
    i+=1
  }

  // loops are specific to imperative programming eg: java or python
  // In scala everything is expression (excepts val, class, package)


  // Void/ Null values
  var aVariable = 3
  val aWeirdNumber = (aVariable = 3) // return Unit == Void
  println(aWeirdNumber)

  // null is scala is a empty expression -> ()
  // side effects: println(), whiles, reassigning

  //CODE BLOCK = also an expression

  val aCodeBlock = {    // return value of last expression
    val a = 2
    val b = y+1

    if (b>2) "hello" else "bye"
  }

  println(aCodeBlock)



}
