package Pages.BooksByLanguagePages.EnglishOnlyBooks;

import Pages.BasePage;

public class AmandasDreamEnglishBook extends BasePage {

    public static final String AMANDAS_DREAM_ENGLISH_BOOK_PAGE_TITLE = "//div[@class='product-single__meta']//h1[1]";
    public static final String AMANDAS_DREAM_ENGLISH_BOOK_ADD_TO_CART = "//button[@name='add']";
    public static final String AMANDAS_DREAM_ENGLISH_BOOK_IN_CART = "//img[@src='//cdn.shopify.com/s/files/1/1788/1145/products/childrens-motivational-bedtime-story-Amandas-Dream-cover_95x95@2x.jpg?v=1625981696']";
    public static final String AMANDAS_DREAM_ENGLISH_BOOK_QUANTITY_INPUT = "//input[@name='quantity']";

    public boolean isAmandasDreamEnglishBookPageVisible() {
        return elementExists(AMANDAS_DREAM_ENGLISH_BOOK_PAGE_TITLE);
    }

    public void amandasDreamEnglishBookAddToCart() {
        clickElementByXpath(AMANDAS_DREAM_ENGLISH_BOOK_ADD_TO_CART);
    }

    public boolean isAmandasDreamEnglishBookAddedToCart() {
        return elementExists(AMANDAS_DREAM_ENGLISH_BOOK_IN_CART);
    }

    public void amandasDreamEnglishBookAddQuantity(String booksQuantity) {
        sendTextToElementByXpath(AMANDAS_DREAM_ENGLISH_BOOK_QUANTITY_INPUT, booksQuantity);
    }

    public boolean isAmandasDreamEnglishBookQuantityAdded(String booksQuantity) {
        return checkTextAddedToXpath(AMANDAS_DREAM_ENGLISH_BOOK_QUANTITY_INPUT, booksQuantity);
    }

}
