package Basic_Selenium_codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jeana\\OneDrive\\Desktop\\Spring 2025\\Software Testing\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fgcu.edu/canvas/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}
