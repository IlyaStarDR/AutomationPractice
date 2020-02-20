package HomeWork1.part2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckAssertions {


    @Test
    public void firstTest() {
        String actual = "Google";
        String expected = "Google";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void secondTest() {
        String actual = "Google";
        String expected = "Gooogle";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void thirdTest() {
        String actual = "Google";
        String expected = "Gooogle";
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void fourthTest() {
        String actual = "Google";
        String expected = "Google";
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void fifthTest() {
        Boolean actual = 5 > 4;
        Boolean expected = true;
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void sixthTest() {
        Boolean actual = 5 < 4;
        Boolean expected = true;
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void seventhTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        ArrayList<Boolean> booleanArrayList2 = new ArrayList<Boolean>();

        booleanArrayList1.add(true);
        booleanArrayList1.add("Hello".length() != 0);

        booleanArrayList2.add(2 < 3);
        booleanArrayList2.add(true);
        Assert.assertEquals(booleanArrayList1, booleanArrayList2, "Collections are not equals");
    }

    @Test
    public void eightTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        ArrayList<Boolean> booleanArrayList2 = new ArrayList<Boolean>();

        booleanArrayList1.add(true);
        booleanArrayList1.add("Hello".length() != 0);

        booleanArrayList2.add(2 < 3);
        booleanArrayList2.add(false);
        Assert.assertEquals(booleanArrayList1, booleanArrayList2, "Collections are not equals");
    }

    @Test
    public void ninthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertTrue(condition);
    }

    @Test
    public void tenthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(false);
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertTrue(condition);
    }

    @Test
    public void eleventhTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertTrue(condition, "Collection is empty");
    }

    @Test
    public void twelfthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(false);
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertTrue(condition, "Collection is empty");
    }
//
    @Test
    public void thirteenthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertFalse(condition);
    }

    @Test
    public void fourteenthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(false);
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertFalse(condition);
    }

    @Test
    public void fifteenthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertFalse(condition, "Collection is empty");
    }

    @Test
    public void sixteenthTest() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(false);
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertFalse(condition, "Collection is empty");
    }
}
