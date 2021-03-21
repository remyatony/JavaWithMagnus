package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class CssSelectorStartsWith extends  Baseclass2{

    @Test
    public void cssSelectorStartsWith(){
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("input[class ^='gLFyf ']")).sendKeys("iphone", Keys.ENTER);
    }
}
