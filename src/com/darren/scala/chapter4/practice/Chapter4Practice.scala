package com.darren.scala.chapter4.practice

import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import java.util.TreeMap
import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.LinkedHashMap
import java.util.Calendar

object Chapter4Practice {
    def main(args: Array[String]): Unit = {
        //        number1()
        //
        //        println(number2("c:/scala.txt").mkString(","))
        //        println(number3("c:/scala.txt").mkString(","))
        //        println(number4("c:/scala.txt").mkString(","))
        //        println(number5("c:/scala.txt").mkString(","))
        //
        //        number6()
        //number7()
       // println(number8(Array(1,2,3,4,5)))
        
        //println(number9(Array(1,2,3,4,5), 3))
        
        number10()
    }

    def number1() {
        val map = Map("a" -> 10, "b" -> 20, "c" -> 30)

        val newMap = for ((k, v) <- map) yield (k, v * 0.9)

        for (entry <- newMap) {
            println(entry)
        }
    }

    def number2(fileName: String): Map[String, Int] = {
        val map = new HashMap[String, Int]();
        val in = new java.util.Scanner(new java.io.File(fileName));
        while (in.hasNext()) {
            val key = in.next();
            val value = map.getOrElse(key, 0);
            map.put(key, value + 1);
        }

        map
    }

    def number3(fileName: String): scala.collection.immutable.Map[String, Int] = {
        var map = scala.collection.immutable.Map[String, Int]();
        val in = new java.util.Scanner(new java.io.File(fileName));
        while (in.hasNext()) {
            val key = in.next();
            val value = map.getOrElse(key, 0) + 1;
            map += (key -> value)
        }

        map
    }

    def number4(fileName: String): scala.collection.immutable.SortedMap[String, Int] = {
        var map = scala.collection.immutable.SortedMap[String, Int]();
        val in = new java.util.Scanner(new java.io.File(fileName));
        while (in.hasNext()) {
            val key = in.next();
            val value = map.getOrElse(key, 0) + 1;
            map += (key -> value)
        }

        map
    }

    def number5(fileName: String): Map[String, Int] = {
        val map = new TreeMap[String, Int]();
        val in = new java.util.Scanner(new java.io.File(fileName));
        while (in.hasNext()) {
            val key = in.next();
            val value = map.getOrDefault(key, 0)
            map.put(key, value + 1);
        }

        // import import scala.collection.JavaConversions.mapAsScalaMap
        val scalaMap: Map[String, Int] = map

        scalaMap

        // import import scala.collection.JavaConversions.mapAsScalaMap
        //map
    }

    def number6() {
        val linkedMap = new LinkedHashMap[String, Int]()
        linkedMap.put("Monday", Calendar.MONDAY);
        linkedMap.put("Tuesday", Calendar.TUESDAY);

        println(linkedMap.mkString(","))
    }

    def number7() {

        val properties = System.getProperties();
        val longestKey = properties.keySet().toArray().sortWith((left, right) => left.toString().length() > right.toString().length())(0)
        val keyLength = longestKey.toString().length()
        for ((k, v) <- properties) {
            printf("%" + -keyLength + "s %s %s ", k, "|", v)
            println()
        }
    }

    //minmax
    def number8(values: Array[Int]): (Int, Int) = {
        val min = values.min
        val max = values.max
        val result = (min, max)

        result
    }
    
    def number9(values: Array[Int], v:Int): (Int, Int, Int) = {
        val lt = values.count(_ < v)
        val eq = values.count(_ == v)
        val gt = values.count(_ > v)
        val result = (lt, eq, gt)

        result
    }
    
    def number10(){
        println("Hello".zip("World"))
        
        // keys 和 values 快速构建map
        val keys = "ABCD"
        val values = "1234"
        val map = keys.zip(values).toMap
        println(map('A'))
    }
}