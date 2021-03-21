package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClassNameLoc extends Baseclass2{




    @Test
    public void idLoc() throws InterruptedException {
        driver.get("https://www.icicibank.com/");
        driver.findElement(By.className("ic-btn")).click();
        Thread.sleep(2000);

    }


}
