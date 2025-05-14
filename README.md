# Art of Testing - Selenium Automation Script

This project demonstrates a basic Selenium WebDriver automation script written in Java. It interacts with the [Art of Testing Sample Site](https://artoftesting.com/sampleSiteForSelenium) using Firefox and performs a series of automated UI actions for software testing practice.

## 🔧 Features Automated

The script performs the following actions:

1. **Text Box** – Enters and clears text input.
2. **Hyperlink** – Clicks a link and navigates back.
3. **Radio Button and Checkbox** – Selects gender and an automation checkbox.
4. **Dropdown Menu** – Selects an option from a dropdown.
5. **Drag and Drop** – Drags an image into a target box using JavaScript execution.
6. **Page Information** – Prints the page title and URL.
7. **DOM Traversal** – Lists the total number of HTML elements and prints their tags and text content.
8. **Browser Management** – Maximizes the browser window and closes it at the end of the session.

## 🚀 Prerequisites

- Java JDK installed
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) or similar Java IDE
- [Selenium WebDriver](https://www.selenium.dev/) Java bindings
- [GeckoDriver](https://github.com/mozilla/geckodriver/releases) (for Firefox)

## ⚙️ Setup Instructions

1. **Clone or Download** this repository.
2. **Install GeckoDriver** and place the executable path in the code:
   ```java
   System.setProperty("webdriver.gecko.driver", "C:\\Path\\To\\geckodriver.exe");
