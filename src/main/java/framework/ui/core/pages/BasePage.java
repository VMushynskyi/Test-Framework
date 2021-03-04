package framework.ui.core.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    private static final SelenideElement CART_ICON_LINK = $x("//a[@space='layout/header/cart' and @href='/cart/']");

    public static void openCartLink() {
        Selenide.refresh();
        CART_ICON_LINK.click();
    }
}
