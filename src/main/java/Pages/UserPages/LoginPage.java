package Pages.UserPages;

import Consts.Consts;
import Pages.BasePage;

public class LoginPage extends BasePage {

    public static final String LOGIN_PAGE_TITLE = "//h1[text() = 'Login']";


    public boolean isLoginPageTitleVisible() {
        return elementExists(LOGIN_PAGE_TITLE);
    }

    //   Extra links
    public CreateAccountPage createAccountOption() {
        clickElementByXpath(Consts.LOGIN_CREATE_NEW_ACCOUNT_LINK);
        return new CreateAccountPage();
    }

    public ForgotPasswordPage forgotYourPasswordOption() {
        clickElementByXpath(Consts.LOGIN_FORGOT_PASSWORD_);
        return new ForgotPasswordPage();
    }

    //Login input
    public void loginEmailInput(String email) {
        sendTextToElementByXpath(Consts.LOGIN_EMAIL_IN_INPUT, email);
    }

    public void loginPasswordInput(String password) {
        sendTextToElementByXpath(Consts.LOGIN_PASSWORD_INPUT, password);
    }

    public void sighInButton() {
        clickElementByXpath(Consts.LOGIN_SIGN_IN_BUTTON);
    }

    public boolean isIncorrectEmailPasswordErrorMessageVisible() {
        return elementExists(Consts.LOGIN_INCORRECT_EMAIL_PASSWORD_ERROR_MESSAGE);
    }
}
