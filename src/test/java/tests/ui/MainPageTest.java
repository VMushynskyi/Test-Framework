package tests.ui;

import org.testng.annotations.Test;

import static framework.ui.business.steps.CartPageSteps.initCartPage;
import static framework.ui.business.steps.MainPageSteps.initMainPage;
import static framework.ui.business.steps.ProductPageSteps.initProductPage;
import static framework.ui.core.pages.BasePage.openCartLink;

public class MainPageTest extends UIBaseTest {

    @Test
    public void test01(){
        initMainPage()
                .chooseProductFromBestsellerHeaderTab("Medusa Pro II UFS BGA-153 Socket");
        initProductPage()
                .addToCart(884487);
        openCartLink();
        initCartPage()
                .verifyThatProductExistsInTheCartTable(884487,"Medusa Pro II UFS BGA-153 Socket");
    }

    @Test
    public void test02(){
        initMainPage()
                .chooseProductFromBestsellerHeaderTab("Medusa Pro II UFS BGA-153 Socket");
        initProductPage()
                .addToCart(884487);
    }

    @Test
    public void test03(){
        initMainPage()
                .chooseProductFromBestsellerHeaderTab("Medusa Pro II UFS BGA-153 Socket");
        initProductPage()
                .addToCart(884487);
    }
}
