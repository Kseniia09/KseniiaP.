package ua.hoversPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
    }
    public HoversPage openHoversPage(){
        driver.findElement(By.linkText("Hovers")).click();
        return new HoversPage(driver);
    }
}
