package day13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertHandlingUsingGenerics extends Baseclass2 {
    @Test
    public void alertOK() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()= 'Click for JS Alert']")).click();
        Thread.sleep(2000);
        Generics.acceptAlert(driver);
        String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("Result is "+result );

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()= 'Click for JS Confirm']")).click();
        Thread.sleep(2000);
        Generics.dismissAlert(driver);
        String result2=driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("Result is "+result2 );
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()= 'Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Generics.acceptAlert(driver,"hello");
        Thread.sleep(2000);
        String result3=driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("Result is "+result3 );









    }
}
