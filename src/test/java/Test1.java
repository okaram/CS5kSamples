import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import ksu.cs5000.spring17.Apr17.*;

public class Test1 {

    @Test
    public void testAdd() {
        Assert.assertEquals(8,   ClassToTest.add(3,5));
        Assert.assertEquals(18,  ClassToTest.add(13,5));
        Assert.assertEquals(18,  ClassToTest.add(3,15));
    }

    @Test
    public void testStatsCalculator() {

        StatsCalculator c1=new StatsCalculator();
        Assert.assertEquals(  0,  c1.getNumberOfSamples());

        c1.add(1);
        c1.add(2);
        Assert.assertEquals(  2,  c1.getNumberOfSamples());
        Assert.assertEquals(  1.5, c1.getAverage(), .0001 );
    }

    @Ignore
    @Test
    public void testStatsCalculator2() {

        StatsCalculator c1=new StatsCalculator();
        Assert.assertEquals(  0,  c1.getNumberOfSamples());

        c1.add(1);
        c1.add(2);
        Assert.assertEquals(  2,  c1.getNumberOfSamples());
        Assert.assertEquals(  1.6, c1.getAverage(), .0001 );
    }

}