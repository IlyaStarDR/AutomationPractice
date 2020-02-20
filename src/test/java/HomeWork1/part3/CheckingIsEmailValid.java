package HomeWork1.part3;

import EmailValidator.Email;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckingIsEmailValid {
    @DataProvider(name = "checkEmailIsValid")
    public static Object[] getValidEmail() {
        return new Object[]
                {
                        "dD3_!@fA8.dd",
                        "aB5@d4.ck",
                        "KoLyWaN_1999!03_04@ukr30.netuk",
                        "qWertY1_0!@rU9.com"
                };
    }

    @Test(dataProvider = "checkEmailIsValid")
    public void testCheckEmailIsValid(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Unexpected result");
        System.out.println("PASSED: " + email);
    }
}
