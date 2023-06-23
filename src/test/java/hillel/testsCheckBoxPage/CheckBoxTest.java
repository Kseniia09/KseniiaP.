package hillel.testsCheckBoxPage;

import org.testng.annotations.Test;
import ua.pagesCheckBox.MainPage;


public class CheckBoxTest extends BaseTest{
    @Test
    public void checkBoxTest(){
        driver.get("https://the-internet.herokuapp.com/");

        MainPage mainPage = new MainPage(driver);
        mainPage.openChBoxPage()
                .checkAllChBoxs();
    }
}
