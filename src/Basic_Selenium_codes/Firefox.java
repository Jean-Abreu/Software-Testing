package Basic_Selenium_codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox
{
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\jeana\\OneDrive\\Desktop\\Spring 2025\\Software Testing\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.fgcu.edu/canvas/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}