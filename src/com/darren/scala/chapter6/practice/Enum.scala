package com.darren.scala.chapter6.practice

object Enum extends Enumeration {

    val SPADE = Value("�7�8")
    val HEART = Value("�7�3")
    val CLUBS = Value("�7�1")
    val DIANMOND = Value("�7�4")

    def isWhich(cardType: Enum.Value) = {
        cardType == Enum.HEART
    }

    def main(args: Array[String]): Unit = {
        println(Enum.values.mkString(","))
        println(isWhich(Enum.CLUBS));
        println(isWhich(Enum.HEART));
    }
}
