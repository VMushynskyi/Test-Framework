package tests.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class UIBaseTest {

    static {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://gsmserver.com";
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 200;
    }

    public WebDriver getDriver(){
        return WebDriverRunner.getWebDriver();
    }

    @BeforeClass
    public void doBeforeMethod(){
        open("/");
    }

    @AfterClass
    public void doAfterMethod(){
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
