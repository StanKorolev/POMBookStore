package Pages;


import Consts.Consts;
import Pages.BooksByLanguagePages.AlbanianBooksPage;
import Pages.BooksByLanguagePages.DutchBooksPage;

public class BookByLang extends BasePage {
    private static final String BOOK_BY_LANG_TITLE = "//h1[text()='Find your language']";


    public boolean isBookByLangTitleVisible() {
        return elementExists(BOOK_BY_LANG_TITLE);
    }

    public DutchBooksPage openDropDownDutchBooks() {
        clickElementByXpath(Consts.BOOK_BY_LANG_DROPDOWN_OPTION);
        clickElementByXpath(Consts.BOOK_DROPDOWN_DUTCH);
        return new DutchBooksPage();
    }
    public AlbanianBooksPage openDropDownAlbanianBooks() {
        clickElementByXpath(Consts.BOOK_BY_LANG_DROPDOWN_OPTION);
        clickElementByXpath(Consts.BOOK_DROPDOWN_ALBANIAN);
        return new AlbanianBooksPage();
    }

}
