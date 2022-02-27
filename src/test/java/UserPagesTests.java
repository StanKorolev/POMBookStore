import Pages.MainPage;
import Pages.UserPages.CreateAccountPage;
import Pages.UserPages.ForgotPasswordPage;
import Pages.UserPages.LoginPage;
import Pages.UserPages.MyAccountPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserPagesTests extends UseCaseBase {

    private static MainPage mainPage;
    private static LoginPage loginPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openLoginPage();
    }

    @Test
    public void openCreateAccountPageTest() {
        logger.info("Create account page load test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        boolean isCreateAccountPageTitleVisible = createAccountPage.isCreateAccountTitleVisible();
        assertTrue(isCreateAccountPageTitleVisible);
    }

    @Test
    public void openForgotPasswordPageTest() {
        logger.info("Forgot Password Page load test");
        ForgotPasswordPage forgotPasswordPage = loginPage.forgotYourPasswordOption();
        boolean isForgotPasswordPageVisible = forgotPasswordPage.isForgotPasswordPageTitleVisible();
        assertTrue(isForgotPasswordPageVisible);
    }

    //    Create account positive test
    @Test
    public void createAccountFullTest() {
        logger.info("Create account full test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        createAccountPage.enterFirstName("Vasa");
        createAccountPage.enterLastName("Pupkin");
        createAccountPage.enterEmail("blackspectre2@mail.ru");
        createAccountPage.enterPassword("Qwerty123456");
        createAccountPage.pushCreateButton();
        boolean isHomePageLoaded = mainPage.isLogoVisible();
        assertTrue(isHomePageLoaded);
    }

    //    Create account negative tests
    @Test
    public void createAccountFullBlankTest() {
        logger.info("Create Account Full Blank test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        createAccountPage.pushCreateButton();
        boolean isErrorMessageVisible = createAccountPage.isNoEmailNoPasswordErrorMessageVisible();
        assertTrue(isErrorMessageVisible);
    }

    @Test
    public void createAccountNoPasswordTest() {
        logger.info("Create Account No Password test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        createAccountPage.enterEmail("blackspectre3@mail.ru");
        createAccountPage.pushCreateButton();
        boolean isNoPasswordErrorMessageVisible = createAccountPage.isNoPasswordMessageVisible();
        assertTrue(isNoPasswordErrorMessageVisible);
    }

    @Test
    public void createAccountNoEmailTest() {
        logger.info("Create Account No Email test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        createAccountPage.enterPassword("Qwerty123456");
        createAccountPage.pushCreateButton();
        boolean isNoEmailErrorMessageVisible = createAccountPage.isNoEmailErrorMessageVisible();
        assertTrue(isNoEmailErrorMessageVisible);
    }

    @Test
    public void createAccountUsedBeforeEmailTest() {
        logger.info("Create Account Used Before Email test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        createAccountPage.enterEmail("blackspectre2@mail.ru");
        createAccountPage.pushCreateButton();
        boolean isExistingErrorMessageVisible = createAccountPage.isExistingEmailUsedErrorMessageVisible();
        assertTrue(isExistingErrorMessageVisible);
    }

    //    Login tests
    @Test
    public void loginInAccountTest() {
        logger.info("Login in account test");
        loginPage.loginEmailInput("blackspectre2@mail.ru");
        loginPage.loginPasswordInput("Qwerty123456");
        loginPage.sighInButton();
//      Not a robot pictures can't automate
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
    }

//    Login negative tests but can't use because Captcha Not a robot
    @Test
    public void loginEmptyEmailPasswordErroTest(){
        loginPage.sighInButton();
        boolean isNoEmailNoPasswordErrorVisible = loginPage.isIncorrectEmailPasswordErrorMessageVisible();
        assertTrue(isNoEmailNoPasswordErrorVisible);
    }

    @Test
    public void loginEmptyPasswordErroTest(){
        loginPage.loginEmailInput("blackspectre2@mail.ru");
        loginPage.sighInButton();
        boolean isNoEmailNoPasswordErrorVisible = loginPage.isIncorrectEmailPasswordErrorMessageVisible();
        assertTrue(isNoEmailNoPasswordErrorVisible);
    }

    @Test
    public void loginEmptyEmailErroTest(){
        loginPage.loginPasswordInput("Qwerty123456");
        loginPage.sighInButton();
        boolean isNoEmailNoPasswordErrorVisible = loginPage.isIncorrectEmailPasswordErrorMessageVisible();
        assertTrue(isNoEmailNoPasswordErrorVisible);
    }
}
