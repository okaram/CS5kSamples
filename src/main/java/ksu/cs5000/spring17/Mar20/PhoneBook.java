package ksu.cs5000.spring17.Mar20;


import java.io.PrintStream;

public class PhoneBook {
    Entry[] entries=new Entry[100];
    int numEntries=0;

    static class Entry {
        public String name;
        public String phoneNumber;

        public Entry(String name, String phoneNumber) {
            this.name=name;
            this.phoneNumber=phoneNumber;
        }

        @Override
        public String toString() {
            return "Phone book Entry["+name+" -- "+phoneNumber+" ]";
        }
    }

    public void addEntry(String name, String phoneNumber) {
        Entry e=new Entry(name,phoneNumber);
        entries[numEntries]=e;
        ++numEntries;
    }

    public int getNumEntries() {
        return numEntries;
    }

    public void printAll(PrintStream out) {
        for(int i=0; i < numEntries; ++i)
            out.println(entries[i]);
    }

    public String getPhone(String name) {
        for(int i=0; i < numEntries; ++i)
            if(entries[i].name.equals(name))
                return entries[i].phoneNumber;
        return "";
    }
    public static void main(String args[]) {
        PhoneBook pb=new PhoneBook();
        pb.addEntry("Orlando","1234567");
        pb.addEntry("Lina","2345678");
        pb.printAll( System.out );
    }
}
