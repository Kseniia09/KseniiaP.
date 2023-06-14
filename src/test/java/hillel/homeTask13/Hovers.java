package hillel.homeTask13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Hovers {
    @Test
    public void hoversNames() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);


        WebElement user1 = driver.findElement(By.xpath("//*[@id='content']/div/div[1]"));
        actions.moveToElement(user1).perform();
        WebElement userName1 = driver.findElement(By.xpath("//div[1]/div/h5"));
        System.out.println(userName1.getText());

        WebElement user2 = driver.findElement(By.xpath("//*[@id='content']/div/div[2]"));
        actions.moveToElement(user2).perform();
        WebElement userName2 = driver.findElement(By.xpath("//div[2]/div/h5"));
        System.out.println(userName2.getText());

        WebElement user3 = driver.findElement(By.xpath("//*[@id='content']/div/div[3]"));
        actions.moveToElement(user3).perform();
        WebElement userName3 = driver.findElement(By.xpath("//div[3]/div/h5"));
        System.out.println(userName3.getText());


        driver.quit();
    }
}
