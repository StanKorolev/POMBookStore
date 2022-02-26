package Pages;

public class ResourcesPage extends BasePage{
    public static final String RESOURCES_TITLE = "//*[text() = 'Fun and Educational Videos for Kids']";

    public boolean isResourcesPageTitleVisible(){
        return  elementExists(RESOURCES_TITLE);
    }
}
