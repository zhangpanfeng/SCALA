package com.darren.scala.chapter3.text

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object Chapter3Text {
    def main(args: Array[String]): Unit = {

        //定长数组
        val nums = new Array[Int](10);

        //初始化数组时不需要new
        val s = Array("Hello", "World");
        println(s(0))

        //变长数组
        val b = ArrayBuffer[Int]();

        val command = ArrayBuffer("ls", "-al", "/home/cay");
        // 如果buffer转List，需要导入import scala.collection.JavaConversions.bufferAsJavaList
        val pb = new ProcessBuilder(command);
        println(pb.command())

        // 如果List要转换Buffer，需要导入import scala.collection.JavaConversions.asScalaBuffer
        val cmd: Buffer[String] = pb.command();
    }

}