package framework.ui.core.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    private static final By CART_ICON_LINK = By.xpath("//a[@space='layout/header/cart' and @href='/cart/']");

    public static void openCartLink(){
        Selenide.refresh();
        $(CART_ICON_LINK).click();
    }
}
