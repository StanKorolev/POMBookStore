package Pages.BooksByLanguagePages;

import Pages.BasePage;


public class EnglishBooksPage extends BasePage {
    public static final String BOOKS_ENGLISH_PAGE_TITLE = "//h1[text()='English Only']";

    public boolean isEnglishBooksPageTitleVisible(){
        return elementExists(BOOKS_ENGLISH_PAGE_TITLE);
    }

}
