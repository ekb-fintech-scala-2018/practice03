package fintech.lesson03.examples

import fintech.lesson03.examples.Example04.{Empty, Linked}
import fintech.lesson03.examples.Example05.foreach
import fintech.lesson03.examples.Example06._

object Example07 extends App {
  def printAll[T](list: Linked[_]): Unit =
    foreach(list) {
      case t: T => println(t)
      case _ =>
    }

  def printCircles(list: Linked[_]): Unit =
    list match {
      case dogs: Linked[Circle] => foreach(dogs)(d => println(d.perimeter))
    }

  val circle = new Circle(1)
  val square = new Square(1)

  val list = circle :: square :: new Empty[Shape]

  println("printAll[Circle]")
  printAll[Circle](list)

  println("printCircles")
  printCircles(list)
}
