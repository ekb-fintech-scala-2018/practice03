package fintech.lesson03.examples

object Example19 {
  trait Animal {
    type Food
    def eat(f: Food): Unit = ()
    def leftOvers: Food
  }

  class Grass
  class Cow extends Animal {
    type Food = Grass

    override def leftOvers: Grass = new Grass
  }

  class DogFood
  class Dog extends Animal {
    type Food = DogFood

    override def leftOvers: DogFood = new DogFood
  }
}
