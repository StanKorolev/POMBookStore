package Pages.UserPages;

import Pages.BasePage;

public class ForgotPasswordPage extends BasePage {
    public static final String FORGOT_PASSWORD_PAGE_TITLE = "//h2[text() = 'Reset your password']";

    public boolean isForgotPasswordPageTitleVisible(){
        return elementExists(FORGOT_PASSWORD_PAGE_TITLE);
    }

//    public void enterEmail(String email){
//        sendTextToElementByXpath();
//
//    }
}
