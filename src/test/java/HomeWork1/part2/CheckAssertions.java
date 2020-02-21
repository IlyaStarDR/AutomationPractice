package HomeWork1.part2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CheckAssertions {


    @Test
    public void checkIsStringsEquals() {
        String actual = "Google";
        String expected = "Google";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkIsStringsNotEquals() {
        String actual = "Google";
        String expected = "Gooogle";
        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void checkIsStringsEqualsWithMessage() {
        String actual = "Google";
        String expected = "Google";
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void checkIsStringsNotEqualsWithMessage() {
        String actual = "Google";
        String expected = "Google";
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void checkIsBooleansEqualsWithMessage() {
        Boolean actual = true;
        Boolean expected = true;
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void checkIsBooleansNotEqualsWithMessage() {
        Boolean actual = false;
        Boolean expected = Boolean.FALSE;
        Assert.assertEquals(actual, expected, "Strings are not equals");
    }

    @Test
    public void checkIsBooleanArrayListsEqualsWithMessage() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        ArrayList<Boolean> booleanArrayList2 = new ArrayList<Boolean>();

        booleanArrayList1.add(true);
        booleanArrayList1.add(true);

        booleanArrayList2.add(true);
        booleanArrayList2.add(true);
        Assert.assertEquals(booleanArrayList1, booleanArrayList2, "Collections are not equals");
    }

    @Test
    public void checkIsBooleanArrayListsNotEqualsWithMessage() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        ArrayList<Boolean> booleanArrayList2 = new ArrayList<Boolean>();

        booleanArrayList1.add(true);
        booleanArrayList1.add(true);

        booleanArrayList2.add(true);
        booleanArrayList2.add(Boolean.TRUE);
        Assert.assertEquals(booleanArrayList1, booleanArrayList2, "Collections are not equals");
    }

    @Test
    public void checkIsBooleanArrayListsEmptyWithMessage() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(true);
        Assert.assertTrue(booleanArrayList1.contains(true), "Collection is empty");
    }

    @Test
    public void checkIsBooleanArrayListNotEmpty() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(Boolean.TRUE);
        Assert.assertFalse(booleanArrayList1.isEmpty(), "Collection is empty");
    }


    @Test
    public void checkIsBooleanArrayListEmptyWithMessage() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(true);
        Assert.assertFalse(booleanArrayList1.isEmpty(), "Collection is empty");
    }

    @Test
    public void checkIsBooleanArrayListNotEmptyWithMessage() {
        ArrayList<Boolean> booleanArrayList1 = new ArrayList<Boolean>();
        booleanArrayList1.add(false);
        boolean condition = booleanArrayList1.isEmpty();
        Assert.assertFalse(condition, "Collection is empty");
    }
}
