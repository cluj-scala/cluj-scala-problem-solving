/*
Reverse a list.
 */
object P05 {

  def reverseC[A](ls: List[A]): List[A] = {
    def reverse(xss: List[A], cont: List[A] => List[A]): List[A] = xss match {
      case Nil     => cont(Nil)
      case x :: xs => reverse(xs, ((ys: List[A]) => x :: ys) compose cont)
    }

    reverse(ls,identity)
  }

  def reverseFoldL[A](xss: List[A]): List[A] = xss.foldLeft(Nil: List[A])((a: List[A],b: A) => b :: a)

  def reverseR[A](ls: List[A]): List[A] = {
    def reverse(xss: List[A], res: List[A]): List[A] = xss match {
      case Nil     => res
      case x :: xs => reverse(xs, x :: res)
    }

    reverse(ls,Nil)
  }
}
