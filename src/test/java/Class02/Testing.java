package Class02;

import org.testng.annotations.*;

public class Testing {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("I am before suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("I am after suit");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test :)");
    }
    @AfterTest
    public void afterTest(){
            System.out.println("I am after test :)");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class method");
    }

    @BeforeMethod
    public void before(){
        System.out.println("This is before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("This is after method");
    }

    @Test
    public void Test(){
        System.out.println("You actin like you hate me");
    }
    @Test
    public void Test2(){
        System.out.println("where is yo loveeeeeeee");
    }
}
