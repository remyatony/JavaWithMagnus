package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXPathAndLoc extends Baseclass2{

    @Test
    public void XpathAnd() throws InterruptedException {

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Rems", Keys.ENTER);

    }
}
