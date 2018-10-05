package fintech.lesson03.examples

import fintech.lesson03.examples.Example06.{Circle, Square}
import scala.language.reflectiveCalls

object Example22 extends App {

  def printX(somethingWithX: { def x: Double }): Unit = println(somethingWithX.x)

  printX(new Square(1))
//  printX(new Circle(1))
}
