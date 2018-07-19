package com.darren.scala.chapter5.practice

object Chapter5Practice {
    def main(args: Array[String]): Unit = {

        new Counter().increment();

        // number3
        println(new Time(8, 6).before(new Time(9, 7)))

        // number4
        println(new Time1(8, 6).before(new Time1(9, 7)))
        
        //number5
        println(new Student("Darren", 1).getName())
    }
}