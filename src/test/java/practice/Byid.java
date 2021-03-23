package practice;

import day11.BaseClass;
import day12.Baseclass2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Byid extends Baseclass2 {
    @Test
    public void idLoc(){
        driver.get("https://www.google.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("amazon", Keys.ENTER);
        driver.findElement(By.className("cfxYMc JfZTW c4Djg MUxGbd v0nnCb"));

    }


}
