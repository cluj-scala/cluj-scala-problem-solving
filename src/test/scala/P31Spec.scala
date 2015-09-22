import org.scalatest._
import P31._

class P31Spec extends FlatSpec with Matchers {

  "isPrime" should "say that 3 is prime" in {
    3.isPrime should be(true)
  }

  it should "say that 47 is prime" in {
    47.isPrime should be(true)
  }

  it should "say that 997 is prime" in {
    997.isPrime should be(true)
  }

  it should "say that 9 is not prime" in {
    9.isPrime should be(false)
  }

  it should "say that 951 is not prime" in {
    951.isPrime should be(false)
  }

  it should "say that 996 is not prime" in {
    996.isPrime should be(false)
  }

}

