package ksu.cs5000.spring17.Mar27;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static int getTotalNumberOfElements(List<List<Integer>> ll) {
        int sum=0;

        for(List<Integer> list : ll) {
            sum += list.size();
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[]={1,2,3};
        List<Integer> l1= Arrays.asList( 1, 2, 3);
        List<Integer> l2= Arrays.asList( 10, 20, 30, 40, 50);

        List< List<Integer> > ll=Arrays.asList(l1, l2, l1, l2);

        System.out.println( ll.size() );
        System.out.println( getTotalNumberOfElements(ll) );
        System.out.println( ll.getClass() );

    }
}
