package framework.utils.webmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static framework.utils.properties.PropertiesManager.getBaseAUiURI;

public class WebDriverManager {

    public static void setWebDriver(){
        com.codeborne.selenide.Configuration.startMaximized = true;
        com.codeborne.selenide.Configuration.baseUrl = getBaseAUiURI();
        Configuration.browser = WebDriverRunner.CHROME;
    }
}
