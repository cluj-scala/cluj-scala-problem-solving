import org.scalatest._

class P39Spec extends FlatSpec with Matchers {

  "listPrimes" should "return List(7, 11, 13, 17, 19, 23, 29, 31) for range 7 to 31" in {
    P39.listPrimes(7 to 31) should be(List(7, 11, 13, 17, 19, 23, 29, 31))
  }

  it should "return List() for range 8 to 8" in {
    P39.listPrimes(8 to 9) should be(List())
  }

  it should "return List(7) for range 7 to 7" in {
    P39.listPrimes(7 to 7) should be(List(7))
  }

}

