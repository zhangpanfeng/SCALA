package com.darren.scala.chapter5.practice

// number10
//�һ�ʹ�����ϵķ�ʽ�����ַ�ʽû�а취����name����
class Employee {
    val name: String = "John Q. Public"
    var salary: Double = 0.0

    def this(name: String, salary: Double) {
        this();
        //this.name = name;
        this.salary = salary;
    }
}