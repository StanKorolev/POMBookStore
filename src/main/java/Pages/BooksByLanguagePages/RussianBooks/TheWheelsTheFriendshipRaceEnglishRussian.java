package Pages.BooksByLanguagePages.RussianBooks;

import Pages.BasePage;

public class TheWheelsTheFriendshipRaceEnglishRussian extends BasePage {

    public static final String THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_PAGE_TITLE = "//img[@src='//cdn.shopify.com/s/files/1/1788/1145/products/Wheels-The-Friendship-Race-English-Russian-Bilingual-kids-bedtime-story-cover_530x@2x.jpg?v=1490980840']";
    public static final String THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_ADD_TO_CART = "//button[@name='add']";
    public static final String THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_IN_CART = "//img[@src='//cdn.shopify.com/s/files/1/1788/1145/products/Wheels-The-Friendship-Race-English-Russian-Bilingual-kids-bedtime-story-cover_95x95@2x.jpg?v=1490980840']";
    public static final String THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_QUANTITY_INPUT = "//input[@name='quantity']";

    public boolean isTheWheelsTheFriendshipRaceEnglishRussianPageVisible() {
        return elementExists(THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_PAGE_TITLE);
    }

    public void theWheelsTheFriendshipRaceEnglishRussianAddToCart() {
        clickElementByXpath(THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_ADD_TO_CART);
    }

    public boolean isTheWheelsTheFriendshipRaceEnglishRussianAddedToCart() {
        return elementExists(THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_IN_CART);
    }

    public void theWheelsTheFriendshipRaceEnglishRussianAddQuantity(String booksQuantity) {
        sendTextToElementByXpath(THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_QUANTITY_INPUT, booksQuantity);
    }

    public boolean isTheWheelsTheFriendshipRaceEnglishRussianQuantityAdded(String booksQuantity) {
        return checkTextAddedToXpath(THE_WHEELS_FRIENDSHIP_RACE_ENGLISH_RUSSIAN_QUANTITY_INPUT, booksQuantity);
    }
}
