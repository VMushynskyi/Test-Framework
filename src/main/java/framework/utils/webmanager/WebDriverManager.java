package framework.utils.webmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static framework.utils.properties.PropertiesManager.getBaseUIURI;

public class WebDriverManager {

    public static void setWebDriver(){
        Configuration.startMaximized = true;
        Configuration.baseUrl = getBaseUIURI();
        Configuration.browser = WebDriverRunner.CHROME;
    }
}
