package framework.ui.business.steps;

import framework.ui.core.pages.ProductPage;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;

@Listeners({framework.ui.core.utilits.listeners.TestListener.class})
public class ProductPageSteps {

    private static ProductPage productPage;

    private ProductPageSteps(){
    }

    public static ProductPageSteps initProductPage(){
        productPage = new ProductPage();
        return new ProductPageSteps();
    }

    @Step("Add product with {0} id to the Cart")
    public void addToCart(int productId){
        productPage.addProductToCartById(productId);
    }
}
