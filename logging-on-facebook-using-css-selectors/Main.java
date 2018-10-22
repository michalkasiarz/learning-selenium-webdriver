
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        /* Logging on facebook
        using CSS selectors
         */

        // hitting facebook URL
        driver.get("http://facebook.com");

        // locating element - email box - fill with an email
        driver.findElement(By.cssSelector("#email")).sendKeys("test1");

        // locating element - password box - fill with a password
        driver.findElement(By.cssSelector("#pass")).sendKeys("test2");

        // logging in using CSS selector
        driver.findElement(By.cssSelector("#loginbutton")).click();


    }
}
