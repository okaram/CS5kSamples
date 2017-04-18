package ksu.cs5000.spring17.Apr17;


public class StatsCalculator {
    double sum;
    int n;

    public void add(double number) {
        sum+=number;
        ++n;
    }

    public int getNumberOfSamples() {return n;}

    public double getAverage() {return sum/n;}
}
