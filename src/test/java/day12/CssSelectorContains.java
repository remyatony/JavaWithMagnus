package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CssSelectorContains extends Baseclass2{

    @Test
    public void cssSelectorContains(){

        driver.get("https://www.google.com/");

        /*
        Contains *
        */
        driver.findElement(By.cssSelector("input[class *='gLFyf ']")).sendKeys("selenium jobs", Keys.ENTER);



    }
}
