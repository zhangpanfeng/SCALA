package com.darren.scala.procedure

object Procedure {
    def main(args: Array[String]): Unit = {
        println("this is a procedure");
        val result = test1();
        println(result);

        val result2 = test2();
        println(result2);

        println(().equals(result));
        println(() == result);

        println("====================");

        println("()".equals(result.toString()));
        println("()" == result.toString());
    }

    def test1(): Unit = {
        val string = "this is test1"
        println(string);

        //return string;
    }

    def test2(): String = {
        val string = "this is test2"
        println(string);

        return string;
    }
}