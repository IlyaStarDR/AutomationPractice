package HomeWork1.part3;

import EmailValidator.Email;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckingIsEmailInvalid {
    @DataProvider(name = "checkEmailIsInvalid")
    public static Object[] getInvalidEmail() {
        return new Object[]
                {
                        "a@2.sdf",
                        "",
                        "  ",
                        "B5@4.k",
                        "5KoLyWaN_1999!03_04@ukrL30.netukr",
                        "Петя_Сивухин1997@mail.ru",
                        "zoDDycEfo!6296Mail.com",
                        "assAllIqeDy_8249@aiLcom",
                        null,
                        "qWe#r|tY1_0!@rU9.com",
                        "qWertY1_0!@^`U9.com",
                        "qWertY1_0!@rU9.co$"
                };
    }

    @Test(dataProvider = "checkEmailIsInvalid")
    public void testCheckEmailIsInvalid(String email) {
        try {
            boolean actualResult = Email.isEmailCorrect(email);
            Assert.assertFalse(actualResult, "Unexpected result");
            System.out.println("FAILED: " + email);
        } catch (RuntimeException e) {
            System.out.println("FAILED: " + email);
        }
    }
}
