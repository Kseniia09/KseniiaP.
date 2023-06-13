package hillel.homeTask17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class thirdTask {
    @Test
    public void Checkboxes() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));  //??????????
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
        if (checkBox1.isSelected()) {
            System.out.println("Checkbox №1 is selected");
        }else {
            System.out.println("Checkbox №1 is not selected");
            checkBox1.click();
        }

        WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
        if (checkBox2.isSelected()) {
            System.out.println("Checkbox №2 is selected");
        }else {
            System.out.println("Checkbox №2 is not selected");
            checkBox2.click();
        }

        driver.quit();

    }

}
