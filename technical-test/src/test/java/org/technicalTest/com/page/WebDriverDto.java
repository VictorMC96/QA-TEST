package org.technicalTest.com.page;

public class WebDriverDto {

    private final String userLocator;
    private final String passwordLocator;
    private final String buttonSessionLocator;

    public WebDriverDto(){
        this.userLocator = "//div[contains(text(),'userId')]";
        this.passwordLocator = "//*[contains(text(),'passId')]";
        this.buttonSessionLocator = "/html/body/div[2]/div/div/div/div[2]/div/form/input";
    }

    public String getUserLocator() {
        return userLocator;
    }

    public String getPasswordLocator() {
        return passwordLocator;
    }

    public String getButtonSessionLocator() {
        return buttonSessionLocator;
    }
}