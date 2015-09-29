/*
Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method.
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
Example:

scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*/

import scala.Stream.continually
import scala.collection.{+:, :+}

object P10 {
  def encode1[T](symbols: Seq[T]): Seq[(Int, T)] = symbols match {
    case Nil        ⇒ Nil
    case s +: rest1 ⇒ encode1(rest1) match {
      case (c, `s`) +: rest ⇒ (c + 1, s) +: rest
      case rest             ⇒ (1, s) +: rest
    }
  }

  def encode2[T](symbols: Seq[T]) = {
    def encode(symbols: Seq[(Int, T)]): Seq[(Int, T)] = symbols match {
      case (c, s1) +: (_, s2) +: rest if (s1 == s2) ⇒ encode((c + 1, s1) +: rest)
      case h +: rest                                ⇒ h +: encode(rest)
      case Nil                                      ⇒ Nil
    }
    encode(continually(1) zip symbols)
  }

  def encode3[T](symbols: Seq[T]) = (Seq[(Int, T)]() /: symbols) { (acc, s) ⇒ acc match {
    case heads :+ ((c, `s`)) ⇒ heads :+ (c + 1, s)
    case _                   ⇒ acc :+ (1, s)
  }}
}
