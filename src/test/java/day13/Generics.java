package day13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generics {

    public static void acceptAlert(WebDriver driver){

        Alert alt = driver.switchTo().alert();
        alt.accept();

    }

    public static void dismissAlert(WebDriver driver){

        Alert alt = driver.switchTo().alert();
        alt.dismiss();
    }

    public static void acceptAlert(WebDriver driver, String text) throws InterruptedException {

        Alert alt = driver.switchTo().alert();
        alt.sendKeys(text);
        Thread.sleep(2000);
        alt.accept();
    }
}
