package Pages.BooksByLanguagePages.EnglishOnlyBooks;

import Pages.BasePage;

public class ILoveToEatFruitsAndVegetables extends BasePage {
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_PAGE_TITLE = "//div[@class='product-single__meta']//h1[1]";
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_ADD_TO_CART = "//span[text()[normalize-space()='Add to cart']]";
    public static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_IN_CART = "//div[@class='list-view-item__title']//a[1]";


    public boolean isILoveToEatFruitsAndVegetablesPageVisible() {
        return elementExists(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_PAGE_TITLE);
    }

    public void ILoveToEatFruitsAndVegetablesAddToCart() {
        clickElementByXpath(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_ADD_TO_CART);
    }

    public boolean isILoveToEatFruitsAndVegetablesAddedToCart() {
        return elementExists(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_IN_CART);
    }

}
