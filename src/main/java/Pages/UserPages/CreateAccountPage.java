package Pages.UserPages;

import Consts.Consts;
import Pages.BasePage;

public class CreateAccountPage extends BasePage {

    public static final String CREATE_ACCOUNT_TITLE = "//h1[text()='Create Account']";

    public boolean isCreateAccountTitleVisible() {
        return elementExists(CREATE_ACCOUNT_TITLE);
    }

    //    Create account fill up form
    public void enterFirstName(String firstName) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_FIRST_NAME_INPUT, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_LAST_NAME_INPUT, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_EMAIL_INPUT, email);
    }

    public void enterPassword(String password) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_PASSWORD_INPUT, password);
    }

    public void pushCreateButton() {
        clickElementByXpath(Consts.CREATE_ACCOUNT_CREATE_BUTTON);
    }

//    Error messages
    public boolean isNoEmailNoPasswordErrorMessageVisible(){
        return elementExists(Consts.CREATE_ACCOUNT_ERROR_ALL_MESSAGE);
    }
    public boolean isNoEmailErrorMessageVisible(){
        return elementExists(Consts.CREATE_ACCOUNT_EMAIL_CANT_BE_BLANK_MESSAGE);
    }
    public boolean isExistingEmailUsedErrorMessageVisible(){
        return elementExists(Consts.CREATE_ACCOUNT_EMAIL_ALREADY_ASSOCIATED_MESSAGE);
    }
    public boolean isNoPasswordMessageVisible(){
        return elementExists(Consts.CREATE_ACCOUNT_EMAIL_CANT_BE_BLANK_MESSAGE);
    }

}
