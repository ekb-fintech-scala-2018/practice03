package fintech.lesson03.examples

import fintech.lesson03.examples.Example06._
object Example10 extends App {

  trait Linked[+T] {
    def head: T
    def tail: Linked[T]
    def isEmpty: Boolean

    def ::[U >: T](value: U): Linked[U] = new Link(value, this)
  }

  class Link[T](value: T, elems: Linked[T]) extends Linked[T] {
    def head: T = value
    def tail: Linked[T] = elems
    def isEmpty: Boolean = false
  }

  object Empty extends Linked[Nothing] {
    def head: Nothing = throw new NoSuchElementException
    def tail: Linked[Nothing] = throw new NoSuchElementException
    def isEmpty: Boolean = true
  }

  val square = new Square(1)
  val circle = new Circle(1)

  val squares: Linked[Square] = square :: Empty
  val shapes = circle :: squares

  def count[T](ts: Linked[T]): Int = {
    def loop(c: Int, list: Linked[T]): Int = {
      if (list.isEmpty) c
      else loop(c + 1, list.tail)
    }

    loop(0, ts)
  }

  def countShapes(shapes: Linked[Shape]): Int =
    count(shapes)

  println(countShapes(squares))
}
