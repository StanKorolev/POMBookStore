package Pages.UserPages;

import Pages.BasePage;

public class MyAccountPage extends BasePage {
    public static final String MY_ACCOUNT_PAGE_TITLE = "//h1[text()='My Account']";

    public boolean isMyAccountPageTitleVisible(){
        return elementExists(MY_ACCOUNT_PAGE_TITLE);
    }
}
