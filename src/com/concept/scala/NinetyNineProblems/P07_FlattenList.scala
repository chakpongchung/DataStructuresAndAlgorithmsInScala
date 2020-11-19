package com.concept.scala.NinetyNineProblems

object P07_FlattenList {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case element => List(element)
  }
}
