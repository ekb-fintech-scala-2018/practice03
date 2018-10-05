package fintech.lesson03.examples

import fintech.lesson03.examples.Example06.{Circle, Shape, Square}
import fintech.lesson03.examples.Example10.{Empty, Linked}

object Example14 extends App {
  val circle1 = new Circle(1)
  val circle2 = new Circle(2)
  val square = new Square(1)

  trait Comparator[-T] {
    def compare(o1: T, o2: T): Int
  }

  def max[T](list: Linked[T], cmp: Comparator[T]): T = {
    def loop(m: T, current: Linked[T]): T =
      if (current.isEmpty) m
      else {
        val newMax = if (cmp.compare(m, current.head) >= 0) m else current.head
        loop(newMax, current.tail)
      }

    if (list.isEmpty) throw new NoSuchElementException
    else loop(list.head, list.tail)
  }

  val byPerimeter = new Comparator[Shape] {
    override def compare(o1: Shape, o2: Shape): Int = o1.perimeter.compareTo(o2.perimeter)
  }

  val byRadius = new Comparator[Circle] {
    override def compare(o1: Circle, o2: Circle): Int = o1.r.compareTo(o2.r)
  }

  def maxCircle(circles: Linked[Circle], cmp: Comparator[Circle]): Circle =
    max(circles, cmp)

  println(maxCircle(circle1 :: circle2 :: Empty, byRadius))
  println(maxCircle(circle1 :: circle2 :: Empty, byPerimeter))
}
