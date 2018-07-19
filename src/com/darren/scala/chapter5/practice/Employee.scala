package com.darren.scala.chapter5.practice

// number10
//我会使用书上的方式，这种方式没有办法覆盖name属性
class Employee {
    val name: String = "John Q. Public"
    var salary: Double = 0.0

    def this(name: String, salary: Double) {
        this();
        //this.name = name;
        this.salary = salary;
    }
}