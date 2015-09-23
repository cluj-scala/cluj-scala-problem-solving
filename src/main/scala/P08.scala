/*
If a list contains repeated elements they should be replaced with a single copy of the element.
The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */

object P08 {
  def compress[T](symbols: List[T]): List[T] = symbols match {
    case a :: b :: rest if (a == b) ⇒ compress(a :: rest)
    case a :: rest                  ⇒ a :: compress(rest)
    case Nil                        ⇒ Nil
  }
}
