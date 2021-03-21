package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXPathOrLoc extends Baseclass2{

    @Test
    public void xpathOrLoc() throws InterruptedException {

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname' or @id='u_12_b_qf]")).sendKeys("rems", Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname' or @id='u_h_b_cI']"));
    }
}
