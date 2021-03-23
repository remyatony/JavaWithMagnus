package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AlertHandlingPractice extends Baseclass2{
    @Test
    public void alerts(){

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alt = driver.switchTo().alert();
        alt.accept();
        driver.findElement(By.id("login1")).sendKeys("Rems", Keys.ENTER);

    }
}
