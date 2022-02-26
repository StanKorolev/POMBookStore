package Pages.BooksByLanguagePages;

import Pages.BasePage;


public class AlbanianBooksPage extends BasePage {
    public static final String BOOKS_ALBANIAN_PAGE_TITLE = "//h1[text()='Albanian - Shqip']";

    public boolean isAlbanianBooksPageTitleVisible(){
        return elementExists(BOOKS_ALBANIAN_PAGE_TITLE);
    }

}
