import Pages.*;
import Utils.SharedDriver;
import Utils.UseCaseBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;


import static org.junit.jupiter.api.Assertions.*;


public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    //    Header Tests
    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        mainPage.takeScreenshot("MainPageTest");
        boolean success = mainPage.isLogoVisible();
        assertTrue(success);
        mainPage.logsVerificationBase();

    }

    @Test
    public void openBookByLangDropTest() {
        logger.info("Book by lang page load test");
        BookByLang bookByLang = mainPage.openBookByLang();
        boolean isBookByLangVisible = bookByLang.isBookByLangTitleVisible();
        assertTrue(isBookByLangVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openEbookPageTest() {
        logger.info("EBook by lang page load test");
        EBookPage eBookPage = mainPage.openEbookPage();
        boolean isEbookPageVisible = eBookPage.isEbookPageTitleVisible();
        assertTrue(isEbookPageVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openGiftCardPageTest() {
        logger.info("Gift Card page load test");
        GiftCardPage giftCardPage = mainPage.openGiftCardPage();
        mainPage.takeScreenshot("GiftCardPageTest");
        boolean isGiftVisible = giftCardPage.isPageTitleVisible();
        assertTrue(isGiftVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openSpanishBooksPage() {
        logger.info("Spanish Books page load test");
        SpanishBooksPage spanishBooksPage = mainPage.openSpanishPage();
        mainPage.takeScreenshot("SpanishBooksPage");
        boolean isSpanishVisible = spanishBooksPage.isSpanishPageTitleVisible();
        assertTrue(isSpanishVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openFrenchPageTest() {
        logger.info("French Books page load test");
        FrenchBooksPage frenchBooksPage = mainPage.openFrenchPage();
        mainPage.takeScreenshot("FrenchPageTest");
        boolean isFrenchVisible = frenchBooksPage.isSFrenchPageTitleVisible();
        assertTrue(isFrenchVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openChinesePageTest() {
        logger.info("Chinese Books page load test");
        ChineseBooksPage chineseBooksPage = mainPage.openChinesePage();
        mainPage.takeScreenshot("ChinesePageTest");
        boolean isChineseVisible = chineseBooksPage.isChinesePageTitleVisible();
        assertTrue(isChineseVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openGalleryPageTest() {
        logger.info("Gallery page load test");
        GalleryPage galleryPage = mainPage.openGalleryPage();
        mainPage.takeScreenshot("GalleryPageTest");
        boolean isGalleryVisible = galleryPage.isGalleryPageTitleVisible();
        assertTrue(isGalleryVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openResourcesPageTest() {
        logger.info("Resources page load test");
        ResourcesPage resourcesPage = mainPage.openResourcesPage();
        mainPage.takeScreenshot("ResourcesPageTest");
        boolean isResourcesVisible = resourcesPage.isResourcesPageTitleVisible();
        assertTrue(isResourcesVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openFaqsPageTest() {
        logger.info("Faqs page load test");
        FaqsPage faqsPage = mainPage.openFaqsPage();
        mainPage.takeScreenshot("FaqsPageTest");
        boolean isFagsVisible = faqsPage.isFaqsPageTitleVisible();
        assertTrue(isFagsVisible);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openContactUsPageTest() {
        logger.info("ContactUs page load test");
        ContactUsPage contactUsPage = mainPage.openContactUsPage();
        mainPage.takeScreenshot("ContactUsPageTest");
        boolean isContactUsLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isContactUsLoaded);
        mainPage.logsVerificationBase();
    }

    @Test
    public void openBlogPageTest() {
        logger.info("Blog page load test");
        BlogPage blogPage = mainPage.openBlogPage();
        mainPage.takeScreenshot("BlogPageTest");
        boolean isBlogLoaded = blogPage.isBlogPageTitleVisible();
        assertTrue(isBlogLoaded);
        mainPage.logsVerificationBase();
    }

    @Test
    public void captureMainPageLogoTest() throws IOException {
        mainPage.mainPageCaptureLogo();
    }

}
