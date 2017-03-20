package ksu.cs5000.spring17.Mar20;

public class Shapes {


    public static void main(String args[]) {

        IShape shapes[]= {
                new Rectangle(10,20),
                new Circle(10)
        };
        for(IShape s : shapes) {
            System.out.println(s.getArea());
        }

        for(int i=0; i<shapes.length ; ++i) {
            System.out.println(shapes[i].getArea());
        }
    }
}
