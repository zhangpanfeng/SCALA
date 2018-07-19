package com.darren.scala.chapter6.practice

object Enum extends Enumeration {

    val SPADE = Value("♠")
    val HEART = Value("♥")
    val CLUBS = Value("♣")
    val DIANMOND = Value("♦")

    def isWhich(cardType: Enum.Value) = {
        cardType == Enum.HEART
    }

    def main(args: Array[String]): Unit = {
        println(Enum.values.mkString(","))
        println(isWhich(Enum.CLUBS));
        println(isWhich(Enum.HEART));
    }
}
