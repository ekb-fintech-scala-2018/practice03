package fintech.lesson03.examples

object Example15 extends App {
  trait Factory[-Input, Temporary, +Output] {
    def stage1(in: Input): Temporary
    def stage2(t: Temporary): Output
  }

  trait StorageUnit[+Stuff] {
    def addClient(f: Factory[Stuff, Int, Int]): String
  }
}
