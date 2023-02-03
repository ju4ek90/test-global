package com.global;


import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.global.common.enums.ApplicationProperties;
import com.global.pages.BasicPage;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    protected BasicPage basicPage;


    protected void initPageObjects() {
        basicPage = new BasicPage();
    }

    public static void webDriver() {
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 70000;
    }


    public static void closeConnection() {
        getWebDriver().close();
    }


}
