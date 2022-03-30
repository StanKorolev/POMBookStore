import Pages.BookByLang;
import Pages.BooksByLanguagePages.EnglishBooksPage;
import Pages.BooksByLanguagePages.EnglishOnlyBooks.AmandasDreamEnglishBook;
import Pages.BooksByLanguagePages.EnglishOnlyBooks.ILoveToEatFruitsAndVegetables;
import Pages.BooksByLanguagePages.RussianBooks.TheWheelsTheFriendshipRaceEnglishRussian;
import Pages.BooksByLanguagePages.RussianBooksPage;
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
    private static AmandasDreamEnglishBook amandasDreamEnglishBook;
    private static CartPage cartPage;
    private static RussianBooksPage russianBooksPage;
    private static TheWheelsTheFriendshipRaceEnglishRussian theWheelsTheFriendshipRaceEnglishRussian;



    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        bookByLang = new BookByLang();
        iLoveToEatFruitsAndVegetables = new ILoveToEatFruitsAndVegetables();
        amandasDreamEnglishBook = new AmandasDreamEnglishBook();
        cartPage = new CartPage();
        russianBooksPage = new RussianBooksPage();
        theWheelsTheFriendshipRaceEnglishRussian = new TheWheelsTheFriendshipRaceEnglishRussian();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();

    }

