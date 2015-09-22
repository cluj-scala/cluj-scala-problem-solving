/*
Find the Kth element of a list.
By convention, the first element in the list is element 0.

http://aperiodic.net/phil/scala/s-99/
 */

object P03 {

  def nthBuiltin(n: Int, elems: List[Int]): Option[Int] = elems.lift(n)

  def nthRecursive(n: Int, elems: List[Int]): Option[Int] = {
    elems match {
      case head :: _ if n == 0 => Some(head)
      case _ :: tail => nthRecursive(n - 1, tail)
      case _ => None
    }
  }

}
