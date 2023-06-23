package hillel.testChallengingPage;

import org.testng.annotations.Test;
import ua.challengin_dom.ChallengingPage;

public class ChallengingTest extends BaseTest{
    @Test
    public void chalTest(){
        ChallengingPage challengingPage = openApp().openChalPage()
                .buttonsClick()
                .findTable();
    }
}
