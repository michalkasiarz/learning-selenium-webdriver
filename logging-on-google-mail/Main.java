
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//michal//chrome_driver//chromedriver");
        WebDriver driver = new ChromeDriver();

        // hitting mail.google.com login URL
        driver.get("https://mail.google.com");

        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[3]/button")).click();
    }
}

