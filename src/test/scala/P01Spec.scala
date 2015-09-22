import org.scalatest._

class P01Spec extends FlatSpec with Matchers {
  "lastBuiltin" should "return last value" in {
    P01.lastBuiltin(List(1, 1, 2, 3, 5, 8)) should be(Some(8))
  }

  it should "return none if there is no value" in {
    P01.lastBuiltin(List()) should be(None)
  }

  "lastRecursive" should "return last value" in {
    P01.lastRecursive(List(1, 1, 2, 3, 5, 8)) should be(Some(8))
  }

  it should "return none if there is no value" in {
    P01.lastRecursive(List()) should be(None)
  }

}

