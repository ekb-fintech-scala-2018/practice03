package fintech.lesson03.examples

import fintech.lesson03.examples.Example06.Shape
import fintech.lesson03.examples.Example10.Empty
import fintech.lesson03.examples.Example11.Comparator
import fintech.lesson03.examples.Example12._

object Example13 extends App {

  val byPerimeter = new Comparator[Shape] {
    override def compare(o1: Shape, o2: Shape): Int = o1.perimeter.compareTo(o2.perimeter)
  }

//  println(maxCircle(circle1 :: circle2 :: Empty, byPerimeter))
//  println(maxCircle(circle2 :: circle1 :: Empty, byPerimeter))
}
