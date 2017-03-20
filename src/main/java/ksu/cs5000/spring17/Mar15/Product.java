package ksu.cs5000.spring17.Mar15;

public class Product {
    public String name;
    public double price;

    Product(String name, double price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString( ) {
        return "Product name="+name+" price="+price;
    }


}
