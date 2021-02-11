package framework.ui.business.steps;

import framework.ui.core.pages.MainPage;
import framework.ui.core.utilits.logging.Log;
import io.qameta.allure.Step;

public class MainPageSteps {

    private static MainPage mainPage;

    private MainPageSteps(){
    }

    public static MainPageSteps initMainPage(){
        mainPage = new MainPage();
        return new MainPageSteps();
    }

    @Step("Select product with {0} name")
    public MainPageSteps chooseProductFromBestsellerHeaderTab(String productName){
        mainPage.clickByBestsellersTab();
        mainPage.selectTheProductByName(productName);
        Log.info("User choose the {}", productName);
        return this;
    }
}
