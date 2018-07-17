package com.darren.scala.chapter3.text

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object Chapter3Text {
    def main(args: Array[String]): Unit = {

        //��������
        val nums = new Array[Int](10);

        //��ʼ������ʱ����Ҫnew
        val s = Array("Hello", "World");
        println(s(0))

        //�䳤����
        val b = ArrayBuffer[Int]();

        val command = ArrayBuffer("ls", "-al", "/home/cay");
        // ���bufferתList����Ҫ����import scala.collection.JavaConversions.bufferAsJavaList
        val pb = new ProcessBuilder(command);
        println(pb.command())

        // ���ListҪת��Buffer����Ҫ����import scala.collection.JavaConversions.asScalaBuffer
        val cmd: Buffer[String] = pb.command();
    }

}