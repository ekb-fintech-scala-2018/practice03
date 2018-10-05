package fintech.lesson03.examples

import fintech.lesson03.examples.Example10.Linked

object Example18 {
  type IntMatrix = Linked[Linked[Int]]

  trait Animal[E, P]

  class Grass
  class Milk
  class Wool

  class Cow extends Animal[Grass, Milk]

  type GrassEater[P] = Animal[Grass, P]

  class Sheep extends GrassEater[Wool]
}
