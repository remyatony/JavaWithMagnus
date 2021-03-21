package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpathStartsWithLoc extends Baseclass2{

   @Test
    public void byXpathStartsWith(){
       driver.get("https://www.amazon.com/");
       driver.findElement(By.xpath("//span[starts-with(text(),'Hello,')]")).click();

    }
    @Test
    public void byXpathStartsWith2(){

       driver.get("https://www.google.com/");
       driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf ')]")).sendKeys("selenium jobs", Keys.ENTER);

    }
}
