package Pages;

public class ChineseBooksPage extends BasePage {
    public static final String CHINESE_PAGE_TITLE = "//a[text()='Mandarin Chinese - 中文']";

    public boolean isChinesePageTitleVisible(){
        return elementExists(CHINESE_PAGE_TITLE);
    }

}
