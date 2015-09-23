import scala.collection.immutable.IndexedSeq

/*
Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.

https://projecteuler.net/problem=4
 */

object E004 extends App {

  case class ProductPalindrome(factor1: Int, factor2: Int, palindrome: Int)

  implicit class E004Int(val n: Int) {
    def isPalindrome: Boolean = {
      val ns = n.toString
      ns == ns.reverse
    }
  }

  def largestProductPalindrome(digits: Int): Option[ProductPalindrome] = {
    val limit: Int = math.pow(10, digits).toInt
    def palindromes(i: Int, j: Int): Option[ProductPalindrome] = {
      if (i <= 0 && j<= 0) None
      else if (i > 0 && j > 0 && (i * j isPalindrome)) Some(ProductPalindrome(i, j, i * j))
      else if (j == 0) palindromes(i - 1, limit - 1)
      else palindromes(i, j - 1)
    }
    if (digits > 0) palindromes(limit, limit) else None
  }

  override def main (args: Array[String]) {
    val digits: Int = 3
    val result = largestProductPalindrome(digits)
    result match {
      case Some(r) =>
        println(s"The largest palindrome made from the product of two $digits-digit numbers is: ${r.palindrome} = ${r.factor1} x ${r.factor2}")
      case None => println("There is no largest palindrome as the product of two numbers")
    }

  }

}
