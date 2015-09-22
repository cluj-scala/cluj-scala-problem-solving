import org.scalatest._

class P02Spec extends FlatSpec with Matchers {

  "penultimateBuiltin" should "return penultimate value" in {
    P02.penultimateBuiltin(List(1, 1, 2, 3, 5, 8)) should be(Some(5))
  }

  it should "return none if the list has one element" in {
    P02.penultimateBuiltin(List(1)) should be(None)
  }

  it should "return none if the list is empty" in {
    P02.penultimateBuiltin(List()) should be(None)
  }

  "penultimateRecursive" should "return penultimate value" in {
    P02.penultimateRecursive(List(1, 1, 2, 3, 5, 8)) should be(Some(5))
  }

  it should "return none if the list has one element" in {
    P02.penultimateRecursive(List(1)) should be(None)
  }

  it should "return none if the list is empty" in {
    P02.penultimateRecursive(List()) should be(None)
  }

}

