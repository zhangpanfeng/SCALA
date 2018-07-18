package com.darren.scala.chapter4.text

import scala.collection.SortedMap

object Chapter4Text {
    def main(args: Array[String]): Unit = {
        val scores = Map("a" -> 10, "b" -> 3, "c" -> 8)
        val scores_1 = scala.collection.mutable.Map("a" -> 10, "b" -> 3, "c" -> 8)
        scores_1.put("d", 4)

        val scores_2 = new scala.collection.mutable.HashMap[String, Int]

        println(scores_1("d"))
        println(scores_1.get("d").get)
        println(scores_1.get("e"))

        //反转
        for ((k, v) <- scores_1) yield (v, k)

        val scores_3 = SortedMap

        //元组
        val t = (1, 2, 3)
        //         val (f,s,x) = t
        //         println(f)

        val (f, s, _) = t

        val symbols = Array("<", "-", ">")
        val counts = Array(2, 10, 2)
        val pairs = symbols.zip(counts)
        
        println(pairs.mkString(","))
        for(z <- pairs){
            println(z)
        }
        for((s,n) <- pairs){
            print(s*n)
            
        }
    }
}