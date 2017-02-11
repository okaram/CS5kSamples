package ksu.cs5000.spring17;

import java.io.PrintStream;

// More recursion examples
public class Feb8_RecursionExamples {

    // returns true if the string is empty
    static boolean isEmpty(String s) {
        return s.length()==0;
    }

    // returns the first character of a string. Assumes not empty
    static char head(String s) {
        return s.charAt(0);
    }

    // returns the string minus the first character
    static String tail(String s) {
        return s.substring(1);
    }


    static boolean contains(String s, char target) {
        if(isEmpty(s))
            return false;
        else if(head(s)==target)
            return true;
        else
            return contains( tail(s), target);
    }

    static int countOccurrences(String s, char c) {
        if(isEmpty(s))
            return 0;
        else if (head(s)==c) {
            return 1+countOccurrences(tail(s),c);
        } else
            return countOccurrences(tail(s),c);
    }

    static String reverse(String s) {
        if(isEmpty(s))
            return "";
        return reverse( tail(s) )+head(s);
    }

    static String revC(String s, int from) {
        if(from>=s.length())
            return "";
        return revC(s,from+1)+s.charAt(from);
    }

    static String revC(String s) {
        return revC(s,0);
    }

    // print all numbers from low to high (inclusive), one per line
    public static void printCountUp(PrintStream out, int low, int high) {
        if(low>high)
            return;
        out.println(low);
        printCountUp(out,low+1,high);
    }
    // print numbers down from from, until (but not including) to
    public static void printDownFrom(PrintStream out, int low, int high) {
        if(high<low)
            return;
        out.println(high);
        printDownFrom(out,low,high-1);
    }

    static int lastDigit(int n) {
        return n%10;
    }
    // every digit but the last one
    static int firstDigits(int n) {
        return n/10;
    }

    static char intToDigit(int n) {
        return (char) ('0'+lastDigit(n));
    }

    public static String intToDecimalString(int n) {
        if(n==0)
            return "";
        return intToDecimalString(firstDigits(n))+intToDigit(lastDigit(n));
    }

    static int lastBit(int n) {
        return n%2;
    }
    // every digit but the last one
    static int firstBits(int n) {
        return n/2;
    }

    public static String intToBinaryString(int n) {
        if(n==0)
            return "";
        return intToBinaryString(firstBits(n))+intToDigit(lastBit(n));
    }

    static int power(int base, int exponent) {
        if(exponent==0)
            return 1;
        else
            return base*power(base,exponent-1);
    }

    //0 1 1 2 3 5 8 13 21 34 55
    static int fibonacci(int n) {
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }


    public static void main(String args[]) {
        System.out.println("Time: "+System.currentTimeMillis());
        System.out.println(fibonacci(10));
        System.out.println("Time: "+System.currentTimeMillis());
        System.out.println(fibonacci(20));
        System.out.println("Time: "+System.currentTimeMillis());
        System.out.println(fibonacci(40));
        System.out.println("Time: "+System.currentTimeMillis());
        System.out.println(fibonacci(80));
        System.out.println("Time: "+System.currentTimeMillis());
    }
}
