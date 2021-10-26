package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class InterSectionTest extends AnyFlatSpec {
  val obj = new Intersection
  //Case 1
  "InterSection method " should "give intersection of two sets " in {
    val set1: Set[Int] = Set(1, 5, 9, 2)
    val set2: Set[Int] = Set(1, 2, 9)
    val res = obj.intersection(set1, set2)
    assert(res == set1.intersect(set2))
  }
  //Case 2 One Set is Empty
  "In Intersection method,if we give empty set" should "give intersection of two sets" in {
    val set1: Set[Int] = Set()
    val set2: Set[Int] = Set(1, 2, 2)
    val res = obj.intersection(set1, set2)
    assert(res == set1.intersect(set2))
  }
  "In Intersection method,if we give both empty sets" should "give intersection of two sets" in {
    val set1: Set[Int] = Set()
    val set2: Set[Int] = Set()
    val res = obj.intersection(set1, set2)
    assert(res == set1.intersect(set2))
  }
}
