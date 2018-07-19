package com.darren.scala.chapter6text





object Chapter6Text {
    def main(args: Array[String]): Unit = {

        println(Accounts.newUniqueNumner())

        val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)

        println(TrafficLightColor.RED.toString()) //Stop
        println(TrafficLightColor.RED) //Stop
        println(TrafficLightColor.RED.id) //0

        println(TrafficLightColor.GREEN.id) //11

        println(TrafficLightColor.withName("Stop")) //Stop

        println(TrafficLightColor(0)) //Stop
        
        println(doWhat(TrafficLightColor.RED)) //Stop
    }

    def doWhat(color: TrafficLightColor.Value) = {
        if (color == TrafficLightColor.RED) {
            "Stoppped"
        } else if (color == TrafficLightColor.YELLOW) {
            "Hurry Up"
        } else {
            "Go"
        }
    }
}