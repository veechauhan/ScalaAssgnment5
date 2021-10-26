package edu.KUP

import scala.annotation.tailrec

class Intersection {
  def intersection(set1: Set[Int], set2: Set[Int]): Set[Int] = {
    var tempSet: Set[Int] = Set()
    if (set1.nonEmpty && set2.nonEmpty) {
      var head = set1.head
      var tempSet2: Set[Int] = set1.tail

      @tailrec
      def loop(size: Int): Set[Int] = {
        if (size > set1.size) {
          tempSet
        } else {
          val temp: Boolean = set2(head)
          if (temp) {
            tempSet += head
          }
          if (tempSet2.nonEmpty) {
            head = tempSet2.head
            tempSet2 = tempSet2.tail
          }
          loop(size = size + 1)
        }
      }

      loop(1)
    } else {
      tempSet
    }
  }
}
