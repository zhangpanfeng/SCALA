package com.darren.scala.chapter5.text

class Counter {
    private var value = 0 //������ʼ���ֶ�
    def increment() { //����Ĭ���ǹ��е�
        value += 1
    }
    def current() = value
}