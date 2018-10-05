package fintech.lesson03.examples

import fintech.lesson03.examples.Example19._

object Example21 extends App {
  val doggie = new Dog

  def feed(food: Dog#Food, dog: Dog): Unit = {
    dog.eat(food)
  }

  feed(new DogFood, doggie)
}
