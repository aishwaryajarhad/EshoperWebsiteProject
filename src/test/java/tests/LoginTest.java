package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Homepage;
import pages.Loginpage;
import testbase.WebTestBase;

import javax.sound.sampled.AudioFileFormat;

public class LoginTest extends WebTestBase {

    Homepage homePage;
    Loginpage loginPage;

    public LoginTest() { super();}

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new Homepage();
        loginPage = new Loginpage();
    }
    @Test
    public void verifyLoginWithValidCredential()  {
        SoftAssert softAssert = new SoftAssert();
        loginPage.loginBtnClick();
       // homePage.closedSecondAdvertised();
       // homePage.loginClick();
        loginPage.login(prob.getProperty("userName"),prob.getProperty("password"));
        softAssert.assertAll();

    }
    @AfterMethod
    public void aftermethod()
    {
        driver.close(); }
}
