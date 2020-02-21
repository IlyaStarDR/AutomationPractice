package CheckTestAutomation;


import org.testng.annotations.Test;

public class CheckTestNG {

    @Test
    public void checkIs() {
        int x = 10;
        int y = 7;
            System.out.println(x > y);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void secondTest() {
        int x = 10;
        int y = 0;
        int a = x / y;
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void thirdTest() {
        throw new NullPointerException();
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void fourth() {
        throw new IndexOutOfBoundsException();
    }


    @Test(groups = "method1")
    public void testingMethod1() {
        System.out.println("Method - testingMethod1()");
    }

    @Test(groups = "method2")
    public void testingMethod2() {
        System.out.println("Method - testingMethod2()");
    }

    @Test(groups = "method1")
    public void testingMethod1_1() {
        System.out.println("Method - testingMethod1_1()");
    }

    @Test(groups = "method4")
    public void testingMethod4() {
        System.out.println("Method - testingMethod4()");
    }
}
