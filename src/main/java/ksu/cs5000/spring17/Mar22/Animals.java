package ksu.cs5000.spring17.Mar22;


public class Animals {

    public static  abstract class BaseAnimal implements IAnimal{
        protected int numberOfLegs;
        protected boolean isDomesticated, isAcquatic;

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public boolean isDomesticated() {
            return isDomesticated;
        }
        public boolean isAcquatic() {
            return isAcquatic;
        }
    }


    public static abstract class Bird extends BaseAnimal {
        public Bird() {
            this.numberOfLegs=2;
        }
    }

    public static class Eagle extends Bird {
        public Eagle() {
            this.isAcquatic=false;
            this.isDomesticated=false;
        }
        @Override
        public void produceSound() {
            System.out.println("Screech");
        }
    }

    public static class Dog extends BaseAnimal {
        public Dog() {
            this.isAcquatic=false;
            this.isDomesticated=true;
            this.numberOfLegs=4;
        }
        @Override
        public void produceSound() {
            System.out.println("woof");
        }
    }

    public static void main(String args[]) {
        BaseAnimal animals[] = {
                new Dog(),
                new Eagle()
        };

        int totalLegs=0;
        for(BaseAnimal a : animals) {
            a.produceSound();
            totalLegs+=a.getNumberOfLegs();
        }
        System.out.println("Total legs: "+totalLegs);
    }
}
