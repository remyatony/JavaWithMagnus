package day11;

import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.*;

public class Annotations {

        @BeforeSuite
        public void beforeSuite(){
            System.out.println("In Before suite");
        }
        @BeforeTest
        public void beforeTest(){
        System.out.println("In before Test");
    }
        @BeforeClass
        public void beforeClass(){
            System.out.println("In Before Class");
        }
        @BeforeMethod
        public void beforeMethod(){
            System.out.println("In Before Method");
        }
        @Test
        public void test(){
            System.out.println("In Test");
        }
        @AfterMethod
        public void afterMethod(){
            System.out.println("In After Method");
        }
        @AfterClass
        public void afterClass(){
            System.out.println("in after class");
        }
        @AfterTest
        public void afterTest(){
            System.out.println("In After Test");
        }
        @AfterSuite
        public void afterSuite(){
            System.out.println("In After Suite");
        }
        }

