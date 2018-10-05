package fintech.lesson03.examples

object Example04 extends App {
  trait Linked[T] {
    def head: T
    def tail: Linked[T]
    def isEmpty: Boolean

    def ::(value: T): Linked[T] = new Link(value, this)
  }

  class Empty[T] extends Linked[T] {
    def head: T = throw new NoSuchElementException
    def tail: Linked[T] = throw new NoSuchElementException
    def isEmpty: Boolean = true

    override def toString: String = "Empty"
  }

  class Link[T](value: T, elems: Linked[T]) extends Linked[T] {
    def head: T = value
    def tail: Linked[T] = elems
    def isEmpty: Boolean = false

    override def toString: String = s"$value :: $elems"
  }

  val list1 = "seven" :: "thirteen" :: "forty-two" :: "thirty-seven" :: new Empty[String]
  val list2 = "thirteen" :: "forty-two" :: "thirty-seven" :: new Empty[String]
  val list3 = "eighty-one" :: "forty-two" :: "thirty-seven" :: new Empty[String]

  def printDoubleStrings(strings: Linked[String]): Unit = {
    if (strings.isEmpty) ()
    else {
      val string = strings.head

      println(string + string)
      printDoubleStrings(strings.tail)
    }
  }

  def countStrings(strings: Linked[String]): Int = {
    def loop(c: Int, list: Linked[String]): Int = {
      if (list.isEmpty) c
      else loop(c + 1, list.tail)
    }

    loop(0, strings)
  }

  printDoubleStrings(list1)
  println(s"list1 contains ${countStrings(list1)} strings")
}
