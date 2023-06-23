package ua.challengin_dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingPage extends BasePage {


    @FindBy(xpath = "//*[contains(@class, 'button')]")
    private WebElement button1;

    @FindBy(xpath = "//*[contains(@class, 'button alert')]")
    private WebElement button2;

    @FindBy(xpath = "//*[contains(@class, 'button alert')]")
    private WebElement button3;

    public ChallengingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingPage clickButton1() {
        button1.click();
        return this;
    }

    public ChallengingPage clickButton2() {
        button2.click();
        return this;
    }

    public ChallengingPage clickButton3() {
        button3.click();
        return this;
    }

    public ChallengingPage findTable() {
        for (int i = 2; i <= 10; i++) {
            WebElement table4 = driver.findElement(By.xpath("//table//tr[" + i + "]/td[4]"));

            System.out.println(table4.getText());

        }
        return this;
    }
    public ChallengingPage buttonsClick(){
        clickButton1();
        clickButton2();
        clickButton3();
        return this;
    }
}