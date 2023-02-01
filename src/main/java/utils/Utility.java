package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Utility extends WebTestBase { 
    
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;
    private static final long IMPLICITE_WAIT = 20;
    
    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITE_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public static void dropelement(List<WebElement> elements, String text){
        for (WebElement e : elements) {
            System.out.println(e.getText());
            if (e.getText().equalsIgnoreCase(text)) {
                e.click();
                break;
            }
        }
    }

    public static void addCookie() {
        Cookie cookie = new Cookie("Welcome", "Eshoper");
        driver.manage().addCookie(cookie);

    }

    public static void setCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }
}