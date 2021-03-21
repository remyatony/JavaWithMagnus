package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ByTagLocLinksExample extends Baseclass2{

    @Test
    public void tagLocLinks(){
        driver.get("https://www.google.com");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("count ="+links.size());
        ArrayList<String> names = new ArrayList<>();

        for(WebElement ele : links){
            //System.out.println(ele+" ");
            System.out.println(ele.getText()+"-----------"+ele.getAttribute("href"));


        }

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

    }


}
