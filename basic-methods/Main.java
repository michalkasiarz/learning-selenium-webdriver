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

        // getting page source
        System.out.println(driver.getPageSource());

    }
}
