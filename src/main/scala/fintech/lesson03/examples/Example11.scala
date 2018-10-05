package fintech.lesson03.examples

import fintech.lesson03.examples.Example10.Linked

object Example11 {

  trait Comparator[T] {
    def compare(o1: T, o2: T): Int
  }

  def max[T](list: Linked[T], cmp: Comparator[T]): T = {
    def loop(m: T, current: Linked[T]): T =
      if (current.isEmpty) m
      else {
        val newMax = if (cmp.compare(m, current.head) >= 0) m else current.head
        loop(newMax, current.tail)
      }

    if (list.isEmpty) throw new NoSuchElementException
    else loop(list.head, list.tail)
  }
}
