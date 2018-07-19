package com.darren.scala.chapter5.practice

class Time(val hrs: Int, val min: Int) {

    def before(other: Time): Boolean = {
        (hrs * 100 + min) < (other.hrs * 100 + other.min)
    }
}