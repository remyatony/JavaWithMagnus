package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ByTagLoc extends Baseclass2{




    @Test
    public void tagLoc(){
        driver.get("https://www.google.com");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("count ="+links.size());
        ArrayList<String> names = new ArrayList<>();
        for(WebElement ele : links){
            System.out.println(ele+" ");
            names.add(ele.getText());

        }
       /* for(String test : names){
            System.out.println(test);
        }*/
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

    }


}
