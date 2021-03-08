package framework.utils.webmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static framework.utils.properties.PropertiesManager.getBaseAUiURI;

public class WebDriverManager {

    public static void setWebDriver(){
        Configuration.startMaximized = true;
        Configuration.baseUrl = getBaseAUiURI();
        Configuration.browser = WebDriverRunner.CHROME;
    }
}
