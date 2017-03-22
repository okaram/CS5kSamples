package ksu.cs5000.spring17.Mar22;


public class InnerClasses {

    public class Foo {

    }

    public Foo getFoo() {
        return new Foo();
    }

    static int numberOfInstances;
    public int myNumber;

    public InnerClasses () {
        ++numberOfInstances;
        myNumber=numberOfInstances;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    public int getMyNumber() {
        return myNumber;
    }
    public static void main(String args[]) {
        InnerClasses i1=new InnerClasses();
        InnerClasses i2=new InnerClasses();
        System.out.println(numberOfInstances);

        System.out.println(i2.myNumber);
        System.out.println(i1.myNumber);

        Foo f=i1.getFoo();
    }
}
