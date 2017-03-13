package ksu.cs5000.spring17.Mar13;

public class Person {
    private String firstName, lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFormalFullName() {
        return lastName+", "+firstName; // you can reference instance variables without the this.
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void makeOlder() {
        ++age;
    }

    public String toString() {
        return "Person ["+firstName+", "+lastName+" is "+age+"]";
    }
}
