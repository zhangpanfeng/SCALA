package com.darren.scala.chapter6text

object Accounts {
    private var lastNumber = 0
    def newUniqueNumner() = {
        lastNumber += 1;
        lastNumber
    }
}