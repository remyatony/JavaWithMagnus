package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseClass {

    WebDriver driver;
        @BeforeTest
        public void openBrowser() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
         //   System.out.println("This is before Test");
        }
        @BeforeClass
        public void getURL() {
          //  System.out.println("This is before Class");
            driver.get("https://www.amazon.com");

        }
        @AfterClass
        public void closeBrowser(){
            driver.close();
            driver.quit();
         //   System.out.println("This is closing browser");

        }
        @BeforeMethod
        public void beforeMethod(){
         //   System.out.println("this is before method");
        }
    }


