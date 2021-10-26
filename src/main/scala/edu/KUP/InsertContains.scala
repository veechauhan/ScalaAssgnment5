package edu.KUP

abstract class IntTree

case object EmptyTree extends IntTree

case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

class InsertContains {
  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(elem, left, right) =>
      if (v > elem) Node(elem, left, insert(right, v))
      else if (v < elem) Node(elem, insert(left, v), right)
      else t

  }

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(elem, left, right) =>
      if (v < elem) contains(left, v)
      else if (v > elem) contains(right, v)
      else true
  }
}

