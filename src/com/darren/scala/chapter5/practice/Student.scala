package com.darren.scala.chapter5.practice

import scala.beans.BeanProperty

// number5
class Student {
    @BeanProperty
    var name: String = "";
    @BeanProperty
    var id: Long = 0

    def this(name: String, id: Long) {
        this();
        this.name = name;
        this.id = id;
    }
}