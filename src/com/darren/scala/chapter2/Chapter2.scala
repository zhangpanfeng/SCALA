package com.darren.scala.chapter2

object Chapter2 {
    def main(args: Array[String]): Unit = {

        // Number 3
        var x: Unit = ()
        var y = 0;
        x = y = 1;

        //number5(5);
        println(number6("Hello"));

        println(number7("Hello"));

        println(number10(2, -3))
    }

    // number 1
    def signum(signum: Int): Int = {
        if (signum > 0) {
            return 1;
        } else if (signum < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    // number 1
    def signum1(signum: Int): Int = if (signum > 0) 1 else if (signum < 0) -1 else 0

    //number 4
    def number4() = {
        val range = (0 to 10).reverse
        for (a <- range) {
            println(a)
        }
    }

    //number 4
    def number4_1() = {
        for (a <- 0 to 10) {
            println(10 - a)
        }
    }

    def number5(n: Int) = {
        for (a <- 0 to n) {
            println(n - a)
        }
    }

    def number6(s: String): Long = {
        var result: Long = 0;
        for (c <- s.toCharArray()) {
            result += c.toInt
        }

        result
    }

    def number7(s: String): Long = {
        var result = s.head.toLong;
        s.reduce((a1, a2) => { result *= a2.toLong; a2 });

        result
    }

    def number9(s: String): Long = {
        if (s.length() == 0)
            1
        else
            s.head.toInt * number9(s.tail);
    }

    def number10(x: Double, n: Int): Double =
        if (n == 0) 1 else if (n > 0) x * number10(x, n - 1)
        else { println(x + " " + n); 1 / x * 1 / number10(x, -n - 1) }
}