package hillel.homeTask16Test;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import ua.homeTask16Page.DynamicLoadingPage;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingTest {


    @Test
    public void dynLoadingTestExemple1(){
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.savePageSource = false;
        open("/dynamic_loading");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

        dynamicLoadingPage.exampleFirst();

    }
    @Test
    public void dynLoadingTestExemple2(){
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.savePageSource = false;
        open("/dynamic_loading");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

        dynamicLoadingPage.exampleSecond();

    }
}
