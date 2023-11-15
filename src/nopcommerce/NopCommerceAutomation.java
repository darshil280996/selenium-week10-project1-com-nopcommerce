package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceAutomation {

    public static void main(String[] args) {
        // 1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open URL.
        driver.get("https://demo.nopcommerce.com/");

        // 3. Print the title of the page.
        System.out.println("Title: " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Navigate to URL.
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.get(loginUrl);

        // 7. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 8. Navigate back to the home page.
        driver.navigate().back();

        // 9. Navigate to the login page.
        driver.navigate().forward();

        // 10. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 11. Refresh the page.
        driver.navigate().refresh();

        // 12. Enter the email to the email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("your_email@example.com");

        // 13. Enter the password to the password field.
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("your_password");

        // 14. Click on Login Button.
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();

        // 15. Close the browser.
        driver.quit();
    }
}
