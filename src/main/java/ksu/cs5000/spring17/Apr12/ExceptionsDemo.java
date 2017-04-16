package ksu.cs5000.spring17.Apr12;


import java.util.Random;

public class ExceptionsDemo {

    public static class MyBaseException extends Exception {
        MyBaseException(String message) {
            super(message);
        }
    }

    public static class MyException1 extends MyBaseException {
        MyException1(String message) {
            super(message);
        }
    }

    public static class MyException2 extends MyBaseException {
        MyException2(String message) {
            super(message);
        }
    }
    static void mayFail(int fail) throws MyException2, MyException1 {
        if(fail==1)
            throw new MyException1("Something terrible 1 happened");
        if(fail==2)
            throw new MyException2("Something terrible 2 happened");
    }

    public static void main(String args[])  throws Exception{
        try {
            int  val= new Random().nextInt()%4;
            int a=Integer.MAX_VALUE/val;
            mayFail(val);
            System.out.println("All good");
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Bad math "+e.getMessage());
        }
        catch (MyBaseException e) {
            System.out.println("Somebody threw an exception "+e.getMessage());
            throw e;
        }
        finally {
            System.out.println("Finally done");
        }
    }

}
