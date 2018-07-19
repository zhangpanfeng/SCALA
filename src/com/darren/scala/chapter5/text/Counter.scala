package com.darren.scala.chapter5.text

class Counter {
    private var value = 0 //你必须初始化字段
    def increment() { //方法默认是公有的
        value += 1
    }
    def current() = value
}