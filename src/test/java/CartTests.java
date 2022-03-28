import Pages.BookByLang;
import Pages.BooksByLanguagePages.EnglishBooksPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTests extends UseCaseBase {

    private static MainPage mainPage;
    private static BookByLang bookByLang;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {

        bookByLang = new BookByLang();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();

    }

//Enter English books category
//Verify one book could be added to cart
//Verify many books could be added to cart
//Verify different languages books could be added to cart

    @Test
    public void openEnglishBooksTest() {
        logger.info("DropDown English books test");
        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishPageVisible);
    }


}
