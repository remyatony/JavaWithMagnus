package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class XPathFollowingLoc extends Baseclass2 {
    @Test
    public void XPathFollowing() {
        driver.get("https://www.marketwatch.com/tools/marketsummary");
        ArrayList<String> str = new ArrayList<String>();

        str.add("Dow Jones Industrial Average");
        str.add("NASDAQ Composite Index");
        str.add("S&P 500 Index");
        str.add("Global Dow Realtime USD");
        str.add("Dow Jones Utility Average...");

        for (String newStr : str) {
    String val= driver.findElement(By.xpath("//table[@id='marketsummaryindexes']/tbody/tr/td/a[text()='"+newStr+"']//following::td[1]")).getText();
            System.out.println(newStr+"---------"+val);
        }
    }
}
