import Pages.BookByLang;
import Pages.CartPage;
import Pages.MainPage;
import Pages.UserPages.LoginPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpperRightMenuTest extends UseCaseBase{

    private static MainPage mainPage;
    private static LoginPage loginPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

//Top Right Menu Buttons on Main Page Tests
    @Test
    public void loginPageLoadTest() {
        logger.info("Login page load test");
        LoginPage loginPage = mainPage.openLoginPage();
        mainPage.takeScreenshot("LoginPageTest");
        boolean isLoginPageTitleVisible = loginPage.isLoginPageTitleVisible();
        assertTrue(isLoginPageTitleVisible);
    }
    @Test
    public void cartPageLoadTest(){
        logger.info("Cart page load test");
        CartPage cartPage = mainPage.openCartPage();
        mainPage.takeScreenshot("CartPageTest");
        boolean isCartPageTitleVisible = cartPage.isCartPageTitleVisible();
        assertTrue(isCartPageTitleVisible);
    }

//    Currency Options
    @Test
    public void currencyDropDownOptionTest(){
        logger.info("Currency drop down load test");
        mainPage.chooseCurrencyOption();
        mainPage.takeScreenshot("Currency drop downTest");
        boolean isCurrencyDropDownVisible = mainPage.isCurrencyDropDownVisible();
        assertTrue(isCurrencyDropDownVisible);
    }
}
