
/*
Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
Example:

scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*/
object P10 {
  def encode1[T](symbols: List[T]): List[(Int, T)] = symbols match {
    case s1 :: rest1 ⇒ encode1(rest1) match {
      case (c, s2) :: rest2 if (s1 == s2) ⇒ (c + 1, s2) :: rest2
      case s                              ⇒ (1, s1) :: s
    }
    case _           ⇒ Nil
  }

  def encode2[T](symbols: List[T]) = {
    def encode(symbols: List[(Int, T)]): List[(Int, T)] = symbols match {
      case (c, s1) :: (1, s2) :: rest if (s1 == s2) ⇒ encode((c + 1, s1) :: rest)
      case (c, s) :: rest                           ⇒ (c, s) :: encode(rest)
      case _                                        ⇒ Nil
    }
    encode(Stream.continually(1) zip symbols toList)
  }

  def encode3[T](symbols: List[T]) = {
    def aggregate(state: List[(Int, T)], event: T) = state match {
      case (c, s) :: rest if (s == event) ⇒ (c + 1, event) :: rest
      case (c, s) :: rest                 ⇒ (1, event) :: state
      case _                              ⇒ List((1, event))
    }
    symbols.foldLeft(List(): List[(Int, T)])(aggregate).reverse
  }
}
