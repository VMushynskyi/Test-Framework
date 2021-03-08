package framework.ui.core.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {

    private static final SelenideElement BESTSELLERS_TABS_HEADER = $x("(//div[@class='title']//span)[3]");

    public void clickByBestsellersTab() {
       BESTSELLERS_TABS_HEADER.click();
    }

    public void selectTheProductByName(String productName) {
        $x(String.format("//div[@class='product-title_text']//a[text()='%s']", productName)).click();
    }
}
