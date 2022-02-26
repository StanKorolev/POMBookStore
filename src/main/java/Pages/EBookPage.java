package Pages;
import Consts.Consts;
import Pages.eBooksByLanguagePages.CzechEbooksPage;
import Pages.eBooksByLanguagePages.JapaneseEbooksPage;


public class EBookPage extends BasePage {
    public static final String EBOOK_PAGE_TITLE = "//h1[text()='ebooks']";

    public boolean isEbookPageTitleVisible() {
        return elementExists(EBOOK_PAGE_TITLE);
    }

    public CzechEbooksPage openCzechDropDownEBooks(){
        clickElementByXpath(Consts.EBOOK_BY_LANG_DROPDOWN_OPTION);
        clickElementByXpath(Consts.EBOOK_DROPDOWN_CZECH);
        return new CzechEbooksPage();
    }

    public JapaneseEbooksPage openJapaneseDropDownEbooks(){
        clickElementByXpath(Consts.EBOOK_BY_LANG_DROPDOWN_OPTION);
        clickElementByXpath(Consts.EBOOK_DROPDOWN_JAPANESE);
        return new JapaneseEbooksPage();
    }

}
