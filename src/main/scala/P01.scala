/*
Find the last element of a list.

http://aperiodic.net/phil/scala/s-99/
 */

object P01 {

  def lastBuiltin[A](elems: List[A]): Option[A] = elems.lastOption

  def lastRecursive[A](elems: List[A]): Option[A] = {
    elems match {
      case last :: Nil => Some(last)
      case _ :: tail => lastRecursive(tail)
      case _ => None
    }
  }

}
