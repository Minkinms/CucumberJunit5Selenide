package pages.pageElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ComboBoxBuilder {

    private SelenideElement input;
    private SelenideElement picker;
    private String optionXpath;

    public ComboBoxBuilder setInput(String inputXpath) {
        this.input = $(By.xpath(inputXpath));
        return this;
    }

    public ComboBoxBuilder setPicker(String pickerXpath) {
        this.picker =  $(By.xpath(pickerXpath));
        return this;
    }

    public ComboBoxBuilder setOptionXpath(String optionXpath) {
        this.optionXpath = optionXpath;
        return this;
    }

    public ComboBox build() {
        return new ComboBox(input, picker, optionXpath);
    }

}