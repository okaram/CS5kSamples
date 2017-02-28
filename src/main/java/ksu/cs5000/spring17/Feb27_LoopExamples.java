package ksu.cs5000.spring17;


import java.util.Scanner;

public class Feb27_LoopExamples {
    public static int readAndSum(Scanner in)
    {
        int sum=0;
        int input;
         do {
            System.out.println("Please enter a number (0 to stop)");
            input=in.nextInt();
            sum+=input;
        } while(input!=0);
        return sum;
    }

    public static int readAndSumNegatives(Scanner in)
    {
        int sum=0;
        int input;
        for( ; ; ) {
            System.out.println("Please enter a number (0 to stop)");
            input=in.nextInt();
            if(input==0)
                break;
            if(input>0) {
                continue;
            }
            sum += input;
        }

        return sum;
    }


    public static boolean containsDigit(int number, int digit) {
        do {
            if (number % 10 == digit)
                return true;
            number = number / 10;
        } while (number!=0);

        return false;
    }

    static boolean stringContains(String s, char c) {
        for ( int i=0; i<s.length(); ++i ) {
            if(s.charAt(i)==c) {
                return true;
            }
        }
        return false;
    }

    public static int factorial(int n) {
        int fac=1;
        for(int i=1; i<=n; ++i) {
            fac*=i;
        }
        return fac;
    }

    static String stringTimes(String s, int n, String separator) {
        String ans="";
        for(int i=1; i<=n; ++i) {
            ans+=s+separator;
        }
        return ans;
    }

    static int power(int base, int exponent)
    {
        int pow=1;
        while(exponent>0) {
            pow*=base;

            --exponent;
        }
        return pow;
    }

    static int power2(int base, int exponent)
    {
        int pow=1;
        for(int i=0; i<exponent ; ++i) {
            pow*=base;
        }
        return pow;
    }

    static int fibo(int n) {
        int prev=0;
        int fib=1;
        for(int i=0; i<n; ++i) {
            int tmp=fib;
            fib=prev+fib;
            prev=tmp;
        }
        return fib;
    }

    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        for(int i=0; i<10; ++i)
            System.out.println(i + " -> "+fibo(i));
    }

}
