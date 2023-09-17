package tests;

import dataForTest.users.Users;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ProductInvoiceTabPage;
import pages.SettingsInvoiceTabPage;
import pages.Torg12RetailPage;

import static com.codeborne.selenide.Selenide.open;

public class TestSimpleSelenidePetshop extends BaseTest{

    private static final Users USER = Users.PLOTNIKOVA_A;
    private final String INVOICE_ID = "13039711";

//    @Test
    public void testSimpleSelenidePetshopFirst() {
        MainPage mainPage = loginUser(USER);
        Torg12RetailPage torg12RetailPage = mainPage.openTORG12();
        torg12RetailPage.isVisibleTableInvoice();

        torg12RetailPage.invoiceIdFilter.searchByFilter(INVOICE_ID);
        torg12RetailPage.isVisibleTableInvoice();

        ProductInvoiceTabPage productTab = torg12RetailPage.openParametersInvoice(INVOICE_ID);
        SettingsInvoiceTabPage settingTab = productTab.openSettingTab();

        settingTab.driverComboBox.selectComboBoxOptionWithChecking("Абрамов Михаил");
        settingTab.collectorComboBox.selectComboBoxOptionWithChecking("Антонов Антон");

        System.out.println("Тест успешно выполнен");
    }

//    @Test
    public void testSimpleSelenidePetshopSecond() {
        System.out.println("Page Second is loaded");
    }
}
