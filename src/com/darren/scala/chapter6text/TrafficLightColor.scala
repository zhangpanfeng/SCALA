package com.darren.scala.chapter6text

object TrafficLightColor extends Enumeration {
    //type TrafficLightColor = Value
    //    val RED, YELLOW, GREEN = Value

    //    val RED = Value
    //    val YELLOW = Value
    //    val GREEN = Value

    val RED = Value(0, "Stop")
    val YELLOW = Value(10) //����Ϊ��YELLOW��
    val GREEN = Value("Go") //IDΪ11������һ�������ϼ�һ
}