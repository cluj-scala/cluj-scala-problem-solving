import org.scalatest._

class P32Spec extends FlatSpec with Matchers {

  "gcd" should "be 9 for a=36 and b=63" in {
    P32.gcd(36, 63) should be(9)
  }

  it should "be 6 for a=12 and b=90" in {
    P32.gcd(12, 90) should be(6)
  }

  it should "be 1 for a=3 and b=5" in {
    P32.gcd(3, 5) should be(1)
  }

}

