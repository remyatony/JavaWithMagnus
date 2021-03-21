package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CssSelectorEndsWith extends Baseclass2{
    @Test
    public void cssSelectorEndsWith(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("input[id $='textbox']")).sendKeys("iphone", Keys.ENTER);
    }
}
