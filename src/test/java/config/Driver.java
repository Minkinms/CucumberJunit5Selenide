package config;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;

public class Driver {

    public static void initChromeDriver(String uri) {
//        setChromeDriverPath();
        Configuration.baseUrl = uri;
        Configuration.browser = Browsers.CHROME;
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 25000;
    }

    private static void setChromeDriverPath() {
        //Для случая прямого указания драйвера. В обычное время отрабатывает webdrivermanager
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
    }

}
