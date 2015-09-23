import E004.ProductPalindrome
import org.scalatest._

class E004Spec extends FlatSpec with Matchers {

  "largestProductPalindrome" should "be 9009 = 91 × 99 for 2 digit-numbers" in {
    E004.largestProductPalindrome(2) should be(Some(ProductPalindrome(99, 91, 9009)))
  }

  it should "be 9 = 9 × 1 for 1 digit-numbers" in {
    E004.largestProductPalindrome(1) should be(Some(ProductPalindrome(9, 1, 9)))
  }

  it should "not exist for 0 digit-numbers" in {
    E004.largestProductPalindrome(0) should be(None)
  }

}

