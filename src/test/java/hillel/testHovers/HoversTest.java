package hillel.testHovers;

import org.testng.annotations.Test;
import ua.hoversPages.HoversPage;

public class HoversTest extends BaseTest {
    @Test
    public void hoversTest(){

        HoversPage hoversPage = openApp().openHoversPage()
                .findAllUsersNames();
    }
}
