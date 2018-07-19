package com.darren.scala.chapter6text

object DoNothingAction extends UndoableAction("Do nothing") {
    override def undo() {}
    override def redo() {}
}