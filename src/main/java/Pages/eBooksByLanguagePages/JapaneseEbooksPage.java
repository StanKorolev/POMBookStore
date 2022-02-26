package Pages.eBooksByLanguagePages;

import Pages.BasePage;

public class JapaneseEbooksPage extends BasePage {

    public static final String BOOKS_JAPANESE_PAGE_TITLE = "//h1[text()='eBooks in Japanese - 日本語']";

    public boolean isJapaneseEBooksPageTitleVisible() {
        return elementExists(BOOKS_JAPANESE_PAGE_TITLE);
    }
}
