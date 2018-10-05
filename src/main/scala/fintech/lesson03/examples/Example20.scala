package fintech.lesson03.examples

import Example19._

object Example20 extends App {
  val doggie = new Dog
  doggie.eat(new DogFood)

  val cow = new Cow
  cow.eat(new Grass)

//  cow.eat(new doggie.Food)

//  val anotherDoggie = new Dog
//  anotherDoggie.eat(new doggie.Food)
//  anotherDoggie.eat(doggie.leftOvers)

  def tryToFeed(a: Animal, b: Animal): Unit = {
//    val f = new b.Food
//    b.eat(f)
//    b.eat(a.leftOvers)
    b.eat(b.leftOvers)
  }
}
