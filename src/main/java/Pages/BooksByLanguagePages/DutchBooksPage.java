package Pages.BooksByLanguagePages;

import Pages.BasePage;

public class DutchBooksPage extends BasePage {
    public static final String BOOKS_DUTCH_PAGE_TITLE = "//h1[text()='Dutch - Nederlands']";

    public boolean isDutchBooksPageTitleVisible(){
        return elementExists(BOOKS_DUTCH_PAGE_TITLE);
    }
}
