package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
    @Test
    public void testcase2(){
        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElementById("email").sendKeys("Hello");
        driver.findElementById("pass").sendKeys("Hello");
        driver.quit();
    }
}
