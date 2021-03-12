package day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;

public class ReadPropFileInSelenium {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"config.properties";
        BufferedReader br = new BufferedReader(new FileReader(path));
        Properties prop =new Properties();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String val="";
        prop.load(br);
                val = prop.getProperty("url");
        System.out.println(val);
        driver.get(val);
        String val2="";
               val2 =prop.getProperty("search");
        System.out.println(val2);
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).
               sendKeys(val2+"\n");
       // driver.quit();



    }
}
