package hillel.homeTask13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDrop {
    @Test
    public void dragAndDrop() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        Actions actions = new Actions(driver);


        WebElement drop = driver.findElement(By.id("droppable"));
        WebElement drag = driver.findElement(By.id("draggable"));

        actions.dragAndDrop(drag,drop).perform();


//        actions.moveToElement(drag).clickAndHold(drag)
//                        .moveToElement(drop).release().perform();

        WebElement text = driver.findElement(By.id("droppable"));
        Assert.assertTrue(text.getText().contains("Dropped!"));
        System.out.println(text.getText());

        driver.quit();

    }
}
