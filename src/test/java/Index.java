import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/mpinevich/Tools/chromedriver");
        wd = new ChromeDriver();
        wd.get("file:///Users/mpinevich/Downloads/21.index.html");
    }

    @Test
    public void cssLocators() {
        //by tag name
        WebElement element = wd.findElement(By.tagName("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
    }

    @AfterClass
    public void exit(){
        wd.quit();
    }
}
