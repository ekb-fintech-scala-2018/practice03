package fintech.lesson03.examples

import fintech.lesson03.examples.Example01.{IntList, countInts, printSquares}

object Example02 extends App {
  object NoInts extends IntList {
    def head: Int = throw new NoSuchElementException
    def tail: IntList = throw new NoSuchElementException
    def isEmpty: Boolean = true
  }

  class LinkedInt(int: Int, ints: IntList) extends IntList {
    def head: Int = int
    def tail: IntList = ints
    def isEmpty: Boolean = false
  }

  implicit class RichIntList(private val ints: IntList) extends AnyVal {
    def ::(int: Int): IntList = new LinkedInt(int, ints)
  }

  val list1 = 7 :: 13 :: 42 :: 37 :: NoInts
  val list2 = 13 :: 42 :: 37 :: NoInts
  val list3 = 81 :: 42 :: 37 :: NoInts

  printSquares(list1)
  println(s"list1 contains ${countInts(list1)} ints")
}
