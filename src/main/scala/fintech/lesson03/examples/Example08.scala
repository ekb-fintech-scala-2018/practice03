package fintech.lesson03.examples

object Example08 {
  trait Linked[@specialized(Int, Double, Boolean) T] {
    def head: T
    def tail: Linked[T]
    def isEmpty: Boolean
  }

  def count[@specialized T](ts: Linked[T]): Int = {
    def loop(c: Int, list: Linked[T]): Int = {
      if (list.isEmpty) c
      else loop(c + 1, list.tail)
    }

    loop(0, ts)
  }
}
