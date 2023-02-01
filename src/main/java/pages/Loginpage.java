package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class Loginpage extends WebTestBase {
    @FindBy(xpath = "//a[@class='menu-link']")
    WebElement loginBtn;

    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginclickBtn;

    public Loginpage()
    {
        PageFactory.initElements(driver, this);
    }
    public  void loginBtnClick()
    {
        Utility.waitUntilElementToBeClick(driver,loginBtn);
        loginBtn.click();
    }

    public void login(String userName, String password)
    {
        Utility.waitUntilElementToBeClick(driver,loginclickBtn);
        userNameTextBox.sendKeys(userName);

        passwordTextBox.sendKeys(password);
        loginclickBtn.click();
        // return new Homepage();

    }


}





