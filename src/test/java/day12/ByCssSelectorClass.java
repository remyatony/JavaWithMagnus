package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCssSelectorClass extends Baseclass2 {
    @Test
    public void cssSelectorClass(){

        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Selenium jobs", Keys.ENTER);

    }
}
