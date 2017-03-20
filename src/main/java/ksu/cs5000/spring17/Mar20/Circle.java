package ksu.cs5000.spring17.Mar20;

class Circle implements IShape {
    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }

    public double getArea() { return Math.PI*radius*radius;}
    public double getPerimeter() {return 2*radius*Math.PI;}
    public String toString(){ return "Circle[radius:"+radius+"]"; }
}