package Pages.BooksByLanguagePages.EnglishOnlyBooks;

import Pages.BasePage;

public class ILoveToEatFruitsAndVegetables extends BasePage {
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_PAGE_TITLE = "//div[@class='product-single__meta']//h1[1]";
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_ADD_TO_CART = "//span[text()[normalize-space()='Add to cart']]";
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_IN_CART = "//div[@class='list-view-item__title']//a[1]";
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_QUANTITY_INPUT = "//input[@name='quantity']";


    public boolean isILoveToEatFruitsAndVegetablesPageVisible() {
        return elementExists(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_PAGE_TITLE);
    }

    public void iLoveToEatFruitsAndVegetablesAddToCart() {
        clickElementByXpath(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_ADD_TO_CART);
    }

    public boolean isILoveToEatFruitsAndVegetablesAddedToCart() {
        return elementExists(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_IN_CART);
    }

    public void iLoveToEatFruitsAndVegetablesAddQuantity(String booksQuantity) {
        sendTextToElementByXpath(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_QUANTITY_INPUT, booksQuantity);
    }

    public boolean isILoveToEatFruitsAndVegetablesQuantityAdded(String booksQuantity) {
        return checkTextAddedToXpath(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_QUANTITY_INPUT, booksQuantity);
    }
}