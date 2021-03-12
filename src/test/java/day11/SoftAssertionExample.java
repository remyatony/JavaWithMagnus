package day11;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample extends Baseclass2 {
    @Test
    public void Test(){
        driver.get("https://www.google.com/");
        SoftAssert sa = new SoftAssert();
        String pageTitle =driver.getTitle();
        sa.assertEquals(pageTitle,"Facebook","Title mismatch");
        System.out.println("Ending...........");
        sa.assertAll();
    }
}
