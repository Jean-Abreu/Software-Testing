package Assignments.Testing_Sites;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class art_of_testing {
    public static void main(String[] args) throws InterruptedException {
        //Setting system path for GeckoDriver (FireFox)
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\jeana\\OneDrive\\Desktop\\Spring 2025\\Software Testing\\geckodriver.exe");

        //Initializing WebDriver for FireFox
        WebDriver driver = new FirefoxDriver();

        //Navigating to the Art of Testing site
        driver.get("https://artoftesting.com/sampleSiteForSelenium");

        driver.manage().window().maximize();

        //Waiting 3 seconds to ensure automation
        Thread.sleep(3000);

        //1. Continued... Looking for TextBox and entering text
        driver.findElement(By.id("fname")).sendKeys("John Smith");

        Thread.sleep(3000);

        //Clearing the text written in the textbox
        driver.findElement(By.id("fname")).clear();

        Thread.sleep(3000);

        //2. Hyperlinks
        WebElement link = driver.findElement(By.linkText("This is a link"));
        link.click();
        driver.navigate().back(); //Returning to main page

        Thread.sleep(3000);

        //3. Checkboxes and Radio Buttons
        WebElement radioButton = driver.findElement(By.id("male"));
        radioButton.click();

        WebElement checkbox = driver.findElement(By.cssSelector("input.Automation"));
        checkbox.click();

        Thread.sleep(3000);

        //4. Dropdown Menus
        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Database Testing");

        Thread.sleep(3000);

        //5. Drag and Drop

        //Drag and drop
        WebElement source = driver.findElement(By.id("myImage"));
        WebElement target = driver.findElement(By.id("targetDiv"));
        Actions actions = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", target);
        Thread.sleep(500); // Allow some time for scrolling

        String script = "var src=arguments[0], tgt=arguments[1];" +
                "var dataTransfer = new DataTransfer();" +
                "src.dispatchEvent(new DragEvent('dragstart', { dataTransfer }));" +
                "tgt.dispatchEvent(new DragEvent('drop', { dataTransfer }));";
        js.executeScript(script, source, target);
        Thread.sleep(3000);

        //6. Getting title of page
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        //7. Getting the URL
        String url = driver.getCurrentUrl();
        System.out.println("Page URL: " + url);

        //8. Listing the size of web elements
        List<WebElement> allElements = driver.findElements(By.xpath("//*"));
        System.out.println("Total web elements: " + allElements.size());

        //9. Displaying all web elements
        for (WebElement element : allElements) {
            System.out.println("Tag: " + element.getTagName() + ", Text: " + element.getText());
        }

        //Closing the browser
        driver.quit();
    }

}
