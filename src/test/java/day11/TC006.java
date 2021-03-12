package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC006 extends Baseclass2 {

    @Test
    public void Test1(){

        driver.get("https://www.google.com");
        Reporter.log("the user is in "+driver.getCurrentUrl());
        driver.findElement(By.name("q")).sendKeys("Selenium jobs",Keys.ENTER);

    }
}

