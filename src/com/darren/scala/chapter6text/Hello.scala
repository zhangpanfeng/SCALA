package com.darren.scala.chapter6text

object Hello extends App {
    println("Hello World")

    //ʲôʱ���в����أ�����ʱ�������룬eclipse�����̨
    if (args.length > 0) {
        println("Hello, " + args(0))
    } else {
        println("Hello World")
    }
}