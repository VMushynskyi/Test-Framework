package framework.ui.core.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage {

    private static final String ADD_TO_CART_BUTTON = "//div[@class='add-to-cart']//a[contains(text(),'Add to cart') and @data-product='%d']";

    public void addProductToCartById(int productId) {
        $(By.xpath(String.format(ADD_TO_CART_BUTTON, productId))).click();
    }
}
