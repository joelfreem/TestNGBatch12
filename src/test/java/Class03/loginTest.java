package Class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginTest {
    WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test(groups = "regression")
    public void VerifyCredentials() throws InterruptedException {

        SoftAssert soft=new SoftAssert();

        String expectedText = "Invalid credentials";
        WebElement Username = driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        Username.sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.id("spanMessage")).getText();
//assertion to make sure that the message is correct
        soft.assertEquals(text,expectedText);


//        validate the display is true or not
        System.out.println("hello world");
        soft.assertTrue(displayed);


//        check all asseertions
        soft.assertAll();

    }

    @Test(groups = "regression")
    public void VerifyCredentials2() throws InterruptedException {

        SoftAssert soft=new SoftAssert();

        String expectedText = "Invalid credentials";
        Thread.sleep(2000);
        WebElement Username = driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        Username.sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.id("spanMessage")).getText();
//assertion to make sure that the message is correct
        soft.assertEquals(text,expectedText);


//        validate the diaplay is true or not
        System.out.println("hello world");
        soft.assertTrue(displayed);


//        check all asseertions
        soft.assertAll();

    }
    @AfterMethod(alwaysRun = true)
    public  void  CloseBrowser(){
        driver.quit();
    }
}
