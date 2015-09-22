import org.scalatest._

class P03Spec extends FlatSpec with Matchers {

  "nthBuiltin" should "return nth value if it exists" in {
    P03.nthBuiltin(2, List(1, 1, 2, 3, 5, 8)) should be(Some(2))
  }

  it should "return none if the list has less than requested elements" in {
    P03.nthBuiltin(2, List(1, 1)) should be(None)
  }

  it should "return none if the list is empty" in {
    P03.nthBuiltin(2, List()) should be(None)
  }

  "nthRecursive" should "return nth value if it exists" in {
    P03.nthRecursive(2, List(1, 1, 2, 3, 5, 8)) should be(Some(2))
  }

  it should "return none if the list has less than requested elements" in {
    P03.nthRecursive(2, List(1, 1)) should be(None)
  }

  it should "return none if the list is empty" in {
    P03.nthRecursive(2, List()) should be(None)
  }

}

