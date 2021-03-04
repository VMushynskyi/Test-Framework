package framework.ui.business.services;

import framework.ui.core.pages.ProductPage;
import io.qameta.allure.Step;

public class ProductPageService {

    private static ProductPage productPage;

    public static ProductPageService initProductPage() {
        productPage = new ProductPage();
        return new ProductPageService();
    }

    @Step("Add product with {0} id to the Cart")
    public void addToCart(int productId) {
        productPage.addProductToCartById(productId);
    }
}
