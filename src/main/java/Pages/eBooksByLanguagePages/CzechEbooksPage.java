package Pages.eBooksByLanguagePages;

import Pages.BasePage;

public class CzechEbooksPage extends BasePage {

    public static final String EBOOKS_CZECH_PAGE_TITLE = "//h1[text()='eBooks in Czech - Čeština']";

    public boolean isCzechBooksPageTitleVisible(){
        return elementExists(EBOOKS_CZECH_PAGE_TITLE);
    }

}
