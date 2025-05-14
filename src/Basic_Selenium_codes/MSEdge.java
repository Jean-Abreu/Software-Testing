package Basic_Selenium_codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MSEdge
{
    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\jeana\\OneDrive\\Desktop\\Spring 2025\\Software Testing\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.fgcu.edu/canvas/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}