package fintech.lesson03.examples

object Example06 extends App {

  trait Shape {
    def perimeter: Double
  }

  class Square(val x: Double) extends Shape {
    def perimeter: Double = x * x
  }

  class Circle(val r: Double) extends Shape {
    def perimeter: Double = 2 * Math.PI * r
  }


  class Building[T <: Shape](scale: Double) {
    def materialsCost(shape: T): Double =
      shape.perimeter * 42 * scale

    def scaledDown: Building[T] =
      new Building[T](scale * 10)
  }

  val squareBuilding = new Building[Square](1.0)

  println(squareBuilding.materialsCost(new Square(13)))
}
