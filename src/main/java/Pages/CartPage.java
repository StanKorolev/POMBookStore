package Pages;


import Consts.Consts;


public class CartPage extends BasePage {
    public static final String CART_PAGE_TITLE = "//h1[text() = 'Your cart']";


    public boolean isCartPageTitleVisible() {
        return elementExists(CART_PAGE_TITLE);
    }

//    public addEnglishBooktoCrat() {
//        logger.info("Add English book to Cart");
//        clickElementByXpath(Consts.BOOK_BY_LANG_DROPDOWN_OPTION);
//        clickElementByXpath(Consts.BOOK_DROPDOWN_ENGLISH_ONLY);
//        clickElementByXpath(Consts.ENGLISH_BOOK_I_LOVE_TO_EAT_FRUITS);
//        assert
//
//    }

}
