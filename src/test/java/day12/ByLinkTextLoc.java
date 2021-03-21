package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByLinkTextLoc extends Baseclass2{




    @Test
    public void linktextLoc(){
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Images")).click();

    }


}
