package fintech.lesson03.examples

import fintech.lesson03.examples.Example06.{Circle, Square}
import fintech.lesson03.examples.Example10.{Empty, Linked}
import fintech.lesson03.examples.Example11._

object Example12 {
  val circle1 = new Circle(1)
  val circle2 = new Circle(2)
  val square = new Square(44.5)

  val byRadius = new Comparator[Circle] {
    override def compare(o1: Circle, o2: Circle): Int = o1.r.compareTo(o2.r)
  }

  def maxCircle(circles: Linked[Circle], cmp: Comparator[Circle]): Circle =
    max(circles, cmp)

  def main(args: Array[String]): Unit = {
    println(maxCircle(circle1 :: circle2 :: Empty, byRadius))
    println(maxCircle(circle2 :: circle1 :: Empty, byRadius))
  }
}
