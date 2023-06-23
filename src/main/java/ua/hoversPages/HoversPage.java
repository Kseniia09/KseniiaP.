package ua.hoversPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage extends BasePage {

    @FindBy(xpath = "//*[@id='content']/div/div[1]")
    private WebElement User1;

    @FindBy(xpath = "//div[1]/div/h5")
    private WebElement Name1;

    @FindBy(xpath = "//*[@id='content']/div/div[2]")
    private WebElement User2;

    @FindBy(xpath = "//div[2]/div/h5")
    private WebElement Name2;

    @FindBy(xpath = "//*[@id='content']/div/div[3]")
    private WebElement User3;

    @FindBy(xpath = "//div[3]/div/h5")
    private WebElement Name3;

    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    Actions actions = new Actions(driver);

    public HoversPage findUser1() {
        actions.moveToElement(User1).perform();
        return this;
    }

    public HoversPage findUserName1() {
        System.out.println(Name1.getText());
        return this;
    }

    public HoversPage findUser2() {
        actions.moveToElement(User2).perform();
        return this;
    }

    public HoversPage findUserName2(){
        System.out.println(Name2.getText());
        return this;
    }

    public HoversPage findUser3(){
        actions.moveToElement(User3).perform();
        return this;
    }

    public HoversPage findUserName3(){
        System.out.println(Name3.getText());
        return this;
    }

    public HoversPage findAllUsersNames(){
        findUser1();
        findUserName1();
        findUser2();
        findUserName2();
        findUser3();
        findUserName3();
        return this;
    }
}