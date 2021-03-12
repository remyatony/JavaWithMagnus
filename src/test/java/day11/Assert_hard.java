package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_hard extends Baseclass2 {
    @Test
    public void assertions(){
        driver.get("https://www.google.com/");
      String browserTitle =  driver.getTitle();
        System.out.println("browser title is "+browserTitle);
        Assert.assertEquals(browserTitle,"Google","Title mismatch");


    }

}
