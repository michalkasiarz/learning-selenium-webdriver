import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        // hitting URL
        driver.get("http://www.onet.pl");

        // validating page title
        System.out.println(driver.getTitle());

        // validating URL
        System.out.println(driver.getCurrentUrl());

        // hitting another URL
        driver.get("http://google.com");

        // navigating back to the first URL: http://www.onet.pl
        driver.navigate().back();

        // navigating forward to http://google.com
        driver.navigate().forward();

        // validating page title
        System.out.println(driver.getTitle());

        // validating URL
        System.out.println(driver.getCurrentUrl());

        // closing the browser
        driver.close();

    }
}
