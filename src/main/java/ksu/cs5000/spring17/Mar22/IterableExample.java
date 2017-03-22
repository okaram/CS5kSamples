package ksu.cs5000.spring17.Mar22;

import java.util.Iterator;

public class IterableExample {
    public static class IntRangeIterator implements Iterator<Integer> {
        private int low=5, high=10, current=5;
        public IntRangeIterator(int low, int high) {
            this.low=low;
            this.high=high;
            this.current=low;
        }

        public boolean hasNext() {
            return current<=high;
        }

        public Integer next() {
            ++current;
            return  new Integer(current-1);
        }

        public void	remove() {

        }
    }

    public static class IntRange implements Iterable<Integer> {
        int low, high;

        public IntRange (int low, int high) {
            this.low=low;
            this.high=high;
        }
        public Iterator<Integer> iterator() {
            return new IntRangeIterator(low,high);
        }
    }

    public static void main(String args[]) {
        Iterator<Integer> r=new IntRange(3,5).iterator();
        while(r.hasNext()) {
            System.out.println(r.next());
        }

        for(Integer i : new IntRange(3,5)) {
            System.out.println(i);
        }
    }
}
