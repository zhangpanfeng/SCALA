package com.darren.scala.chapter5.practice

class Counter {
    private var value: Long = 0 //������ʼ���ֶ�
    def increment() { //����Ĭ���ǹ��е�
        value += 1
    }
    def current() = value
}