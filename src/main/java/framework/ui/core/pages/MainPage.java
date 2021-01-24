package framework.ui.core.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage{
    private static final By BESTSELLERS_TABS_HEADER = By.xpath("(//div[@class='title']//span)[3]");
    private static final String PRODUCT_NAME_PATH = "//div[@class='product-title_text']//a[text()='%s']";

    public void clickByBestsellersTab(){
        $(BESTSELLERS_TABS_HEADER).click();
    }

    public void selectTheProductByName(String productName){
        $(By.xpath(String.format(PRODUCT_NAME_PATH,productName))).click();
    }
}
