package ksu.cs5000.spring17;

public class Conditionals {

    public static String booleanToYesNo(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static int abs(int number)
    {
        return   number<0 ? -number : number;
/*        if(number<0) {
            return -number;
        } else {
            return number;
        }
*/    }

    // sign(-7)
    public static int sign(int n) {

        return n>0 ? 1 : (n<0 ? -1 : 0);
/*        if (n > 0) {
            return 1;
        }else  if (n < 0) {
            return -1;
        } else {
            return 0;
        }
*/    }

    public static String fizzBuzz(int n) {

//        return n%3==0 ? (n%5==0? "FizzBuzz" : "Fizz") : (n%5==0? "Buzz" : ""+n);
        if( n%3==0 ) {
            if(n%5==0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else {
            if( n%5==0) {
                return "Buzz";
            } else {
                return ""+n;
            }
        }
    }


    static int min(int a, int b) {
        if(a<b) {
            return a;
        } else {
            return b;
        }
    }

    static int max2(int a, int b) {
        if(a>b) {
            return a;
        } else {
            return b;
        }
    }

    static int max4(int a, int b, int c, int d) {
        return max2(    max2(a,b), max2(c,d) );
    }

    static int min3(int a, int b, int c) {
        return min(   min(a,b), c);
    }

    public static String dayName(int day) { // 1=Sunday, ... 7=Saturday
        String answer;

        switch(day) {
            case 1:
                answer= "Sunday";
                break;
            case 2:
                answer= "Monday";
                break;
            case 3:
                answer= "Tuesday";
                break;
            case 4:
                answer= "Wednesday";
                break;
            case 5:
                answer= "Thursday";
                break;
            case 6:
                answer= "Friday";
                break;
            case 7:
                answer= "Saturday";
                break;
            default:
                answer= "Invalid Day";
        }
        return answer;
    }

    public static double taxRateForSingles(int income)
    {
        if(income <= 0)
            return 0;
        else if (income <= 9225)
            return 10;
        else if (income <=37450)
            return 15;
        else if (income<=90750)
            return 25;
        else if (income <=189300)
            return 28;
        else if (income<=411500)
            return 33;
        else if (income <=413200)
            return 35;
        else
            return 39.6;

    }


    public static double taxAmountForSinglesIncomplete(int income) {
        if(income <= 0)
            return 0;
        else if (income <= 9225)
            return income*.1;
        else if (income <=37450)
            return 922.5 + (income-9225)*.15;
        else if (income<=90750)
            return 5156.25 + .25*(income-37450);
        else if (income <=189300)
            return 18481.25+.28*(income-90750);
        else if (income<=411500)
            return 33;
        else if (income <=413200)
            return 35;
        else
            return 39.6;
    }


    public static char phoneLetterToDigitIf(char l) {
        if(l=='1')
            return '1';

        if( l=='A' || l=='B' || l=='C' || l=='2')
            return '2';

        if( l=='D' || l=='E' || l=='F' || l=='3')
            return '3';

        if( l=='G' || l=='H' || l=='I' || l=='4')
            return '4';

        if( l=='J' || l=='K' || l=='L' || l=='5')
            return '5';

        if( l=='M' || l=='N' || l=='O' || l=='6')
            return '6';
        if( l=='P' || l=='Q' || l=='R' || l=='S' || l=='7')
            return '7';
        if( l=='T' || l=='U' || l=='V' || l=='8')
            return '8';
        if( l=='W' || l=='X' || l=='Y' || l=='Z' || l=='9')
            return '9';
        if( l=='0')
            return '0';

        return ' ';
    }


    public static char phoneLetterToDigit(char l) {

        switch(l) {
            case '1':
                return '1';
            case '2':
            case 'A':
            case 'B':
            case 'C':
                return '2';

            case '3':
            case 'D':
            case 'E':
            case 'F':
                return '3';

            case '4':
            case 'G':
            case 'H':
            case 'I':
                return '4';
            case '5':
            case 'J':
            case 'K':
            case 'L':
                return '5';

            case '6':
            case 'M':
            case 'N':
            case 'O':
                return '6';

            case '7':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return '7';

            case '8':
            case 'T':
            case 'U':
            case 'V':
                return '8';

            case '9':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return '9';

            case '0':
                return '0';
            default:
                return ' ';
        }
    }

    public static String digitToWord(int digit) {
        switch(digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
        }
        return "invalid";
    }


    public static void main(String[] args) {
        System.out.println( digitToWord(1));
        System.out.println( digitToWord(3));
        System.out.println( digitToWord(7));

    }
}

