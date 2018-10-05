package fintech.lesson03.examples

object Example03 extends App {
  trait StringList {
    def head: String
    def tail: StringList
    def isEmpty: Boolean
  }

  object NoStrings extends StringList {
    def head: String = throw new NoSuchElementException
    def tail: StringList = throw new NoSuchElementException
    def isEmpty: Boolean = true
  }

  class LinkedString(string: String, strings: StringList) extends StringList {
    def head: String = string
    def tail: StringList = strings
    def isEmpty: Boolean = false
  }

  implicit class RichStringList(private val strings: StringList) extends AnyVal {
    def ::(string: String): StringList = new LinkedString(string, strings)
  }

  val list1 = "seven" :: "thirteen" :: "forty-two" :: "thirty-seven" :: NoStrings
  val list2 = "thirteen" :: "forty-two" :: "thirty-seven" :: NoStrings
  val list3 = "eighty-one" :: "forty-two" :: "thirty-seven" :: NoStrings

  def printDoubleStrings(strings: StringList): Unit = {
    if (strings.isEmpty) ()
    else {
      val string = strings.head

      println(string + string)
      printDoubleStrings(strings.tail)
    }
  }

  def countStrings(strings: StringList): Int = {
    def loop(c: Int, list: StringList): Int = {
      if (list.isEmpty) c
      else loop(c + 1, list.tail)
    }

    loop(0, strings)
  }

  printDoubleStrings(list1)
  println(s"list1 contains ${countStrings(list1)} strings")
}
