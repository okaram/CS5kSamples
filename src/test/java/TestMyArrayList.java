import org.junit.*;

import ksu.cs5000.spring17.Apr17.*;

public class TestMyArrayList {

    @Test
    public void testEmptyListHasZeroSize() {
        MyArrayList a1=new MyArrayList();
        Assert.assertEquals(0, a1.size());
    }


    @Test
    public void testAddingIncreasesSize() {
        MyArrayList a1=new MyArrayList();
        a1.add("One");

        Assert.assertEquals(1, a1.size());
    }


    @Test
    public void testAddingStoresData() {
        MyArrayList a1=new MyArrayList();
        a1.add("One");

        Assert.assertEquals("One", a1.get(0));
    }

    @Test
    public void testGetThrowsException() {
        MyArrayList a1=new MyArrayList();
        try {
            a1.get(-1);
            Assert.fail();

            a1.get(5);
            Assert.fail();
        } catch (IllegalArgumentException ia) {
            ;
        }

    }

}