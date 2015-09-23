import org.scalatest._

class P10Spec extends FlatSpec with Matchers {
  "encode1" should "the run-length encoding of the list" in {
    P10.encode1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
  
  "encode2" should "the run-length encoding of the list" in {
    P10.encode2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
  
  "encode3" should "the run-length encoding of the list" in {
    P10.encode3(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}

