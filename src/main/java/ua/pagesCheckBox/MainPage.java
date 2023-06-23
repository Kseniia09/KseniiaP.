package ua.pagesCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//*Main Page https://the-internet.herokuapp.com
public class MainPage extends BasePage{
    public MainPage(WebDriver driver){
        super(driver);
    }
    public CheckBoxesPage openChBoxPage(){
        driver.findElement(By.linkText("Checkboxes")).click();
        return new CheckBoxesPage(driver);
    }
}
