import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    @BeforeClass
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver", "/Users/mpinevich/Tools/chromedriver");
        WebDriver wd = new ChromeDriver();
    }

    @Test
    public void loginSuccess() {

    }

    @AfterClass
    public void postConditions() {

    }
}
