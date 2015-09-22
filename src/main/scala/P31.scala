/*
Find the last element of a list.

http://aperiodic.net/phil/scala/s-99/
 */

object P31 {

  implicit class P31Int(val i: Int) {
    def isPrime: Boolean = {
      def noDivisorExists: Boolean = {
        val possibleDivisors: Range = 2 to math.sqrt(i).toInt
        !(possibleDivisors exists (div => i % div == 0))
      }
      if (i <= 1) false
      else if (i == 2) true
      else noDivisorExists
    }
  }

}
