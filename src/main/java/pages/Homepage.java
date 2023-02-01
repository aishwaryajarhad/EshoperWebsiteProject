package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import java.util.List;


public class Homepage extends WebTestBase {
    @FindBy(xpath = "//a[@class='menu-link']")
    WebElement loginBtn;

    @FindBy(xpath =  "//i[@class=' icon-magnifier']")
    WebElement searchIcon;

    @FindBy(id =  "ocean-search-form-1")
    WebElement searchbox;

    @FindBy(xpath =  "//img[@class='attachment-thumbnail size-thumbnail wp-post-image']")
    WebElement image;

    @FindBy(xpath =  "//span[text()='Electronic Items']")
    WebElement itemselect;

    @FindBy(name =  "orderby")
    WebElement listitem;

    @FindBy(xpath =  "//select[@name='orderby']//child::option")
    List<WebElement> elements;





    public Homepage()
    {
        PageFactory.initElements(driver,this);
    }
   // public void loginClick()
   // {
    //    loginClick();
   // }

    public void search()
    {
        searchIcon.click();
    }

    public void searchbar(String searchtext){
        searchbox.sendKeys(searchtext);
        searchbox.sendKeys(Keys.ENTER);

    }

    public void imagetag()
    {
        image.click();
    }

   public static void mouseHoverOnTabAndLaptop() {
    }

    public void dropdown(String text){
        itemselect.click();
        listitem.click();
        Utility.dropelement(elements,text);


    }
    public void cookiesselect(){
        Utility.addCookie();
        Utility.setCookies();
    }





}