package Pages;


import Consts.Consts;


public class CartPage extends BasePage {
    public static final String CART_PAGE_TITLE = "//h1[text() = 'Your cart']";
    public static final String CART_QUANTITY_INPUT = "//input[@class='cart__qty-input']";


    public boolean isCartPageTitleVisible() {
        return elementExists(CART_PAGE_TITLE);
    }

    public boolean isBooksQuantityAdded(String booksQuantity) {
        return checkTextAddedToXpath(CART_QUANTITY_INPUT, booksQuantity);
    }

    public boolean isILoveToEatFruitsAndVegetablesPaperAddedToCart() {
        return elementExists(Consts.ENGLISH_BOOK_I_LOVE_TO_EAT_FRUITS_CART_IMAGE_PAPER);
    }

    public boolean isAmandasDreamPaperAddedToCart() {
        return elementExists(Consts.ENGLISH_BOOK_AMANDAS_DREAM_CART_IMAGE_PAPER);
    }

    public boolean isTheWheelsTheFriendshipRaceEnglishRussianAddedToCart() {
        return elementExists(Consts.RUSSIAN_THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_PAPER);
    }

}
