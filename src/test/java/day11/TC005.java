package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC005 extends BaseClass {
    @Test
    public void searchProduct() {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12", Keys.ENTER);

        System.out.println("search Product");
        Reporter.log("User is in "+driver.getCurrentUrl());
        /*
       String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
       */
        Reporter.log("Page title is "+driver.getTitle());

    }
    /*
     @Test
     public void test2(){
         System.out.println("this is a dummy test");
     }
    */

}