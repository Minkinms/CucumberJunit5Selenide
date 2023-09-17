package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    private static final SelenideElement PRELOAD_BY = $(By.xpath("//div[@id='preload']"));
    private static final SelenideElement START_BTN_BY = $(By.xpath("//span[contains(text(), 'Старт')]/ancestor::span[@data-ref= 'btnWrap']"));
    private static final SelenideElement TORG12_RETAIL_ICON = $(By.xpath("//div[@id = 'T12r-shortcut']"));

    protected void checkComponentIsLoaded() {
        System.out.println("Проверяем видимость элементов на странице MainPage");
        PRELOAD_BY.shouldBe(hidden, Duration.ofSeconds(25, 1));
        START_BTN_BY.shouldBe(visible);
        TORG12_RETAIL_ICON.shouldBe(visible);

        System.out.println("Элементы на странице MainPage загружены (checkComponentIsLoaded)");
    }

    public Torg12RetailPage openTORG12() {
        System.out.println("Открываем накладные ТОРГ12-розница");
        TORG12_RETAIL_ICON.click();
        return new Torg12RetailPage();
    }

    public boolean pageIsLoaded() {
        //Провлеряем видимость всех основных элементов
        return START_BTN_BY.is(visible) &&
                TORG12_RETAIL_ICON.is(visible);
    }
}
