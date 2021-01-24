package tests.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class UIBaseTest {

    static {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://gsmserver.com";
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 200;
    }

    @BeforeMethod
    public void doBeforeMethod(){
        open("/");
    }

    @AfterMethod
    public void doAfterMethod(){
        WebDriverRunner.getWebDriver().close();
    }
}
