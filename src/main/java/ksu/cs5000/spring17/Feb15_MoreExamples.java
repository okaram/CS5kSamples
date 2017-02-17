package ksu.cs5000.spring17;


public class Feb15_MoreExamples {

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

    static int numberOfOccurrences(String s, char c) {
        if(isEmpty(s))
            return 0;
        if(head(s)==c)
            return 1 + numberOfOccurrences(tail(s),c);
        else
            return numberOfOccurrences(tail(s),c);
    }

    public static boolean nestParen(String str, int from) {
        if(from>=str.length()/2)
            return true;
        if(str.charAt(from)!='(') {
            return false;
        }
        if(str.charAt((str.length()-1)-from)!=')') {// off by one ?
            return false;
        }
        return nestParen(str,from+1);
    }

    public static boolean nestParen(String str)
    {
        if(str.length()%2==1)
            return false;
        return nestParen(str,0);
    }

    public static void main(String args[]) {
        System.out.println( nestParen("((()))"));
        System.out.println( nestParen("((( )))"));
        System.out.println( nestParen("(())))"));
    }
}
