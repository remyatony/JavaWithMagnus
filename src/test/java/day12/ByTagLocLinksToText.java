package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ByTagLocLinksToText extends Baseclass2 {

    @Test
    public void linksToTextFile() throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"Links_List.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        driver.get("https://www.google.com/");
        //ArrayList<String>ele =new ArrayList<>();
      //  List<WebElement> links = driver.findElement----s------elements(By.tagName("a")); ***
        List<WebElement> links = driver.findElements(By.tagName("a"));


     /*   Collections.sort(links,
                new Comparator<WebElement>() {
                    @Override
                    public int compare(WebElement o1, WebElement o2) {
                        return o1.getText().compareTo(o2.getText());
                    }
                });
*/
        Map<String, String> linkMap = new TreeMap<>();
        for (WebElement ele : links){
            linkMap.put(ele.getText(), ele.getAttribute("href"));
        }

        for ( Map.Entry item:linkMap.entrySet()){
            System.out.println(item.getKey() + "----" +item.getValue());
        }

        for (WebElement ele : links){
           // System.out.println(ele.getText()+"-----"+ele.getAttribute("href"));
            bw.write(ele.getText());
            bw.write("      ******   ");
            bw.write(ele.getAttribute("href"));
            bw.newLine();
        }bw.newLine();
        bw.flush();
        bw.close();


    }
}
