package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
       String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();
        //launch the Chrome browser
        driver.get(baseUrl);
        //will give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //get the title of web browser
        String title = driver.getTitle();
        System.out.println(title);
        //getting the current url for the browser
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //getting the page source for the driver
        System.out.println("Page source: " + driver.getPageSource());
        //searching the email field and finding the email field element
        WebElement emailFIeld = driver.findElement(By.id("user[email]"));
        //sending the email keys in email field
        emailFIeld.sendKeys("sitaram123@gmail.com");
        //searching the password field and finding the password field element
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        //sending the password keys in password field
        passwordField.sendKeys("sitaram123");
        //closing the browser
        driver.close();
    }
}
