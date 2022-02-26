package Pages;

public class GiftCardPage extends BasePage {
    public static final String GIFT_CARD_TITLE = "//h1[text()='Gift Card']";

    public boolean isPageTitleVisible() {
        return elementExists(GIFT_CARD_TITLE);
    }

}

