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
    public void verifyProductInTheCart() {
        initMainPage()
                .chooseProductFromBestsellerHeaderTab("Medusa Pro II UFS BGA-153 Socket");
        initProductPage()
                .addToCart();
        openCartLink();
        initCartPage()
                .verifyThatProductExistsInTheCartTable(System.getProperty("medusaAdapter"), "Medusa Pro II UFS BGA-153 Socket");
    }

    @Test
    public void addedFirstProductToTheCart() {
        initMainPage()
                .chooseProductFromBestsellerHeaderTab("Medusa Pro II UFS BGA-153 Socket");
        initProductPage()
                .addToCart();
    }

    @Test
    public void addedSecondProductToTheCart() {
        initMainPage()
                .chooseProductFromBestsellerHeaderTab("Medusa Pro II UFS BGA-153 Socket");
        initProductPage()
                .addToCart();
    }
}
