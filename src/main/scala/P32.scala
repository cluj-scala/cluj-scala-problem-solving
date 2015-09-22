/*
Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.

http://aperiodic.net/phil/scala/s-99/
 */

object P32 {

  def gcd(a: Int, b: Int): Int = if  (b == 0) a else gcd(b, a % b)

}
