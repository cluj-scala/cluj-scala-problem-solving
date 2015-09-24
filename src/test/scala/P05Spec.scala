import org.scalatest.PropSpec
import org.scalatest.prop.GeneratorDrivenPropertyChecks

import P05._

class P05Spec extends PropSpec with GeneratorDrivenPropertyChecks {

  def Reference(implName: String, f: List[Int] => List[Int]) = {
    property("[Compare with reference" + " {" + implName + "}" + "] reverse = s.reverse ") {
      forAll() { ls: List[Int] =>
        f(ls) == ls.reverse
      }
    }
  }

  def Involution(implName: String, f: List[Int] => List[Int]) = {
    property("[Involution" + " {" + implName + "}" + "] reverse . reverse = id") {
      forAll() { ls: List[Int] =>
        f(f(ls)) == ls
      }
    }
  }

  private val implementations: List[(String,List[Int] => List[Int])] =
    List(("reverseC",reverseC:List[Int] => List[Int]),
         ("reverseR", reverseR:List[Int] => List[Int]),
         ("ReverseFoldL",reverseFoldL:List[Int] => List[Int]))

  implementations.foreach(f => propertiesFor((Involution _).tupled(f)))
  implementations.foreach(f => propertiesFor((Reference _).tupled(f)))
}
