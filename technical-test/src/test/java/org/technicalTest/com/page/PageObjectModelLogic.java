package org.technicalTest.com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectModelLogic {
    public static WebDriverWait wait;

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void insertUserOnTheCamp(String locator, String user){
        Find(locator).sendKeys(user);
    }

    public void insertPasswordOnTheCamp(String locator, String password){
        Find(locator).sendKeys(password);
    }

    public void clickOnTheSessionButton(String locator){
        Find(locator).click();
    }
}