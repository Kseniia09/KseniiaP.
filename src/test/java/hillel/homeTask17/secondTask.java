package hillel.homeTask17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class secondTask {
   @Test
    public void CorrectData( ) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.get("https://the-internet.herokuapp.com/login");

        String UserName = "tomsmith";
        String UserPassword = "SuperSecretPassword!";

        WebElement password = driver.findElement(By.xpath(String.format("//label[text()='%s']/../input", "Password")));
        password.sendKeys(""+ UserPassword +"");


        WebElement username = driver.findElement(By.xpath(String.format("//label[text()='%s']/../input", "Username")));
        username.sendKeys(""+ UserName +"");

        driver.findElement(By.xpath("//*[contains(@class, 'radius')]")).click();


        driver.findElement(By.xpath("//*[contains(@class, 'button')]")).click();


        WebElement successText = driver.findElement(By.xpath("//*[@id='flash']"));
        //successText.isDisplayed();????
        Assert.assertTrue(successText.getText().contains("You logged out of the secure area!"));
        System.out.println(successText.getText());


        driver.quit();

    }
    @Test
    public void InCorrectData( ) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/login");

        String UserName = "hhhh";
        String UserPassword = "SuperSecretPassword!";

        WebElement password = driver.findElement(By.xpath(String.format("//label[text()='%s']/../input", "Password")));
        password.sendKeys(""+ UserPassword +"");


        WebElement username = driver.findElement(By.xpath(String.format("//label[text()='%s']/../input", "Username")));
        username.sendKeys(""+ UserName +"");

        driver.findElement(By.xpath("//*[contains(@class, 'radius')]")).click();

        WebElement errorText = driver.findElement(By.xpath("//*[@id='flash']"));
        //errorText.isDisplayed();????
        Assert.assertTrue(errorText.getText().contains("Your username is invalid!"));
        System.out.println(errorText.getText());

        driver.quit();
   }

}


