package com.global.pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.global.common.enums.ApplicationProperties.HTTP_HOST;
import static com.global.common.utils.Calc.taxCalc;
import static java.util.concurrent.TimeUnit.SECONDS;

public class BasicPage {
    public static final String COUNTRY = "//*[@id='vatcalculator']//*[@name='Country']";
    private static final String TEST_VALUE = "1";
    private static final String NET_PRICE_INPUT = "//*[@id='NetPrice']";
    private static final String TAX_INPUT_BUTTON = "//*[@id='vatcalculator']//*[contains(text(), 'Value-Added Tax')]";
    private static final String PRICE_INPUT_BUTTON = "//*[@id='vatcalculator']//*[contains(text(), 'Price incl. VAT')]";
    private static final String VAT_INPUT = "//*[@id='VATsum']";
    private static final String PRICE_INPUT = "//*[@id='Price']";
    private static final String COEF_WITHOUT_VAT = "//*[@id='VATpct2']";
    private static final String COEF_INCLUDE_VAT = "//*[@id='VATpct1']";
    public static String countryTemplate = "//*[@id='vatcalculator']//*[@name='Country']//*[contains(text(), '%s')]";
    public static String PRECENTAGE = "//*[@id='chart_div']//*";
    public static String vatTemplate = "//label[contains(text(), '%s')]";
//    public static String vatTemplate = "//*[@id='VAT_%s']//..//label[contains(text(), '%s')]";

    public void openPage() {
        open(HTTP_HOST.getValue());
        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().pageLoadTimeout(200, SECONDS);
        sleep(5000);
    }

    public void chooseTheCountry(String country) {
        $x(COUNTRY).click();
        $x(String.format(countryTemplate, country)).click();
    }

    public void chooseTheVat(String vat) {
        $x(String.format(vatTemplate, vat)).click();
    }

    public void enterTheTestValue() {
        $x(NET_PRICE_INPUT).val(TEST_VALUE);
    }

    public void enterTheTestValueInTax() {
        $x(TAX_INPUT_BUTTON).click();
        $x(VAT_INPUT).val(TEST_VALUE);
    }

    public void enterTheTestValueInPrice() {
        $x(PRICE_INPUT_BUTTON).click();
        $x(PRICE_INPUT).val(TEST_VALUE);
    }

    public boolean isCoefficientWithoutVatPresent() {
        return $x(COEF_WITHOUT_VAT).isDisplayed();
    }

    public boolean isCoefficientIncludeVatPresent() {
        return $x(COEF_INCLUDE_VAT).isDisplayed();

    }

    public boolean isTaxOnGrafCorrect(String vat) {
        String res = taxCalc(Double.parseDouble(vat), Double.parseDouble(TEST_VALUE));
        System.out.println(res);
        return $x(PRECENTAGE).toString().contains(res + '%');
    }
}

