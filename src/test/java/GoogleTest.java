import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test(alwaysRun = true)
    @Issue("GOOGLE-666")
    @TmsLink("TX-1")
    @Feature("some feature")
    @Description("Test verifies if we have right google searching")
    public void testGoogle() {
        browser = "chrome";
        open("https://www.wikipedia.org/");
        $(By.xpath("//*[@class='central-textlogo__image sprite svg-Wikipedia_wordmark']"))
                .shouldHave(text("Wikipedia"));
    }
}
