package com.darren.scala.chapter5.practice

// number6
class Person(var age: Int) {
    if (age < 0) {
        age = 0;
    }
}