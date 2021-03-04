package tests.ui;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import static framework.utils.webmanager.WebDriverManager.setWebDriver;

public class UIBaseTest {

    @BeforeClass
    public void setDriver(){
        setWebDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriverAndWindowsAfterClass(){
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
