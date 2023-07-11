package ua.homeTask15Pages;

import LessonsAll.Pages.LoginPage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UploadPage  extends BasePage {
    public UploadPage(WebDriver driver){
        super(driver);
    }
    public UploadPage openUpPage(){
        driver.get("https://the-internet.herokuapp.com/upload");
        return this;
    }

    public UploadPage fileUploadButton(){
       WebElement fileButton =  driver.findElement(By.id("file-submit"));
       fileButton.click();
       return this;

    }

}
