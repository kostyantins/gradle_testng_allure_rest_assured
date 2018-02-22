import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browser;

public class GoogleTest {

    @Step
    @Description("Looking for something")
    @Feature("Google")
    @Test
    public void testGoogle(){
        browser = "chrome";
        Selenide.open("https://www.google.com");
    }
}
