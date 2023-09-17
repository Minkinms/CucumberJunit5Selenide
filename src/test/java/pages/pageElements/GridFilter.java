package pages.pageElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class GridFilter {


    private final SelenideElement FILTER;

    public GridFilter(SelenideElement filter) {
        FILTER = filter;
    }

    public void searchByFilter(String invoiceId) {
        System.out.println("Фильтруем грид по Id накладной");
        FILTER.setValue(invoiceId);
        FILTER.sendKeys(Keys.ENTER);
    }
}
