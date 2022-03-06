package Pages;


public class CartPage extends BasePage {
    public static final String CART_PAGE_TITLE = "//h1[text() = 'Your cart']";

    public boolean isCartPageTitleVisible(){
        return elementExists(CART_PAGE_TITLE);
    }

}
