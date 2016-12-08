import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SearchGoogle {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://seleniumserver:4444/wd/hub"), cap);

        driver.get("https://www.google.co.in");
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        driver.close();
    }
}
