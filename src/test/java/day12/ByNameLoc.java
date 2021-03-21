package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByNameLoc extends Baseclass2{




    @Test
    public void nameLoc(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Roblox", Keys.ENTER);

    }


}
