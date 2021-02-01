package tests.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class UIBaseTest {

    static {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://gsmserver.com";
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 200;
    }

    @BeforeTest
    public void doBeforeMethod(){
        open("/");
    }

    @AfterTest
    public void doAfterMethod(){
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
