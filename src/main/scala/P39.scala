/*
Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.

http://aperiodic.net/phil/scala/s-99/
 */

object P39 {
  import P31._

  def listPrimes(r: Range): List[Int] = {
    val primes = 2 #:: Stream.from(3,2).filter(_.isPrime)
    primes.dropWhile(_ < r.head).takeWhile(_ <= r.last).toList
  }

}
