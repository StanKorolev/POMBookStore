package Consts;

public class Consts {
    //    Main URL
    public static final String MAIN_URL = "https://kidkiddos.com/";

    //BOOK options
    public static final String BOOK_BY_LANG_DROPDOWN_OPTION = "//a[@aria-controls = 'SiteNavLabel-books-by-language']";
    public static final String BOOK_DROPDOWN_ENGLISH_ONLY = "//a[text()='English Only']";
    public static final String BOOK_DROPDOWN_ALBANIAN = "//a[text()='Albanian - Shqip']";
    public static final String BOOK_DROPDOWN_DUTCH = "//a[text()='Dutch - Nederlands']";

    //EBook options
    public static final String EBOOK_BY_LANG_DROPDOWN_OPTION = "//a[@aria-controls = 'SiteNavLabel-ebooks-by-language']";
    public static final String EBOOK_DROPDOWN_ALBANIAN = "//a[text()='Albanian- Shqip']";
    public static final String EBOOK_DROPDOWN_CZECH = "//*[@id = 'SiteNavLabel-ebooks-by-language']//a[text() = 'Czech - Čeština']";
    public static final String EBOOK_DROPDOWN_JAPANESE = "//*[@id = 'SiteNavLabel-ebooks-by-language']//a[text() = 'Japanese - 日本語']";

    //Resources option
    public static final String RESOURCES_DROPDOWN_OPTION = "//a[@aria-controls = 'SiteNavLabel-resources']";
    public static final String RESOURCES_DROPDOWN_VIDEO = "//a[text()='Videos']";

    // Contact Us send message button
    public static final String CONTACT_US_SEND_MESSAGE_BUTTON = "//button[@id = '_form_44_submit']";


    //Error messages xpath links
    public static final String CONTACT_US_EMPTY_NAME_ERROR_MESSAGE = "//div[@class = '_form_element _field3 _full_width ']//div[@class = '_error _above']//*[text() = 'This field is required.']";
    public static final String CONTACT_US_EMPTY_EMAIL_ERROR_MESSAGE = "//div[@class = '_form_element _x69676162 _full_width ']//div[@class = '_error _above']//*[text() = 'This field is required.']";
    public static final String CONTACT_US_EMPTY_MESSAGE_ERROR_MESSAGE = "//div[@class = '_form_element _field7 _full_width ']//div[@class = '_error _above']//*[text() = 'This field is required.']";
    public static final String CONTACT_US_ENTER_VALID_EMAIL_ERROR_MESSAGE = "//*[text() = 'Enter a valid email address.']";

    // Contact Us form xpath
    public static final String CONTACT_US_NAME_FIELD = "//input[@name = 'field[3]']";
    public static final String CONTACT_US_EMAIL_FIELD = "//input[@name = 'email']";
    public static final String CONTACT_US_YOUR_MESSAGE_FIELD = "//textarea[@name = 'field[7]']";

    public static final String TEST_STRING_GIT = "My String";
    public static final String TEST_EXTRA_BRANCH = "Extra branch got tested";

}
