package hillel.homeTask17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class firstTask {
    @Test
    public void ChallengingDomTest(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.findElement(By.xpath("//*[contains(@class, 'button')]")).click();

        driver.findElement(By.xpath("//*[contains(@class, 'button alert')]")).click();

        driver.findElement(By.xpath("//*[contains(@class, 'button alert')]")).click();


        for (int i = 2; i <= 10; i++){
            WebElement table4 = driver.findElement(By.xpath("//table//tr["+ i + "]/td[4]"));

            System.out.println(table4.getText());
        }

        driver.quit();

        }

    }

