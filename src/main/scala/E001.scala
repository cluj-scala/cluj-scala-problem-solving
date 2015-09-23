/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

https://projecteuler.net/problem=1
 */

object E001 extends App {
  def sumMultiples(multiple: Int, n: Int) = 1 until n filter (_ % multiple == 0) sum
  def sumMultiplesOf3And5(n: Int) = sumMultiples(3, n) + sumMultiples(5, n) - sumMultiples(3 * 5, n)

  override def main (args: Array[String]) {
    val n = 1000
    val sum = sumMultiplesOf3And5(n)
    println(s"The sum of all the multiples of 3 or 5 below $n is $sum")
  }
}
