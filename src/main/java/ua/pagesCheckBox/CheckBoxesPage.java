package ua.pagesCheckBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage extends BasePage {
    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//*[@id='checkboxes']/input[2]")
    private WebElement checkbox2;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public CheckBoxesPage checkChBox1(){

        if (checkbox1.isSelected()) {
            System.out.println("Checkbox №1 is selected");
        }else {
            System.out.println("Checkbox №1 is not selected");
            checkbox1.click();
        }
        return this;
    }

    public CheckBoxesPage checkChBox2(){
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox №2 is selected");
        }else {
            System.out.println("Checkbox №2 is not selected");
            checkbox2.click();
        }
        return this;
    }

    public void checkAllChBoxs(){
        checkChBox1();
        checkChBox2();
    }
}