//Enter English books category - DONE in dropdown test class
//Verify one book could be added to cart - DONE HERE
//Verify many books could be added to cart - DONE HERE
//Verify different languages books could be added to cart - DONE HERE

    @Test
    public void iLoveToEatFruitsAndVegetablesAddToCartTest() {
        logger.info("I Love To Eat Fruits And Vegetables Add To Cart Test");

        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishBooksPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishBooksPageVisible);

        englishBooksPage.openILoveToEatFruitsAndVegetables();
        boolean isILoveToEatFruitsAndVegetablesVisible = iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesPageVisible();
        assertTrue(isILoveToEatFruitsAndVegetablesVisible);

        iLoveToEatFruitsAndVegetables.iLoveToEatFruitsAndVegetablesAddToCart();
        boolean isCartPageVisible = cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageVisible);

        boolean isILoveToEatFruitsAndVegetablesAddedToCart = iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesAddedToCart();
        assertTrue(isILoveToEatFruitsAndVegetablesAddedToCart);

        boolean isILoveToEatFruitsAndVegetablesPaperAddedToCart = cartPage.isILoveToEatFruitsAndVegetablesPaperAddedToCart();
        assertTrue(isILoveToEatFruitsAndVegetablesPaperAddedToCart);
    }

    @Test
    public void iLoveToEatFruitsAndVegetablesAddToCartTenBooksTest() {
        String booksQuantity = "10";
        logger.info("I Love To Eat Fruits And Vegetables Add" + booksQuantity + "Books To Cart Test");

        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishBooksPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishBooksPageVisible);

        englishBooksPage.openILoveToEatFruitsAndVegetables();
        boolean isILoveToEatFruitsAndVegetablesVisible = iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesPageVisible();
        assertTrue(isILoveToEatFruitsAndVegetablesVisible);

        iLoveToEatFruitsAndVegetables.iLoveToEatFruitsAndVegetablesAddQuantity(booksQuantity);
        boolean isiLoveToEatFruitsAndVegetablesQuantityAdded = iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesQuantityAdded(booksQuantity);
        assertTrue(isiLoveToEatFruitsAndVegetablesQuantityAdded);

        iLoveToEatFruitsAndVegetables.iLoveToEatFruitsAndVegetablesAddToCart();
        boolean isCartPageVisible = cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageVisible);

        boolean isBooksQuantityAdded =  cartPage.isBooksQuantityAdded(booksQuantity);
        assertTrue(isBooksQuantityAdded);
    }

    @Test
    public void amandasDreamEnglishBookAddToCartTenBooksTest() {
        String booksQuantity = "10";
        logger.info("Amanda's Dream English Book Add" + booksQuantity + "Books To Cart Test");

        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishBooksPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishBooksPageVisible);

        englishBooksPage.openAmandasDreamEnglishBook();
        boolean isAmandasDreamEnglishBookVisible = amandasDreamEnglishBook.isAmandasDreamEnglishBookPageVisible();
        assertTrue(isAmandasDreamEnglishBookVisible);

        amandasDreamEnglishBook.amandasDreamEnglishBookAddQuantity(booksQuantity);
        boolean isAmandasDreamEnglishBookQuantityAdded = amandasDreamEnglishBook.isAmandasDreamEnglishBookQuantityAdded(booksQuantity);
        assertTrue(isAmandasDreamEnglishBookQuantityAdded);

        amandasDreamEnglishBook.amandasDreamEnglishBookAddToCart();
        boolean isCartPageVisible = cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageVisible);

        boolean isBooksQuantityAdded =  cartPage.isBooksQuantityAdded(booksQuantity);
        assertTrue(isBooksQuantityAdded);
    }

    @Test
    public void theWheelsTheFriendshipRaceEnglishRussianAddToCartTest() {
        logger.info("The Wheels The Friendship Race English Russian Add To Cart Test");

        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishBooksPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishBooksPageVisible);

        englishBooksPage.openILoveToEatFruitsAndVegetables();
        boolean isILoveToEatFruitsAndVegetablesVisible = iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesPageVisible();
        assertTrue(isILoveToEatFruitsAndVegetablesVisible);

        iLoveToEatFruitsAndVegetables.iLoveToEatFruitsAndVegetablesAddToCart();
        boolean isCartPageVisible = cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageVisible);

        boolean isILoveToEatFruitsAndVegetablesAddedToCart = iLoveToEatFruitsAndVegetables.isILoveToEatFruitsAndVegetablesAddedToCart();
        assertTrue(isILoveToEatFruitsAndVegetablesAddedToCart);

        boolean isILoveToEatFruitsAndVegetablesPaperAddedToCart = cartPage.isILoveToEatFruitsAndVegetablesPaperAddedToCart();
        assertTrue(isILoveToEatFruitsAndVegetablesPaperAddedToCart);
    }

    @Test
    public void multiLanguageBooksAddToCartTest(){
        logger.info("Multi Language Books Add To Cart Test");

        EnglishBooksPage englishBooksPage = bookByLang.openDropDownEnglishBooks();
        boolean isEnglishBooksPageVisible = englishBooksPage.isEnglishBooksPageTitleVisible();
        assertTrue(isEnglishBooksPageVisible);

        englishBooksPage.openILoveToEatFruitsAndVegetables();
        iLoveToEatFruitsAndVegetables.iLoveToEatFruitsAndVegetablesAddToCart();

        mainPage.navigateToMainPage();

        RussianBooksPage russianBooksPage = bookByLang.openDropDownRussianBooksPage();
        boolean isRussianBooksPageVisible = russianBooksPage.isRussianBooksPageTitleVisible();
        assertTrue(isRussianBooksPageVisible);

        russianBooksPage.openTheWheelsTheFriendshipRaceEnglishRussian();
        theWheelsTheFriendshipRaceEnglishRussian.theWheelsTheFriendshipRaceEnglishRussianAddToCart();

        boolean isCartPageVisible = cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageVisible);

        boolean isILoveToEatFruitsAndVegetablesPaperAddedToCart = cartPage.isILoveToEatFruitsAndVegetablesPaperAddedToCart();
        assertTrue(isILoveToEatFruitsAndVegetablesPaperAddedToCart);

        boolean isTheWheelsTheFriendshipRaceEnglishRussianAddedToCart = cartPage.isTheWheelsTheFriendshipRaceEnglishRussianAddedToCart();
        assertTrue(isTheWheelsTheFriendshipRaceEnglishRussianAddedToCart);

        mainPage.takeScreenshot("MultiLanguageBooksAddToCartTest");
    }

}
