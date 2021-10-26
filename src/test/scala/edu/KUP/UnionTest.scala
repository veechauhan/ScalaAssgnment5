package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class UnionTest extends AnyFlatSpec {
  val obj = new Union
  //Case 1
  "Union" should "give Union of two sets " in {
    val set1: Set[Int] = Set(1, 5, 9, 9, 9, 9, 2)
    val set2: Set[Int] = Set(1, 2, 7, 7, 7, 9)
    val res = obj.unions(set1, set2)
    assert(res == set1.union(set2))
  }
  //Case 2 if we give one empty set
  "In Union, if we give one empty set " should "give Union of two sets " in {
    val set1: Set[Int] = Set()
    val set2: Set[Int] = Set(1, 2, 9)
    val res = obj.unions(set1, set2)
    assert(res == set1.union(set2))
  }
  // Case 3 If we give both sets empty
  "In Union, If we give both Sets empty" should "give Union of two sets " in {
    val set1: Set[Int] = Set()
    val set2: Set[Int] = Set()
    val res = obj.unions(set1, set2)
    assert(res == set1.union(set2))
  }
}
