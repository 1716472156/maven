import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Open {
    WebDriver webDriver;

    @Test
    public void OpenOv(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LZH\\IdeaProjects\\Slelenium_day1\\drivers/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--widow-size=1920,1080");
//
//        WebDriver webDriver=new ChromeDriver();

       webDriver=new ChromeDriver(chromeOptions);

        webDriver.get("http://www.baidu.com");
        String s=webDriver.getTitle();
        System.out.println(s);

    }
    @AfterMethod
    public void Method(){
        webDriver.quit();
    }

}
