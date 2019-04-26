import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class test {


    @Test
    public void testCase1(){
        System.out.println("注解");
    }
    @Test
    public void testCase2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("注解2");
    }
    @BeforeTest
    public void  BeforeTestcase1(){
        System.out .println("这是程序头");
    }
    @AfterTest
    public void AfterTest1(){
        System.out.println("这是程序尾部");
    }
    @BeforeMethod
    public void BeforeMethod1(){
        System.out.println("这是Test头部");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("这是test尾部");
    }

}
