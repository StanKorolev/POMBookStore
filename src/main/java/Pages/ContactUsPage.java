package Pages;

import Consts.Consts;

public class ContactUsPage extends BasePage {
    public static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";

    public boolean isPageTitleVisible() {
        return elementExists(CONTACT_US_HEADER);
    }
//Contact Us Send Message Button
    public void contactUsSendMessageButton() {
        clickElementByXpath(Consts.CONTACT_US_SEND_MESSAGE_BUTTON);
    }

//    Contact Us Error Messages visible
    public boolean isNoNameErrorMessagesVisible(){
        return elementExists(Consts.CONTACT_US_EMPTY_NAME_ERROR_MESSAGE);
    }

    public boolean isNoEmailErrorMessageVisible(){
        return elementExists(Consts.CONTACT_US_EMPTY_EMAIL_ERROR_MESSAGE);
    }

    public boolean isEmptyMessageFieldErrorMessageVisible(){
        return elementExists(Consts.CONTACT_US_EMPTY_MESSAGE_ERROR_MESSAGE);
    }
    public boolean isEnterValidEmailErrorMessageVisible(){
        return elementExists(Consts.CONTACT_US_ENTER_VALID_EMAIL_ERROR_MESSAGE);
    }

//    Contact Us Send Text to the form
    public void contactUsEnterName(String name){
        sendTextToElementByXpath(Consts.CONTACT_US_NAME_FIELD, name);
    }
    public void contactUsEnterEmail(String email){
        sendTextToElementByXpath(Consts.CONTACT_US_EMAIL_FIELD, email);
    }
    public void contactUsEnterMessage(String message){
        sendTextToElementByXpath(Consts.CONTACT_US_YOUR_MESSAGE_FIELD, message);
    }
}
