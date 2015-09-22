import org.scalatest._

class E001Spec extends FlatSpec with Matchers {

  "sumMultiplesOf3And5" should "should return 23 for multiples below 10" in {
    E001.sumMultiplesOf3And5(10) should be(23)
  }

  it should "should return 0 for multiples below 2" in {
    E001.sumMultiplesOf3And5(2) should be(0)
  }

}

