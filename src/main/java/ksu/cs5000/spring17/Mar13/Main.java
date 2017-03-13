package ksu.cs5000.spring17.Mar13;

public class Main {

    public static boolean contains(int arr[], int elem) {
        for(int i=0; i<arr.length; ++i) {
            if(arr[i]==elem)
                return true;
        }
        return false;
    }

    public static void printArray(String arr[]){
        for(String elem : arr) {
            System.out.println(elem);
        }
    }
    public static void main(String args[]) {
        printArray(args);
        int arr[]={10,20,30,40,50};
        System.out.println(contains(arr,11));
        System.out.println(contains(arr,40));
    }

    public static void  nomain(String args[]) {
        Person people[]= {
                new Person("Orlando","Karam",40),
                new Person("Orlando","Bloom",43),
                new Person("Harry","Potter",11)
        };

        System.out.println(people.length);

        for(int i=0; i<people.length; ++i) {
            System.out.println(people[i]);
        }

        for( Person p : people) {
            System.out.println(p);
        }
    }
}
