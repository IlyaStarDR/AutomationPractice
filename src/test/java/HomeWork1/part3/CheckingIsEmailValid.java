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
                        "aB5@d4.ck",
                        "KoLyWaN_1999!03_04_!@ukr30.netuk",
                };
    }

    @Test(dataProvider = "checkEmailIsValid")
    public void testCheckEmailIsValid(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Unexpected result" + email);
    }
}
