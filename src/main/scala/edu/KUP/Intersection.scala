package edu.KUP

import scala.annotation.tailrec

class Intersection {
  def intersection(set1: Set[Int], set2: Set[Int]): Set[Int] = {
   set1--(set1--set2)
  }
}
