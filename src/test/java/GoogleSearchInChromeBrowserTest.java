import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchInChromeBrowserTest {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Test
    public void main() {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @Test
    public void search() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("btnI")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
