/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

https://projecteuler.net/problem=1
 */

object E001 extends App {

  def sumMultiples(multiple: Int, n: Int): Int = 1 until n filter(_ % multiple == 0) sum

  def sumMultiplesOf3And5(n: Int): Int = sumMultiples(3, n) + sumMultiples(5, n)

  override def main (args: Array[String]) {
    val n: Int = 1000
    val sum: Int = sumMultiplesOf3And5(n)
    println(s"The sum of all the multiples of 3 or 5 below $n is $sum")
  }

}
