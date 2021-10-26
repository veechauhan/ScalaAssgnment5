package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class InsertContainsTest extends AnyFlatSpec {
  val obj = new InsertContains
  //Case 1
  "we are Inserting values in Tree " should "give Tree" in {
    val tree = obj.insert(EmptyTree, 3)
    assert(tree == Node(3, EmptyTree, EmptyTree))
  }
  //case 2
  "we are Inserting multiple values in Tree " should "give Tree" in {
    val tree = obj.insert(obj.insert(obj.insert(EmptyTree, 10), 11), 12)
    assert(tree == Node(10, EmptyTree, Node(11, EmptyTree, Node(12, EmptyTree, EmptyTree))))
  }
  //case 3
  "Searching  12 element in Tree " should "give Tree" in {
    val tree = obj.insert(obj.insert(obj.insert(EmptyTree, 10), 11), 12)
    assert(obj.contains(tree, 12) == true)
  }
  //case 4
  "Searching  20 element in Tree " should "give Tree" in {
    val tree = obj.insert(obj.insert(obj.insert(EmptyTree, 10), 11), 12)
    assert(obj.contains(tree, 20) == false)
  }

}
