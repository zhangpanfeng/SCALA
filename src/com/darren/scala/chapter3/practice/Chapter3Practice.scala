package com.darren.scala.chapter3.practice

import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import java.util.TimeZone
import java.awt.datatransfer.SystemFlavorMap
import java.awt.datatransfer.DataFlavor
import scala.collection.JavaConversions.asScalaBuffer
object Chapter3Practice {
    def main(args: Array[String]): Unit = {

        //        println(number1(5).mkString("[", ",", "]"))
        //        println(number1_1(5).mkString("[", ",", "]"))
        //
        //        println(number2(Array(1, 2, 3, 4, 5, 6)).mkString("[", ",", "]"))
        //        println(number2_1(Array(1, 2, 3, 4, 5, 6)).mkString("[", ",", "]"))
        //
        //        println(number3(Array(1, 2, 3, 4, 5, 6)).mkString("[", ",", "]"))
        //
        //        println(number4(Array(-1, 2, -3, 4, -5, 6)).mkString("[", ",", "]"))
        //
        //        println(number5(Array(1, 2, 3, 4, 5, 6)))
        //
        //        println(number6(Array(-1, 2, -3, 4, -5, 6)).mkString("[", ",", "]"))
        //
        //        println(number7(Array(2, 2, -3, -5, -5, 6)).mkString("[", ",", "]"))
        //
        //        println(number8(ArrayBuffer(-1, 2, -3, 4, -5, 6)).mkString("[", ",", "]"))
        //        println(number8_1(ArrayBuffer(-1, 2, -3, 4, -5, 6)).mkString("[", ",", "]"))
        //        println(number8_2(ArrayBuffer(-1, 2, -3, 4, -5, 6)).mkString("[", ",", "]"))

        // number9()
        number10()
    }

    def number1(n: Int): Array[Int] = {
        var result = new Array[Int](n);
        for (i <- 0 until n) {
            result(i) = Random.nextInt(n);
        }

        result
    }

    def number1_1(n: Int): Array[Int] = {
        var result = for (i <- 0 until n) yield Random.nextInt(n)

        result.toArray
    }

    def number2(array: Array[Int]): Array[Int] = {
        for (i <- 0 until (array.length, 2) if (i + 1 < array.length)) {

            val temp = array(i)
            array(i) = array(i + 1)
            array(i + 1) = temp
        }

        array
    }

    def number2_1(array: Array[Int]): Array[Int] = {
        val index = for (i <- 0 until array.length) yield { if ((i + 1 == array.length) && (array.length % 2 != 0)) i else if (i % 2 == 0) i + 1 else i - 1 }

        val result = for (i <- 0 until index.length) yield array(index(i))

        result.toArray
    }

    def number3(array: Array[Int]): Array[Int] = {
        val result = for (i <- 0 until array.length) yield { if ((i + 1 == array.length) && (array.length % 2 != 0)) array(i) else if (i % 2 == 0) array(i + 1) else array(i - 1) }

        result.toArray
    }

    def number4(array: Array[Int]): Array[Int] = {
        //positive number index
        val positive_index = for (i <- 0 until array.length if (array(i) > 0)) yield i

        // negative number or 0 index
        val negative_index = for (i <- 0 until array.length if (array(i) <= 0)) yield i

        val index = ArrayBuffer[Int]();
        index ++= positive_index.toArray;
        index ++= negative_index.toArray;

        println(index.mkString(","))

        val result = for (i <- 0 until index.length) yield array(index(i))

        result.toArray
    }

    def number5(array: Array[Double]): Double = {
        array.sum / array.length
    }

    def number6(array: Array[Int]): Array[Int] = {
        array.sortWith(_ > _)

    }

    def number6_1(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
        array.sortWith(_ > _)
    }

    def number7(array: Array[Int]): Array[Int] = {
        array.distinct

    }

    def number8(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
        var first = true;
        var n = array.length;
        var i = 0;
        while (i < n) {
            if (array(i) >= 0) {
                i += 1
            } else {
                if (first) {
                    first = false;
                    i += 1;
                } else {
                    array.remove(i);
                    n -= 1;
                }
            }
        }

        array
    }

    def number8_1(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
        var first = true;
        val indexes = for (i <- 0 until array.length if first || array(i) >= 0) yield {
            if (array(i) < 0) first = false;
            i;
        }

        for (j <- 0 until indexes.length) {
            array(j) = array(indexes(j))
        }

        array.trimEnd(array.length - indexes.length);

        array
    }

    def number8_2(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
        // negative index
        val indexes = for (i <- 0 until array.length if array(i) < 0) yield {
            i;
        }

        var usedIndex = indexes.reverse.toBuffer;
        usedIndex.trimEnd(1);
        usedIndex = usedIndex.reverse
        println(usedIndex.mkString(","))
        var removed = 0;
        for (i <- usedIndex) {
            array.remove(i - removed);
            removed += 1;
        }

        array
    }

    def number9() {
        val array = TimeZone.getAvailableIDs();
        array.filter(_.startsWith("America/")).map(_.substring(8)).sorted.foreach(println(_))
    }

    def number10() {
        val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
        // 如果List要转换ArrayBuffer，需要导入import scala.collection.JavaConversions.asScalaBuffer
        val arrayBuffer = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
        for (s <- arrayBuffer) {
            println(s)
        }
    }
}