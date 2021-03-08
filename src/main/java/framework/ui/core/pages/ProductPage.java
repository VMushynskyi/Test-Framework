package framework.ui.core.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage extends BasePage {

    private static final SelenideElement ADD_TO_CART_BUTTON = $x("//div[@id='right-panel-content-wrapper']//a[contains(text(),'Add to cart')]");
    private static final SelenideElement CURRENT_PRODUCT_ID = $x("(//div[@class='top']//div//span)[1]");

    public void addProductToCartById() {
        ADD_TO_CART_BUTTON.click();
        System.setProperty("medusaAdapter", getIdOfCurrentProduct());
    }

    private String getIdOfCurrentProduct() {
        return CURRENT_PRODUCT_ID.getText().substring(4);
    }
}
