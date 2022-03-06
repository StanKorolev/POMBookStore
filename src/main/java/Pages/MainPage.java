package Pages;

import Consts.Consts;
import Pages.UserPages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

public class MainPage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    public static final String MAIN_PAGE_LOGO = "//*[@alt = 'KidKiddos Books ']";
    private static final String BOOK_BY_LANG_OPTION = "//a[text()='Books by language']";
    private static final String BOOK_BY_LANG_DROPDOWN_OPTION = "//a[@aria-controls = 'SiteNavLabel-books-by-language']";
    private static final String EBOOK_BY_LANG_DROPDOWN_OPTION = "//a[@aria-controls = 'SiteNavLabel-ebooks-by-language']";
    private static final String GIFT_CARD_OPTION = "//a[text()='Gift Card']";
    private static final String SPANISH_OPTION = "//a[text()='Español']";
    private static final String FRANCE_OPTION = "//a[text()='Français']";
    private static final String CHINESE_OPTION = "//a[text()='中文']";
    private static final String GALLERY_OPTION = "//a[text()='Gallery']";
    private static final String RESOURCES_DROPDOWN_OPTION = "//a[@aria-controls = 'SiteNavLabel-resources']";
    private static final String FAQS_OPTION = "//a[text()='FAQs']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    private static final String BLOG_OPTION = "//a[text()='Blog']";
    private static final String LOGIN_OPTION = "//a[@class = 'site-header__account']";
    private static final String CART_OPTION = "//a[@class = 'site-header__cart']";
    private static final String CURRENCY_OPTION = "//span[@class = 'currency-converter-currency-button cbb-desktop-view skiptranslate notranslate']";


    //    Main Page
    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        Boolean isLogoVisible = elementExists(LOGO_IMG);
        return isLogoVisible;
    }


    //    Header Links
    public BookByLang openBookByLang() {
        clickElementByXpath(BOOK_BY_LANG_OPTION);
        return new BookByLang();
    }

    public EBookPage openEbookPage() {
        clickElementByXpath(EBOOK_BY_LANG_DROPDOWN_OPTION);
        //Second click to open actual page, not only drop down menu
        clickElementByXpath(EBOOK_BY_LANG_DROPDOWN_OPTION);
        return new EBookPage();
    }

    public GiftCardPage openGiftCardPage() {
        clickElementByXpath(GIFT_CARD_OPTION);
        return new GiftCardPage();
    }

    public SpanishBooksPage openSpanishPage() {
        clickElementByXpath(SPANISH_OPTION);
        return new SpanishBooksPage();
    }

    public FrenchBooksPage openFrenchPage() {
        clickElementByXpath(FRANCE_OPTION);
        return new FrenchBooksPage();
    }

    public ChineseBooksPage openChinesePage() {
        clickElementByXpath(CHINESE_OPTION);
        return new ChineseBooksPage();
    }

    public ContactUsPage openContactUsPage() {
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

    public GalleryPage openGalleryPage() {
        clickElementByXpath(GALLERY_OPTION);
        return new GalleryPage();
    }

    public ResourcesPage openResourcesPage() {
        clickElementByXpath(RESOURCES_DROPDOWN_OPTION);
        //Second click to open actual page, not only drop down menu
        clickElementByXpath(RESOURCES_DROPDOWN_OPTION);
        return new ResourcesPage();
    }

    public FaqsPage openFaqsPage() {
        clickElementByXpath(FAQS_OPTION);
        return new FaqsPage();
    }

    public BlogPage openBlogPage() {
        clickElementByXpath(BLOG_OPTION);
        return new BlogPage();
    }


    public MainPage dropDownEbooks() {
        clickElementByXpath(EBOOK_BY_LANG_DROPDOWN_OPTION);
        return new MainPage();
    }

    public boolean isDropDownEbooksVisible() {
        return dropDownVisible(Consts.EBOOK_DROPDOWN_ALBANIAN);
    }


    public MainPage dropDownBooks() {
        clickElementByXpath(BOOK_BY_LANG_DROPDOWN_OPTION);
        return new MainPage();
    }

    public boolean isDropDownBooksVisible() {
        return dropDownVisible(Consts.BOOK_DROPDOWN_ENGLISH_ONLY);
    }


    public MainPage dropDownResources() {
        clickElementByXpath(RESOURCES_DROPDOWN_OPTION);
        return new MainPage();
    }

    public boolean isDropDownResourcesVisible() {
        return dropDownVisible(Consts.RESOURCES_DROPDOWN_VIDEO);
    }

//    Top Right Menu

    public LoginPage openLoginPage() {
        clickElementByXpath(LOGIN_OPTION);
        return new LoginPage();
    }

    public CartPage openCartPage() {
        clickElementByXpath(CART_OPTION);
        return new CartPage();
    }

    public MainPage chooseCurrencyOption() {
        clickElementByXpath(CURRENCY_OPTION);
        return new MainPage();
    }

    public boolean isCurrencyDropDownVisible() {
        return elementExists(Consts.CURRENCY_AUD_OPTION);
    }

    public void mainPageCaptureLogo() throws IOException {
        File file = captureImageByXpath(MAIN_PAGE_LOGO);
        FileUtils.copyFile(file, new File("MainPageLogo.png"));
    }
}

