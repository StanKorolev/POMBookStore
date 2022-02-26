package Pages;

public class BlogPage extends BasePage{
    public static final String BLOG_PAGE_TITLE = "//h1[text() = 'Blog']";

    public boolean isBlogPageTitleVisible(){
        return elementExists(BLOG_PAGE_TITLE);
    }
}
