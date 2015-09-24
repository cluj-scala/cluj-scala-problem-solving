import P31._

/*
Quadratic primes

https://projecteuler.net/problem=27
 */

object E027 extends App {

  case class Solution(a: Int, b: Int, n: Int)

  private def f(a: Int, b: Int, n: Int): Int = n*n + a*n + b

  private def cartesian(maxA : Int, maxB : Int) = for (a <- - maxA to maxA; b <- - maxB to maxB) yield (a,b)

  private def search(ab: Seq[(Int, Int)], n: Int): Solution = {
    if (ab.size == 1) {
      Solution(ab.head._1, ab.head._2, n)
    } else {
      val newAB = for ((a, b) <- ab; if f(a, b, n) isPrime) yield (a, b)
      search(newAB, n + 1)
    }
  }

  def quadraticPrimes(maxA : Int, maxB : Int): Solution = search(cartesian(maxA, maxB), 0)

  override def main (args: Array[String]) {
    val solution: Solution = quadraticPrimes(1700, 1700)
    println(s"The quadratic expression that produces the maximum number of primes is:  n² + ${solution.a}n + ${solution.b}")
  }

}
