package framework.ui.core.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private static final String PRODUCT_NAME_PATH = "//tr[@data-id='%d']//td[3]//a";

    public String getProductNameById(int productId) {
        return $(By.xpath(String.format(PRODUCT_NAME_PATH, productId))).getText();
    }
}
