import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWorkTest {

    WebDriver driver;

    @Before
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Driver Setup Done");
    }
    @Test
    public void testBrowser() throws InterruptedException {
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(3000);
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        System.out.println("Launched the application");

         Logger logger= LogManager.getLogger(SeleniumWorkTest.class.getName());
        logger.trace("This is TRACE Log");

    }

    @Test
    public void testActions() throws InterruptedException {

        driver.get("https://www.browserstack.com/");
        Thread.sleep(3000);
        WebElement contackUs=driver.findElement(By.id("customFooterContactBtn"));
        Actions actions=new Actions(driver);
        actions.moveToElement(contackUs).click().build().perform();
//        contackUs.click();
        System.out.println("Launched the application");

    }

    @After
    public void tearDown()
    {
//        driver.quit();
        System.out.println("Application Closed");
    }
}
