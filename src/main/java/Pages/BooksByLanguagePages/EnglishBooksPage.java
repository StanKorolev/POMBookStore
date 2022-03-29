package Pages.BooksByLanguagePages;

import Consts.Consts;
import Pages.BasePage;
import Pages.BooksByLanguagePages.EnglishOnlyBooks.ILoveToEatFruitsAndVegetables;


public class EnglishBooksPage extends BasePage {
    public static final String BOOKS_ENGLISH_PAGE_TITLE = "//h1[text()='English Only']";

    public boolean isEnglishBooksPageTitleVisible() {
        return elementExists(BOOKS_ENGLISH_PAGE_TITLE);
    }

    public ILoveToEatFruitsAndVegetables openILoveToEatFruitsAndVegetables() {
        clickElementByXpath(Consts.ENGLISH_BOOK_I_LOVE_TO_EAT_FRUITS);
        return new ILoveToEatFruitsAndVegetables();
    }
}
