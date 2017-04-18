package ksu.cs5000.spring17.Apr17;


// arraylist of strings
public class MyArrayList {

    String [] dataArray = new String[10];
    int actualSize=0;

    public int size() {
        return actualSize;
    }

    public String get(int index) {
        if(index<0 || index>actualSize)
            throw new IllegalArgumentException("Index has to be between 0 and "+actualSize);
        return dataArray[index];
    }

    public void set(int index, String value) {

    }

    public void add(String s) {
        dataArray[actualSize]=s;
        ++actualSize;
    }
}
