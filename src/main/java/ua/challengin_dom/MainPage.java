package ua.challengin_dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public ChallengingPage  openChalPage(){
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new ChallengingPage(driver);

    }
}
