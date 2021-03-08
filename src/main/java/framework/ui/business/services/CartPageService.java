package framework.ui.business.services;

import framework.ui.core.pages.CartPage;
import io.qameta.allure.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CartPageService {

    private static CartPage cartPage;

    public static CartPageService initCartPage() {
        cartPage = new CartPage();
        return new CartPageService();
    }

    @Step("Verify that product name {1} have appropriate {0} id")
    public void verifyThatProductExistsInTheCartTable(String productId, String productName) {
        assertThat(cartPage.getProductNameById(productId),containsString(productName));
    }
}
