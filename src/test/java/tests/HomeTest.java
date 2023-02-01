package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Homepage;
import pages.Loginpage;
import testbase.WebTestBase;

import javax.sound.sampled.AudioFileFormat;
import java.io.IOException;
import java.util.logging.FileHandler;

public class HomeTest extends WebTestBase {
    Homepage homePage;
    Loginpage loginPage;

    public HomeTest()

    {
        super();
    }

    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
        homePage = new Homepage();
        loginPage = new Loginpage();
    }

    @Test
    public void verifySearch()
    {
    SoftAssert softAssert = new SoftAssert();
    homePage.search();
    homePage.searchbar(prob.getProperty("searchtext"));
    homePage.imagetag();
    softAssert.assertAll();
    }
@Test
public void verifyDropdown(){
    SoftAssert softAssert = new SoftAssert();
    homePage.dropdown(prob.getProperty("text"));

    softAssert.assertAll();
}
  @Test
  public void verifyCookies(){
      SoftAssert softAssert = new SoftAssert();
      homePage.cookiesselect();
      softAssert.assertAll();

  }
    @AfterMethod
    public void afterMethod()
    {
        driver.close();
    }

}