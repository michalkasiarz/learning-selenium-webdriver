import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        /* Locators supported by Selenium WebDriver:
        ID, ClassName, Name, linkText, Xpath, CSS
         */

        // hitting URL
        driver.get("http://facebook.com");

        // locating element - email box - fill with an email
        driver.findElement(By.id("email")).sendKeys("");

        // locating element - password box - fill with a password
        driver.findElement(By.id("pass")).sendKeys("");

        // logging in
        driver.findElement(By.id("loginbutton")).click();




    }
}
