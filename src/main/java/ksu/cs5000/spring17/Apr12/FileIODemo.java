package ksu.cs5000.spring17.Apr12;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIODemo {
    public static void main(String args[] )  {
        try {
            FileInputStream inputFile = new FileInputStream("/Users/curri/test.txt");
            FileOutputStream outputFile = new FileOutputStream("/Users/curri/test_output.txt");
            Scanner in = new Scanner(inputFile);
            PrintWriter out=new PrintWriter(outputFile);
            while (in.hasNext()) {
                String line=in.nextLine();
                out.println(line);
            }
            out.flush();
            out.close();

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Bad stuff "+e);
        }
    }
}
