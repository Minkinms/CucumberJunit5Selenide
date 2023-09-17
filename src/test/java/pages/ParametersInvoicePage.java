package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ParametersInvoicePage extends BasePage{

    private static final SelenideElement TAB_PRODUCT = $(By.xpath(".//*[contains(@class,'tab') and text()='Товары']"));
    private static final SelenideElement TAB_SETTING = $(By.xpath(".//*[contains(@class,'tab') and (text()='Настройки накладной' or text()='Настройки заказа')]"));

    @Override
    protected void checkComponentIsLoaded() {
        System.out.println("ParametersInvoicePage проверка элементов страницы");
        TAB_PRODUCT.should(Condition.visible);
        TAB_SETTING.should(Condition.visible);

        System.out.println("Элементы окна ParametersInvoicePage отображаются");
    }

    public SettingsInvoiceTabPage openSettingTab() {
        TAB_SETTING.click();
        return new SettingsInvoiceTabPage();
    }

}
