package tests.ui;

import framework.utils.listeners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static framework.ui.business.services.CartPageService.initCartPage;
import static framework.ui.business.services.MainPageService.initMainPage;
import static framework.ui.business.services.ProductPageService.initProductPage;
import static framework.ui.core.pages.BasePage.openCartLink;

@Listeners({TestListener.class})
public class MainPageTest extends UIBaseTest {

    @Test
    @Parameters({"id", "product"})
    public void verifyProductInTheCart(Integer id, String title) {
        initMainPage()
                .chooseProductFromBestsellerHeaderTab(title);
        initProductPage()
                .addToCart(id);
        openCartLink();
        initCartPage()
                .verifyThatProductExistsInTheCartTable(id, title);
    }

    @Test
    @Parameters({"id", "product"})
    public void addedFirstProductToTheCart(Integer id, String title) {
        initMainPage()
                .chooseProductFromBestsellerHeaderTab(title);
        initProductPage()
                .addToCart(id);
    }

    @Test
    @Parameters({"id", "product"})
    public void addedSecondProductToTheCart(Integer id, String title) {
        initMainPage()
                .chooseProductFromBestsellerHeaderTab(title);
        initProductPage()
                .addToCart(id);
    }
}
