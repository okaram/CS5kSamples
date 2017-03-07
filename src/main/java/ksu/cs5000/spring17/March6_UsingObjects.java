package ksu.cs5000.spring17;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Dimension;

public class March6_UsingObjects {


    public static boolean isToTheLeft(Point p1, Point p2) {
        return p1.x < p2.x;
    }

    public static int getArea(Rectangle r) {
        return r.width * r.height;
    }

    static void changeIt(int a) {
        a=5;
    }

    static void changeIt(Point p) {
        p.x=p.x+p.y;
    }

    public static void main(String args[]) {
        Point pt1=new Point(10,10);
        Point pt2=new Point(5,5);

        int b=1;
        changeIt(b);
        System.out.println(b);

        changeIt(pt1);
        System.out.println(pt1);

    }
}
