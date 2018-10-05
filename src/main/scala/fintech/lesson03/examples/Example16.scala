package fintech.lesson03.examples

object Example16 extends App {
  trait Reducer[F[_]] {
    def reduce[T](ft: F[T], default: T)(f: (T, T) => T): T
  }

  def sum[F[_]](ft: F[Int], reducer: Reducer[F]): Int =
    reducer.reduce(ft, 0) {
      (a, b) => a + b
    }
}
