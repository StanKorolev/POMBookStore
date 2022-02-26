package Pages;

public class FaqsPage extends BasePage{
    public static final String FAQS_PAGE_TITLE = "//h1[text() = 'FAQ/addition info']";

    public boolean isFaqsPageTitleVisible (){
        return elementExists(FAQS_PAGE_TITLE);
    }

}
