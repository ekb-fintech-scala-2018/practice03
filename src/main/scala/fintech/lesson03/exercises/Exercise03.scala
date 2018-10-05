package fintech.lesson03.exercises

import fintech.lesson03.examples.Example06.{Circle, Shape, Square}
import fintech.lesson03.examples.Example10.{Empty, Linked}

object Exercise03 {
  // Напишите интерфейс Printer[-T]. Принтер должен содержать один метод: "print(o: T): Unit",
  // который должен уметь выводить на экран объект типа Т
  // Реализуйте интерфейс для классов Example06.Square, Example06.Circle и Example06.Shape
  // Напишите метод printCircles который принимает на вход Linked[Circle] и Printer[Circle]
  // и выводит информацию о всех окружностях на экран
  // Покажите что вы можете передать Printer[Shape] вместо Printer[Circle]


  def main(args: Array[String]): Unit = {
//    val circles = new Circle(1) :: new Circle(2) :: Empty
//
//    printCircles(circles, circlePrinter)
//    printCircles(circles, shapePrinter)
  }
}
