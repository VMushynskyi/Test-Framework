package framework.ui.business.steps;

import framework.ui.core.pages.CartPage;
import io.qameta.allure.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CartPageSteps {

    private static CartPage cartPage;

    private CartPageSteps() {
    }

    public static CartPageSteps initCartPage() {
        cartPage = new CartPage();
        return new CartPageSteps();
    }

    @Step("Verify that product name {1} have appropriate {0} id")
    public void verifyThatProductExistsInTheCartTable(int productId, String productName) {
        assertThat(cartPage.getProductNameById(productId),containsString(productName));
    }
}
