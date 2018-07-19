package com.darren.scala.chapter6text

object TrafficLightColor extends Enumeration {
    //type TrafficLightColor = Value
    //    val RED, YELLOW, GREEN = Value

    //    val RED = Value
    //    val YELLOW = Value
    //    val GREEN = Value

    val RED = Value(0, "Stop")
    val YELLOW = Value(10) //名称为“YELLOW”
    val GREEN = Value("Go") //ID为11，在上一个基础上加一
}