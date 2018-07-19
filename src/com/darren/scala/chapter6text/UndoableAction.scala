package com.darren.scala.chapter6text

abstract class UndoableAction(val description: String) {
    def undo(): Unit
    def redo(): Unit
}