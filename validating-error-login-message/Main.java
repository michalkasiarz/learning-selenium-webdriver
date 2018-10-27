
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        /* Logging on salesforce.com
        using different locators and validating the error login message
         */

        // hitting salesforce.com login URL
        driver.get("https://login.salesforce.com/");

        // locating element - email box - using xpath locator
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test1");

        // locating element - password box - using CSS selector
        driver.findElement(By.cssSelector("#password")).sendKeys("test1");

        // logging in using id locator
        driver.findElement(By.id("Login")).click();

        // getting error login message by customized XPath and printing to the console
        System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
    }
}

