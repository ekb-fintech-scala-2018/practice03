package fintech.lesson03.examples

import fintech.lesson03.examples.Example04.{Empty, Linked}
import fintech.lesson03.examples.Example05.count
import fintech.lesson03.examples.Example06.{Circle, Shape, Square}

object Example09 {

//  trait CovariantLinked[+T] {
//    def head: T
//    def tail: CovariantLinked[T]
//    def isEmpty: Boolean
//
//    def ::(value: T): CovariantLinked[T] = ???
//  }

  // Square <: Shape =/=> Linked[Square] <: Linked[Shape]

  val circle = new Circle(1)
  val square = new Square(1)

  val list: Linked[Shape] = square :: new Empty
//  val list: Linked[Square] = square :: new Empty

  val b = list.isEmpty
  val h = list.head
  val n = list.::(circle)

//  def countShapes(shapes: Linked[Shape]): Int =
//    count(shapes)
//
//  val squares: Linked[Square] = square :: new Empty
//    countShapes(squares)
}
