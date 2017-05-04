import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchCanaryHeadlessTest {

    private static WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
        chromeOptions.addArguments("--headless");

        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void main() {
        driver.get("http://www.google.com");
    }

    @Test
    public void search() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("btnI")).click();
        driver.findElement(By.name("q")).sendKeys("cheese");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
