package hillel.testsCheckBoxPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import ua.pagesCheckBox.MainPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

/*  @BeforeSuite
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
    }

    @BeforeClass
    public void setUp() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }*/
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
    }
    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }

    public MainPage openApp(){
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }
}
