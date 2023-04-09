package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
static WebDriver driver;
    public static void main(String[] args) {
        //if else conditions apply as we have more than one browser to check
if(browser.equalsIgnoreCase("Chrome")){
    driver = new ChromeDriver();
} else if (browser.equalsIgnoreCase("FireFox")) {
    driver = new FirefoxDriver();

} else if (browser.equalsIgnoreCase("Edge")) {
    driver = new EdgeDriver();

}else {
    System.out.println("Wrong Browser name");
}
//getting the base Url
driver.get(baseUrl);
//we can see full screen browser
driver.manage().window().fullscreen();
//getting current URL
driver.getCurrentUrl();
//closing the browser
driver.close();
    }
}
