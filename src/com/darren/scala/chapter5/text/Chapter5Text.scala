package com.darren.scala.chapter5.text

object Chapter5Text {
    def main(args: Array[String]): Unit = {
        val myCounter = new Counter();
        myCounter.increment()
        println(myCounter.current())

        val chatter = new Network();
        val myFace = new Network();
        
        val fred = chatter.join("Fred");
        val wilma = chatter.join("Wilma");
        fred.contacts += wilma;
        
        val barney = myFace.join("Barney")
//        fred.contacts += barney;
        
    }
}