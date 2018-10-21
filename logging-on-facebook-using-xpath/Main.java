
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        /* Logging on facebook
        using XPath locators
         */

        // hitting facebook URL
        driver.get("http://facebook.com");

        // locating element - email box - fill with an email
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("youremail@email.com");

        // locating element - password box - fill with a password
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("your_password");

        // logging in using XPath locator
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();


    }
}
