package ksu.cs5000.spring17;


import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Feb29_MoreLoops {

    static void printMultiplicationTable(int from, int to, PrintStream out) {
        // header
        out.print("x");
        for(int i=from; i<=to; ++i) {
            out.print("\t"+i);
        }
        out.println();

        for(int row=from; row<=to; ++row) {
            out.print(row);
            for (int i = from; i <= to; ++i) {
                out.print("\t" + row * i);
            }
            out.println();
        }
    }

    static void swap(StringBuffer s, int place1, int place2) {
        char tmp=s.charAt(place2);
        s.setCharAt(place2, s.charAt(place1));
        s.setCharAt(place1,tmp );
    }

    static void reverseInPlace(StringBuffer s, int from, int to) {
        for(int i=from; i<from+((to-from)/2); ++i) {
            swap(s,i, to-(i-from)-1);
        }
    }

    static void wordReverse(StringBuffer s) {
        reverseInPlace(s,0,s.length());
        int lastWordStart=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)==' ') {
                reverseInPlace(s,lastWordStart,i);
                lastWordStart=i+1;
            }
        }
        if(lastWordStart!=0) {
            reverseInPlace(s,lastWordStart,s.length());
        }
    }

    public static String reverse(String s) {
        StringBuffer sb=new StringBuffer(s);
        reverseInPlace(sb,0,sb.length());
        return sb.toString();
    }

    public static String wordReverse(String s) {
        String[] words=s.split(" ");
        for(int i=0; i<words.length; ++i) {
            words[i]=reverse(words[i]);
        }
        return String.join(" ", words);
    }

    static void playGuessingGame1(Scanner in, PrintStream out) {
        out.println("I'm thinking of a number between 0 and 100");
        int target= new Random().nextInt();
        if (target<0)
            target-=target;
        target%=101;
        int guess;
        do {
            out.println("Guess the number");
            guess=in.nextInt();
            if(guess<target)
                out.println("Too low");
            if(guess>target)
                out.println("Too high");
        }while(guess!=target);
        out.println("Wow ! you got it");
    }
    public static void main(String args[]) {
        playGuessingGame1(new Scanner(System.in), System.out);
    }
}

