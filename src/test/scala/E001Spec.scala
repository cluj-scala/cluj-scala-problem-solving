import org.scalatest._

class E001Spec extends FlatSpec with Matchers {
  "sumMultiplesOf3And5" should "return 23 for multiples below 10" in {
    E001.sumMultiplesOf3And5(10) should be(23)
  }

  it should "return 0 for multiples below 2" in {
    E001.sumMultiplesOf3And5(2) should be(0)
  }

  it should "return 60 for multiples below 16" in {
    E001.sumMultiplesOf3And5(16) should be(60)
  }
}