package pages;

public abstract class BasePage {

    protected final String INPUT_TEMPLATE = "//*[@autotestid='%s']//*[@name='%s']";
    protected final String PICKER_TEMPLATE = "//parent::div//following-sibling::*[contains(@id,'picker')]";
    protected final String OPTION_TEMPLATE = "//*[@role='option' and text()='%s']";

    public BasePage() {
        checkComponentIsLoaded();
    }

    protected abstract void checkComponentIsLoaded();

}


