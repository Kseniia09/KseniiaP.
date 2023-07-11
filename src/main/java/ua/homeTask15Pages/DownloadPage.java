package ua.homeTask15Pages;

import LessonsAll.Pages.LoginPage.BasePage;
import org.openqa.selenium.WebDriver;


public class DownloadPage extends BasePage {
    public DownloadPage(WebDriver driver){
        super(driver);
    }
    public DownloadPage openDownPage(){
        driver.get("https://the-internet.herokuapp.com/download");
        return this;
    }

}
