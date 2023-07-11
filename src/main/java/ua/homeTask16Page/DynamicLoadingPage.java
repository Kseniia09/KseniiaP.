package ua.homeTask16Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicLoadingPage {

    private SelenideElement example1 = $(By.linkText("Example 1: Element on page that is hidden"));
    private SelenideElement buttonStart = $("#start");
    private SelenideElement example2 = $(By.linkText("Example 2: Element rendered after the fact"));
    private SelenideElement message = $(By.id("//*[@id='finish']"));
    public void exampleFirst(){
        example1.click();
        buttonStart.shouldBe(Condition.enabled, Duration.ofSeconds(6))
                .click();
        message.shouldBe(Condition.visible)
                .shouldHave(Condition.text("Hello World!"));
    }

    public void exampleSecond(){
        example2.click();
        buttonStart.shouldBe(Condition.enabled,Duration.ofSeconds(6))
                .click();
        message.shouldBe(Condition.visible)
                .shouldHave(Condition.text("Hello World!"));
    }
}
