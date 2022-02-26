package Pages;

public class SpanishBooksPage extends BasePage{
    public static final String SPANISH_PAGE_TITLE = "//a[text()='Spanish - Español']";

    public boolean isSpanishPageTitleVisible(){
        return elementExists(SPANISH_PAGE_TITLE);
    }

}
