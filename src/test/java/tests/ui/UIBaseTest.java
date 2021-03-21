package tests.ui;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static framework.utils.webmanager.WebDriverManager.setWebDriver;

public class UIBaseTest {

    @BeforeMethod
    public void setDriverBeforeMethod() {
        setWebDriver();
        open("/");
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        WebDriverRunner.getWebDriver().quit();
    }
}
