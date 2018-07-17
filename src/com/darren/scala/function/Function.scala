package com.darren.scala.function

import java.io.PrintStream
import java.text.MessageFormat

object Function {
    //    def main(args: Array[String]): Unit = {
    //
    //    }
    /**
     * 函数
     */

    //函数名称  参数                           函数体
    def abs(x: Double) = if (x >= 0) x else -x

    //函数名称  参数
    def abs1(x: Double): Double = {
        //函数体
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    // 普通函数可以不标明返回类型和返回值，最后一行可以区分返回值和返回类型
    def fac(n: Int) = {
        var r = 1;
        for (i <- 1 to n) r = r * i
        r
    }

    def fac1(n: Int): Int = {
        var r = 1;
        for (i <- 1 to n) {
            r = r * i;
        }

        return r;
    }

    // 递归函数必须标明返回类型
    def fac_r(n: Int): Int = if (n <= 0) 1 else n * fac_r(n - 1)

    def fac_r1(n: Int): Int = {
        if (n <= 0) {
            return 1;
        } else {
            return n * fac_r(n - 1);
        }
    }

    /**
     * 默认参数和带名参数
     */
    //    def main(args: Array[String]): Unit = {
    //        //默认参数, 不用指定参数名，但是顺序要一致
    //        println(decorate("Hello"));
    //        println(decorate("Hello", "<<<"));
    //        println(decorate("Hello", "<<<", ">>>"));
    //
    //        //带名参数, 不用保证顺序一致 但是要指定参数名
    //        println(decorate(left = "##", str = "Hello", right = "##"));
    //    }
    def decorate(str: String, left: String = "[", right: String = "]") =
        left + str + right

    def decorate1(str: String, left: String = "[", right: String = "]"): String = {
        return left + str + right;
    }

    /**
     * 变长参数
     */
    def main(args: Array[String]): Unit = {
        println(sum(1, 2, 3));

        // 参数是一个Seq而不是Range
        //val s = sum(1 to 5);

        val s = sum(1 to 5: _*);
        println(s);

        //如果调用java方法，类型为Object的变长参数，需要对基本类型进行转换
        // format(x$1: String, x$2: Object*)
         //MessageFormat.format("The answer to {0} is {1}", "everything", 42)
        val result = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])
        println(result)

//        val array = Array((1, 2, 3), (4, 5, 6))
//        for (aa <- array) {
//            println(aa)
//            val range = aa.asInstanceOf[Range];
//            for (bb <- range) {
//                println(bb)
//            }
//        }
//        println(array(1)_1)
        
//        val tuple = (1,2,3);
//        for (aa <- tuple: _*) {
//            println(aa)
//        }
    }

    def sum(args: Int*) = {
        var result = 0;
        for (arg <- args) result += arg
        result
    }

    def sum1(args: Int*): Int = {
        var result = 0;
        for (arg <- args) {
            result += arg;
        }
        return result;
    }
}