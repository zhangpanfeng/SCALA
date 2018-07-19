package com.darren.scala.chapter5.practice

// number7
class Person1(val name: String) {
    val nameArray = name.split(" ");
    val firstName = nameArray(0);
    val lastName = nameArray(1);

}