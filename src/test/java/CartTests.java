import Pages.BookByLang;
import Pages.BooksByLanguagePages.EnglishBooksPage;
import Pages.BooksByLanguagePages.EnglishOnlyBooks.ILoveToEatFruitsAndVegetables;
import Pages.CartPage;
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
    private static ILoveToEatFruitsAndVegetables iLoveToEatFruitsAndVegetables;
    private static CartPage cartPage;

    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        bookByLang = new BookByLang();
        iLoveToEatFruitsAndVegetables = new ILoveToEatFruitsAndVegetables();
        cartPage = new CartPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();

    }

//Enter English books category - DONE in dropdown test class
//Verify one book could be added to cart
//Verify many books could be added to cart
//Verify different languages books could be added to cart

    @Test
    public void ILoveToEatFruitsAndVegetablesAddToCart() {
        logger.info("I Love To Eat Fruits And Vegetables Add To Cart Test");

        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishBooksPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishBooksPageVisible);

        englishBooksPage.openILoveToEatFruitsAndVegetables();
        boolean isILoveToEatFruitsAndVegetablesVisible =  iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesPageVisible();
        assertTrue(isILoveToEatFruitsAndVegetablesVisible);

        iLoveToEatFruitsAndVegetables.ILoveToEatFruitsAndVegetablesAddToCart();
        boolean isCartPageVisible =  cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageVisible);

        boolean isILoveToEatFruitsAndVegetablesAddedToCart =  iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesAddedToCart();
        assertTrue(isILoveToEatFruitsAndVegetablesAddedToCart);
    }


}
