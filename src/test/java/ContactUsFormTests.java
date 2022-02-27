import Pages.ContactUsPage;
import Utils.UseCaseBase;
import Pages.BookByLang;
import Pages.EBookPage;
import Pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsFormTests extends UseCaseBase {
    private static MainPage mainPage;
    public static BookByLang bookByLang;
    public static EBookPage eBookPage;
    public static ContactUsPage contactUsPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        bookByLang = new BookByLang();
        eBookPage = new EBookPage();
        contactUsPage = new ContactUsPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    //    Contact Us Filed tests
    @Test
    public void contactUsFullEmptyTest() {
        logger.info("contactUsFullEmptyTest");
        mainPage.openContactUsPage();
        contactUsPage.contactUsSendMessageButton();
        mainPage.takeScreenshot("contactUsFullEmptyTest");
        boolean isNoNameErrorMessagesVisible = contactUsPage.isNoNameErrorMessagesVisible();
        boolean isNoEmailErrorMessageVisible = contactUsPage.isNoEmailErrorMessageVisible();
        boolean isEmptyMessageFieldErrorMessageVisible = contactUsPage.isEmptyMessageFieldErrorMessageVisible();
        assertTrue(isNoNameErrorMessagesVisible);
        assertTrue(isNoEmailErrorMessageVisible);
        assertTrue(isEmptyMessageFieldErrorMessageVisible);
    }

    @Test
    public void contactUsNoNameErrorMessageTest() {
        logger.info("No Nam Error Message Test");
        mainPage.openContactUsPage();
        contactUsPage.contactUsEnterEmail("myemail@gmail.com");
        contactUsPage.contactUsEnterMessage("This is my message");
        contactUsPage.contactUsSendMessageButton();
        mainPage.takeScreenshot("contactUsNoNameErrorMessageTest");
        boolean isNoNameErrorMessagesVisible = contactUsPage.isNoNameErrorMessagesVisible();
        assertTrue(isNoNameErrorMessagesVisible);

    }

    @Test
    public void contactUsNoEmailErrorMessageTest() {
        logger.info("No Email Error Message Test");
        mainPage.openContactUsPage();
        contactUsPage.contactUsEnterName("My Name");
        contactUsPage.contactUsEnterMessage("My message");
        contactUsPage.contactUsSendMessageButton();
        mainPage.takeScreenshot("contactUsNoEmailErrorMessageTest");
        boolean isNoEmailErrorMessageVisible = contactUsPage.isNoEmailErrorMessageVisible();
        assertTrue(isNoEmailErrorMessageVisible);

    }

    @Test
    public void contactUsNoMessageErrorMessageTest() {
        logger.info("No Message Error Message Test");
        mainPage.openContactUsPage();
        contactUsPage.contactUsEnterName("My Name");
        contactUsPage.contactUsEnterEmail("myemail@gmail.com");
        contactUsPage.contactUsSendMessageButton();
        mainPage.takeScreenshot("contactUsNoMessageErrorMessageTest");
        boolean isEmptyMessageFieldErrorMessageVisible = contactUsPage.isEmptyMessageFieldErrorMessageVisible();
        assertTrue(isEmptyMessageFieldErrorMessageVisible);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2354235", "noATemailsymbol.com", "&*$^^&$@stangesymbolsnoDOTcom", "%#$%^$&$@gmail.com", "lookslike proper@gmail.com"})
    public void contactUsWrongEmailFormatTest(String emailInput) throws InterruptedException {
        logger.info("Wrong Email Format Test");
        mainPage.openContactUsPage();
        //  Avoid slow page load
        Thread.sleep(1000);
        contactUsPage.contactUsEnterEmail(emailInput);
        Thread.sleep(1000);
        contactUsPage.contactUsSendMessageButton();
        boolean isEnterValidEmailErrorMessageVisible = contactUsPage.isEnterValidEmailErrorMessageVisible();
        assertTrue(isEnterValidEmailErrorMessageVisible);
        logger.info("END OF TEST");

    }

}
