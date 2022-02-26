package Pages;

public class GalleryPage extends BasePage{
    public static final String GALLERY_PAGE_TITLE = "//a[text() = 'Gallery']";

    public boolean isGalleryPageTitleVisible(){
        return elementExists(GALLERY_PAGE_TITLE);
    }

}
