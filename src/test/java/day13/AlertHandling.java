package day13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AlertHandling extends Baseclass2{

    @Test
    public void alertHandle(){

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alt =driver.switchTo().alert();
        alt.accept();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("rems", Keys.ENTER);
    }

}
