package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.pageElements.GridFilter;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Torg12RetailPage extends BasePage {

    private static final SelenideElement TABLE_INVOICE = $(By.xpath(".//*[(contains(@id,'T12rGrid') or " +
            "contains(@id,'T12rTransportCompanyGrid')) and contains(@class,'x-grid-body')]"));
    private static final SelenideElement LOADING_MASK = $(By.xpath(".//*[contains(@id,'T12rGrid')]//*[contains(@id,'loadmask') and contains(text(),'Загрузка')]"));
    private static final ElementsCollection ALL_INVOICES = $$(By.xpath(".//*[contains(@class, 'x-grid-item-container')]//*[contains(@class, 'x-grid-item')]"));
    private static final ElementsCollection ALL_ROWS_INVOICES = $$(By.xpath(".//*[contains(@class,'x-grid-row')]"));

    //Filters
    public final GridFilter invoiceIdFilter = new GridFilter($(By.xpath(".//*[@name='invoiceId']")));

    protected void checkComponentIsLoaded() {
        TABLE_INVOICE.should(Condition.visible);

        System.out.println("Элементы окна ТОРГ12-розница отображаются");
    }

    /**
     * Проверяем, что загрузилась таблица с накладными
     */
    public void isVisibleTableInvoice() {
        LOADING_MASK.shouldBe(Condition.visible, Duration.ofSeconds(40));
        LOADING_MASK.shouldBe(Condition.hidden, Duration.ofSeconds(40));
        ALL_INVOICES.shouldBe(CollectionCondition.sizeGreaterThanOrEqual(1));
    }

    public ProductInvoiceTabPage openParametersInvoice(String invoiceId) {
        SelenideElement invoiceRow = ALL_ROWS_INVOICES.find(Condition.innerText(invoiceId));
        SelenideElement optionBtn = invoiceRow.find(By.xpath(".//*[contains(@class,'icon-option')]"));
        optionBtn.click();
        return new ProductInvoiceTabPage();
    }

}
