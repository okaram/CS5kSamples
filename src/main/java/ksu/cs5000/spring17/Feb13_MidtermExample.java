package ksu.cs5000.spring17;


import java.io.PrintStream;
import java.util.Scanner;

public class Feb13_MidtermExample {

    public static boolean amISmart=true;

    public static boolean isOdd(int a) {
        return a%2==1;
    }

    /*
     Write a function called classifyAge that takes an int, say age, and
returns a string; the function returns “kid” if age is between 0 and 12 (all ranges
inclusive), “teen” if between 13 and 19, “adult” if between 20 and 65, “senior” if between
65 and 120, and “invalid” if not in any of these categories.
     */

    public static
    String classifyAge(int age) {

        if(age>=0 && age<=12) {
            return "kid";
        }

        if(age>=13 && age <=19) {
            return "teen";
        }

        if(age>=20 && age <=65) {
            return "adult";
        }

        if(age>=66 && age <=120) {
            return "seniot";
        }
        return "invalid";

    }

    public static
    String classifyAge2(int age) {

        if(age<0 ) {
            return "invalid";
        }
        if(age<=12) {
            return "kid";
        } else if(age <=19) {
            return "teen";
        } else if(age <=65) {
            return "adult";
        }else if(age <=120) {
            return "seniot";
        }
        return "invalid";
    }

/*
 Write a function called readWithin0_100, that takes two parameters, a
Scanner and a PrintStream, and returns an int; this function prints a message for the user and read a
number; if the number is not between 0 and 100. it asks and reads again, until it reads a
valid number; it then returns that valid number.
 */

    static int readWithin0_100(Scanner stdInput, PrintStream monitor) {
        monitor.println("Please enter a number between 0 and 100");
        int input=stdInput.nextInt();
        if(input >= 0 && input <= 100)
            return input;
        else
            return readWithin0_100(stdInput, monitor);
    }
/*
Write a function called power, that takes two ints, say base and
exponent, and returns the first parameter (base) raised to the exponent power (the return
value is also an int; you cannot use Math.pow or any other java function that does this :)
 */
    static int power(int base, int exponent) {
        if(exponent==0)
            return 1;
        else
            return base * power(base,exponent-1);
    }


    public static void printDownFrom(PrintStream out, int low, int high) {
        if(high<low)
            return;
        out.println(high);
        printDownFrom(out,low,high-1);
    }

    static int lastDigit(int n)
    {
        return n%10;
    }

    static int firstDigits(int n){
        return n/10;
    }

    static int sumDigits(int n) {
        if(n<10)
            return n;
        return lastDigit(n) + sumDigits(firstDigits(n));
    }

    public static void main(String args[]) {
        System.out.println( sumDigits(123) );
    }



}
