package day11;

import org.testng.annotations.Test;

public class TC001  {


    @Test(priority = 1)
    public void openBrowser(){
        System.out.println("Open Browser");
    }

    @Test(priority = 2)
    public void openUrl(){
        System.out.println("Open url");
    }

    @Test(priority = 3)
    public void searchProduct(){
        System.out.println("search Product");
    }

    @Test(priority = 4)
    public void verifyPageTitle(){
        System.out.println("verify page title");
    }

    @Test(priority = 5)
    public void closeBrowser(){
        System.out.println("Close browser");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }

}
