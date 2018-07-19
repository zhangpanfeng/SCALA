package com.darren.scala.chapter5.practice

class Time1(val hrs: Int, val min: Int) {

    def before(other: Time1): Boolean = {
        (hrs * 60 + min) < (other.hrs * 60) + other.min
    }
}