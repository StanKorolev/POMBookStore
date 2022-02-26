package Pages;

public class FrenchBooksPage extends BasePage{
    public static final String FRENCH_PAGE_TITLE = "//a[text()='French - Français']";

    public boolean isSFrenchPageTitleVisible(){
        return elementExists(FRENCH_PAGE_TITLE);
    }
}
