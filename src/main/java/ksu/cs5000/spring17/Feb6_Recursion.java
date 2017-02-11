package ksu.cs5000.spring17;


import java.io.PrintStream;

public class Feb6_Recursion {


    public static int factorial(int n) {
        if(n<=0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static int power(int base, int exponent) {
        if(exponent==0)
            return 1;
        else
            return base*power(base,exponent-1);
    }

    public static boolean isEven(int n) {
        return n%2==0;
    }

    public static int power_log(int base, int exponent) {
        System.out.println("power_log "+exponent);
        if(exponent==0)
            return 1;
        int half_power=power_log(base,exponent/2);
        if(isEven(exponent))
            return half_power*half_power;
        else
            return half_power*half_power*base;
    }

    public static int pow_accum(int base, int exponent, int current) {
        if(exponent<=0)
            return current;
        else
            return pow_accum(base,exponent-1, current*base);
    }


    // print numbers down from from, until (but not including) to
    public static void printDownFrom(PrintStream out, int from, int to) {
        if(from<=to)
            return;
        out.println(from);
        printDownFrom(out,from-1, to);
    }

    // prints from from to to (not including to)
    // from is now lower than to
    public static void printUp(PrintStream out, int from, int to) {
        if(from>=to)
            return;
        else {
            out.println(from);
            printUp(out, from + 1, to);
        }
    }

    public static boolean contains_rec(String s, char c, int from) {
        if(from>=s.length())
            return false;
        if(c==s.charAt(from))
            return true;
        return contains_rec(s,c,from+1);
    }

    public static boolean contains(String s, char c) {
        return contains_rec(s,c,0);
    }

    public static void main(String args[]) {
        System.out.println(   contains("abc",'d') );
    }
}
