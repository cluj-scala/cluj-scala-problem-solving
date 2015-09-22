/*
Find the last but one element of a list.

http://aperiodic.net/phil/scala/s-99/
 */

object P02 {

  def penultimateBuiltin(elems: List[Int]): Option[Int] = elems.take(elems.size - 1).lastOption

  def penultimateRecursive[A](elems: List[A]): Option[A] = {
    elems match {
      case penultimate :: _ :: Nil => Some(penultimate)
      case _ :: tail => penultimateRecursive(tail)
      case _ => None
    }
  }

}
