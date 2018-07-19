package com.darren.scala.chapter5.practice

// number8
class Car(val vendor: String, val model: String, val date: Int, var card: String) {

    def this(vendor: String, model: String, date: Int) {
        this(vendor, model, date, "")
    }

    def this(vendor: String, model: String, card: String) {
        this(vendor, model, -1, card)
    }

    def this(vendor: String, model: String) {
        this(vendor, model, -1)
    }
}