package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
    @Test
    public void testcase3(){
        System.setProperty("webdriver.chrome.driver", System.getenv("SeleniumChromeDriver"));
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElementById("email").sendKeys("GoodBye");
        driver.findElementById("pass").sendKeys("GoodBye");
        driver.quit();
    }
}
