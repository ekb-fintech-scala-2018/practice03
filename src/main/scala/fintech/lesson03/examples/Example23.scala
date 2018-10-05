package fintech.lesson03.examples

import fintech.lesson03.examples.Example16.Reducer

object Example23 extends App {

//  trait Either[A, B]
//  val eitherReducer: Reducer[Either] = ???

  type StringOr[A] = Either[String, A]
  val stringOrReducer: Reducer[StringOr] = ???


  def bOrReducer[B]: Reducer[({type BOr[A] = Either[B, A]})#BOr] = ???


  val string1OrReducer: Reducer[({type StringOr[A] = Either[String, A]})#StringOr] = ???

  // build.sbt
  // addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.8")

//  def projectedBOrReducer[B]: Reducer[Either[B, ?]] = ???
}
