import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

@Epic("Google examples")
@Feature("Google feature")
public class GoogleTest {

    @Test
    @Issue("GOOGLE-666")
    @TmsLink("TX-1")
    @Description("Test verifies if we have right google searching")
    public void testGoogle() {
        browser = "chrome";
        open("https://www.google.com/");

        String title = Selenide.title();

        assertEquals(title, "Google", "Title should be equals 'google'");
    }
}
