package day12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXPathContainLoc extends Baseclass2{
    @Test
    public void xpathContainsLoc(){
        driver.get("https://www.amazon.com/");
        //driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Hello,')]")).click();
       // driver.findElement(By.xpath("//span[(text()='Hello, Sign in')]")).click();

    }
}
