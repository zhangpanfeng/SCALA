package com.darren.scala.chapter6text

class Account {
    val id = Account.newUniqueNumber();
    private var balance = 0.0
    def deposit(amount: Double) {
        balance += amount
    }
}

object Account { //°éÉú¶ÔÏó
    private var lastNumber = 0

    private def newUniqueNumber() = {
        lastNumber += 1;
        lastNumber;
    }
    
    def apply() = {
        new Account();
    }
}