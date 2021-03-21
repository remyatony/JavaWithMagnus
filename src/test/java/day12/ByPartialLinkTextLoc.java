package day12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByPartialLinkTextLoc extends Baseclass2{




    @Test
    public void partialLinktextLoc(){
        driver.get("https://www.google.com");
        driver.findElement(By.partialLinkText("Ima")).click();

    }


}
