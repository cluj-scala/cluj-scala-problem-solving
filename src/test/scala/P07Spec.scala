import org.scalatest.{Matchers, FlatSpec}

/**
 * Flatten a list, spec.
 */
class P07Spec extends FlatSpec with Matchers {

  "a empty list " should "return a simple empty list" in {
    flatten(List()) should be(List())
  }

  "a list with one element " should "return a simple list" in {
    flatten(List(1)) should be(List(1))
  }

  "one level nested list " should "return a simple list" in {
    val probe = List(List(1, 2, 3, 4))
    println(flatten(probe))
    flatten(probe) should be(List(1, 2, 3, 4))
  }

  "n nested list " should "return a simple list" in {
    val probe = List(List(1, 1), 2, List(3, List(5, 8)))
    flatten(probe) should be(List(1, 1, 2, 3, 5, 8))
  }

  def flatten(probe: List[Any]): List[Any] = {
    probe match {
      case Nil => Nil
      case head :: Nil => flatOneElem(head)
      case head :: tail => {
        flatOneElem(head) ++ flatten(tail)
      }

    }
  }

  def flatOneElem(t: Any): List[Any]= t match {
    case x: List[Any] => flatten(x)
    case y => List(y)
  }
}
