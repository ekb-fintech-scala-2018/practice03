package fintech.lesson03.examples

import fintech.lesson03.examples.Example10.{Empty, Linked}
import fintech.lesson03.examples.Example16.{Reducer, sum}

object Example17 extends App {
  val linkedReducer = new Reducer[Linked] {
    def reduce[T](list: Linked[T], default: T)(f: (T, T) => T): T = {
      if (list.isEmpty) default
      else {
        val newDefault = f(default, list.head)
        reduce(list.tail, newDefault)(f)
      }
    }
  }

  val optionReducer = new Reducer[Option] {
    def reduce[T](option: Option[T], default: T)(f: (T, T) => T): T = {
      option.getOrElse(default)
    }
  }

  val list = 1 :: 2 :: 3 :: Empty
  val some: Option[Int] = Some(37)
  val none: Option[Int] = None

  println("Sum of list: " + sum(list, linkedReducer))
  println("Sum of some: " + sum(some, optionReducer))
  println("Sum of none: " + sum(none, optionReducer))
}
