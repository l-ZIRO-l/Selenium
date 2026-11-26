package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValueLogin(){
        LoginPage loginpage=new LoginPage(driver);
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickLogin();

        System.out.print("The Title of the driver is: "+driver.getTitle()) ;
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }
}
