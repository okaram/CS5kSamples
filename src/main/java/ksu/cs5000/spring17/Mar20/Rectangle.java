package ksu.cs5000.spring17.Mar20;

class Rectangle implements IShape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public double getArea() { return width*height; }

    @Override
    public double getPerimeter() { return 2*(width+height); }
    public String toString(){ return "Rectangle[width:"+width+" height:"+height+"]"; }
}