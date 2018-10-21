
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        // hitting URL
        driver.get("http://google.com");

        // filling text into google engine
        driver.findElement(By.className("gsfi")).sendKeys("Java documentation");

        // navigating further by clicking on search
       driver.findElement(By.className("lsbb")).click();

    }
}