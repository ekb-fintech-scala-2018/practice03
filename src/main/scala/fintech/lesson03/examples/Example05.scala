package fintech.lesson03.examples

import fintech.lesson03.examples.Example04.{Empty, Linked}

object Example05 extends App {

  def count[T](ts: Linked[T]): Int = {
    def loop(c: Int, list: Linked[T]): Int = {
      if (list.isEmpty) c
      else loop(c + 1, list.tail)
    }

    loop(0, ts)
  }
//  def count1(list: Linked[_]): Int = ???

  def foreach[T](list: Linked[T])(f: T => Unit): Unit = {
    if (list.isEmpty) ()
    else {
      f(list.head)
      foreach(list.tail)(f)
    }
  }

  def printDoubleStrings(strings: Linked[String]): Unit = {
    foreach(strings) { s =>
      println(s + s)
    }
  }

  val list1 = "seven" :: "thirteen" :: "forty-two" :: "thirty-seven" :: new Empty[String]
  printDoubleStrings(list1)
  println(s"list1 contains ${count(list1)} strings")
}
