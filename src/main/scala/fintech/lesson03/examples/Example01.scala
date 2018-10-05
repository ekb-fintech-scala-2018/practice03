package fintech.lesson03.examples

object Example01 {

  trait IntList {
    def head: Int
    def tail: IntList
    def isEmpty: Boolean
  }

  def printSquares(ints: IntList): Unit = {
    if (ints.isEmpty) ()
    else {
      val int = ints.head

      println(int * int)
      printSquares(ints.tail)
    }
  }

  def countInts(ints: IntList): Int = {
    def loop(c: Int, list: IntList): Int = {
      if (list.isEmpty) c
      else loop(c + 1, list.tail)
    }

    loop(0, ints)
  }
}
