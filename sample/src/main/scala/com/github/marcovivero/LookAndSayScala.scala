package com.github.marcovivero

object LookAndSayScala {

  def nthTerm(n: Int, seed: Int): String =
    (0 until n).foldLeft(seed.toString) { (previous, _) =>
      previous.split("").foldLeft(("", (0, ""))) {
        case ((result: String, (oldCount: Int, oldVal: String)), newVal: String) =>
          if (newVal == oldVal) (result, (oldCount + 1, oldVal))
          else (s"${result}${if (oldCount == 0) "" else s"$oldCount$oldVal"}", (1, newVal))
      } match {
        case (s, (c, v)) => s"$s$c$v"
      }
    }

  def main(args: Array[String]): Unit =
    (0 to 10).foreach(k => println(nthTerm(k, 1)))

}
