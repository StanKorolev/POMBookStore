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

    //Currency drop down options
    public static final String CURRENCY_AUD_OPTION = "//*[text()='AUD']";

    //Login Page options xpath
    public static final String LOGIN_EMAIL_IN_INPUT = "//input[@name = 'customer[email]']";
    public static final String LOGIN_PASSWORD_INPUT = "//input[@name = 'customer[password]']";
    public static final String LOGIN_FORGOT_PASSWORD_ = "//a[text() = 'Forgot your password?']";
    public static final String LOGIN_SIGN_IN_BUTTON = "//input[@value = 'Sign In']";
    public static final String LOGIN_CREATE_NEW_ACCOUNT_LINK = "//a[@id = 'customer_register_link']";
    public static final String LOGIN_INCORRECT_EMAIL_PASSWORD_ERROR_MESSAGE = "//*[text() = 'Incorrect email or password.']";


    //Create account xpath
    public static final String CREATE_ACCOUNT_FIRST_NAME_INPUT = "//input[@name = 'customer[first_name]']";
    public static final String CREATE_ACCOUNT_LAST_NAME_INPUT = "//input[@name = 'customer[last_name]']";
    public static final String CREATE_ACCOUNT_EMAIL_INPUT = "//input[@name = 'customer[email]']";
    public static final String CREATE_ACCOUNT_PASSWORD_INPUT = "//input[@name = 'customer[password]']";
    public static final String CREATE_ACCOUNT_CREATE_BUTTON = "//input[@value = 'Create']";
    public static final String CREATE_ACCOUNT_ERROR_ALL_MESSAGE = "//div[@class = 'errors']";
    public static final String CREATE_ACCOUNT_EMAIL_ALREADY_ASSOCIATED_MESSAGE = "//div[@class = 'errors']//*[text() = 'This email address is already associated with an account. If this account is yours, you can ']";
    public static final String CREATE_ACCOUNT_EMAIL_CANT_BE_BLANK_MESSAGE = "//div[@class = 'errors']//li";


    // English books xpath
    public static final String ENGLISH_BOOK_I_LOVE_TO_EAT_FRUITS = "//img[@alt='I-Love-to-Eat-Fruits-and-Vegetables-kids-bunnies-bedtime-story-Shelley-Admont-English-cover']";


}
