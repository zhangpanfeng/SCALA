package com.darren.scala.chapter6.practice

class Point(x: Int, y: Int) {

}

object Point {
    def apply(x: Int, y: Int) {
        new Point(x, y)
    }
}