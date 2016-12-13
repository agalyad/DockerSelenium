import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SearchGoogle {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("Print Google");
//        DesiredCapabilities cap = DesiredCapabilities.firefox();
//        cap.setCapability("webdriver_firefox_port", 4444);
//        System.out.println(cap);
//        System.out.println(cap.toString());
//        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), cap);

//        FirefoxProfile profile = new FirefoxProfile();
//        profile.setPreference("webdriver.firefox.port", 4444);
//         WebDriver driver = new FirefoxDriver(profile);

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.co.in");
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        driver.close();
    }
}
