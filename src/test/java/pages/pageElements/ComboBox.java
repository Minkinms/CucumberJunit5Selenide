package pages.pageElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@AllArgsConstructor
public class ComboBox {

    private SelenideElement input;
    private SelenideElement picker;
    private String optionXpath;

    public void selectComboBoxOption(String valueToSelect) {
        System.out.println("Выбор из комбо через пикер: " + valueToSelect);
        picker.should(Condition.visible).click();
        SelenideElement optionElement = $(By.xpath(String.format(optionXpath, valueToSelect)));
        optionElement.should((Condition.visible)).click();
        System.out.println("Выбор успешно выполнен: " + valueToSelect);
    }

    //Выбор из комбо через пикер
    public void selectComboBoxOptionWithChecking(String valueToSelect) {
        System.out.println("Выбор из комбо через пикер: " + valueToSelect);
        picker.should(Condition.visible).click();
        SelenideElement optionElement = $(By.xpath(String.format(optionXpath, valueToSelect)));
        optionElement.should((Condition.visible)).click();
        input.should(Condition.exactValue(valueToSelect));
        System.out.println("Выбор и проверка отображаемого успешно выполнены: " + valueToSelect);
    }
    //Выбор из комбо без проверки после выбора
    //Выбор из комбо с вводом текста
    //Выбор из комбо с вводом текста и поиском
}
