package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXPathLoc extends Baseclass2{




    @Test
    public void idLoc(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("iphone",Keys.ENTER);

    }


}
