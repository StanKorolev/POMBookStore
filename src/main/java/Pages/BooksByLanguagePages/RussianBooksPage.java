package Pages.BooksByLanguagePages;

import Consts.Consts;
import Pages.BasePage;
import Pages.BooksByLanguagePages.RussianBooks.TheWheelsTheFriendshipRaceEnglishRussian;

public class RussianBooksPage extends BasePage {
    public static final String BOOKS_RUSSIAN_PAGE_TITLE = "//h1[text()='Russian - Русский']";

    public boolean isRussianBooksPageTitleVisible(){
        return elementExists(BOOKS_RUSSIAN_PAGE_TITLE);
    }

    public TheWheelsTheFriendshipRaceEnglishRussian openTheWheelsTheFriendshipRaceEnglishRussian(){
        clickElementByXpath(Consts.RUSSIAN_THE_WHEELS_FRIENDSHIP_RACE_ENGLISH);
        return new TheWheelsTheFriendshipRaceEnglishRussian();
    }

}
