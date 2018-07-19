package com.darren.scala.chapter6text

object Hello extends App {
    println("Hello World")

    //什么时候有参数呢？运行时参数传入，eclipse或控制台
    if (args.length > 0) {
        println("Hello, " + args(0))
    } else {
        println("Hello World")
    }
}