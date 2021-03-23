package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
       // ChromeOptions options = new ChromeOptions();
       // options.addArguments("--disable-notifications");
        //WebDriverManager.getInstance(SafariDriver.class).setup();
        driver = new SafariDriver();
    }

    @AfterClass
    public void afterClass(){
        //driver.Manage().Timeouts().ImplicitWait;driver.wait(1);
        driver.quit();

    }
}
