package framework.ui.business.services;

import framework.ui.core.pages.MainPage;
import framework.utils.logging.Log;
import io.qameta.allure.Step;

public class MainPageService {

    private static MainPage mainPage;

    public static MainPageService initMainPage(){
        mainPage = new MainPage();
        return new MainPageService();
    }

    @Step("Select product with {0} name")
    public MainPageService chooseProductFromBestsellerHeaderTab(String productName){
        mainPage.clickByBestsellersTab();
        mainPage.selectTheProductByName(productName);
        Log.info("User choose the {}", productName);
        return this;
    }
}
