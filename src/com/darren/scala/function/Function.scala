package com.darren.scala.function

import java.io.PrintStream
import java.text.MessageFormat

object Function {
    //    def main(args: Array[String]): Unit = {
    //
    //    }
    /**
     * ����
     */

    //��������  ����                           ������
    def abs(x: Double) = if (x >= 0) x else -x

    //��������  ����
    def abs1(x: Double): Double = {
        //������
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    // ��ͨ�������Բ������������ͺͷ���ֵ�����һ�п������ַ���ֵ�ͷ�������
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

    // �ݹ麯�����������������
    def fac_r(n: Int): Int = if (n <= 0) 1 else n * fac_r(n - 1)

    def fac_r1(n: Int): Int = {
        if (n <= 0) {
            return 1;
        } else {
            return n * fac_r(n - 1);
        }
    }

    /**
     * Ĭ�ϲ����ʹ�������
     */
    //    def main(args: Array[String]): Unit = {
    //        //Ĭ�ϲ���, ����ָ��������������˳��Ҫһ��
    //        println(decorate("Hello"));
    //        println(decorate("Hello", "<<<"));
    //        println(decorate("Hello", "<<<", ">>>"));
    //
    //        //��������, ���ñ�֤˳��һ�� ����Ҫָ��������
    //        println(decorate(left = "##", str = "Hello", right = "##"));
    //    }
    def decorate(str: String, left: String = "[", right: String = "]") =
        left + str + right

    def decorate1(str: String, left: String = "[", right: String = "]"): String = {
        return left + str + right;
    }

    /**
     * �䳤����
     */
    def main(args: Array[String]): Unit = {
        println(sum(1, 2, 3));

        // ������һ��Seq������Range
        //val s = sum(1 to 5);

        val s = sum(1 to 5: _*);
        println(s);

        //�������java����������ΪObject�ı䳤��������Ҫ�Ի������ͽ���ת��
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