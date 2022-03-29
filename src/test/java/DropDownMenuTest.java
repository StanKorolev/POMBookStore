
import Pages.BookByLang;
import Pages.BooksByLanguagePages.AlbanianBooksPage;
import Pages.BooksByLanguagePages.DutchBooksPage;
import Pages.BooksByLanguagePages.EnglishBooksPage;
import Pages.EBookPage;
import Pages.MainPage;
import Pages.eBooksByLanguagePages.CzechEbooksPage;
import Pages.eBooksByLanguagePages.JapaneseEbooksPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DropDownMenuTest extends UseCaseBase {
    private static MainPage mainPage;
    private static BookByLang bookByLang;
    public static EBookPage eBookPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        bookByLang = new BookByLang();
        eBookPage = new EBookPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    //    Open Drop menus TEST
    @Test
    public void openDropDownEbooksTest() {
        logger.info("DropDown eBooks menu test");
        MainPage dropDownEbooks = mainPage.dropDownEbooks();
        boolean isDropDownEbooksVisible = mainPage.isDropDownEbooksVisible();
        assertTrue(isDropDownEbooksVisible);
    }

    @Test
    public void openDropDownBooksTest() {
        logger.info("DropDown Books menu test");
        MainPage openDropDownBooks = mainPage.dropDownBooks();
        boolean isDropDownBooksVisible = mainPage.isDropDownBooksVisible();
        assertTrue(isDropDownBooksVisible);
    }

    @Test
    public void openDropDownResources() {
        logger.info("DropDown Resources menu test");
        MainPage dropDownResources = mainPage.dropDownResources();
        boolean isDropDownResourcesVisible = mainPage.isDropDownResourcesVisible();
        assertTrue(isDropDownResourcesVisible);
    }


//    Drop links Tests

    //    Drop BOOKS Links Tests
    @Test
    public void openDutchBooksTest() {
        logger.info("DropDown Dutch books test");
        DutchBooksPage dutchBooksPage = bookByLang.openDropDownDutchBooks();
        boolean isDutchPageVisible = dutchBooksPage.isDutchBooksPageTitleVisible();
        assertTrue(isDutchPageVisible);
    }

    @Test
    public void openAlnbanianBooksPage() {
        logger.info("DropDown Dutch books test");
        AlbanianBooksPage albanianBooksPage = bookByLang.openDropDownAlbanianBooks();
        boolean isAlbanianPageVisible = albanianBooksPage.isAlbanianBooksPageTitleVisible();
        assertTrue(isAlbanianPageVisible);
    }

    @Test
    public void openEnglishBooksTest() {
        logger.info("DropDown English books test");
        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishPageVisible);
    }

    //    Drop EBOOKS Links Tests

    @Test
    public void openCzechEBooksPage() {
        logger.info("DropDown Czech Ebooks test");
        CzechEbooksPage czechEbooksPage = eBookPage.openCzechDropDownEBooks();
        boolean isCzechEbooksPageVisible = czechEbooksPage.isCzechBooksPageTitleVisible();
        assertTrue(isCzechEbooksPageVisible);
    }

    @Test
    public void openJapaneseEBooksPage(){
        logger.info("DropDown Japanese Ebooks test");
        JapaneseEbooksPage japaneseEbooksPage = eBookPage.openJapaneseDropDownEbooks();
        boolean isJapaneseEbooksPageVisible = japaneseEbooksPage.isJapaneseEBooksPageTitleVisible();
        assertTrue(isJapaneseEbooksPageVisible);
    }
}
