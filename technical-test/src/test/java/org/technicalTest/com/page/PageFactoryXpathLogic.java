package org.technicalTest.com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryXpathLogic {
    private WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Usuario']")
    private WebElement user;

    @FindBy(xpath = "//input[@placeholder='Contraseña']")
    private WebElement pass;

    @FindBy(xpath = "//button[@name='Ingresar']")
    private WebElement buttonGetInto;

    @FindBy(xpath = "//a[contains(text(), 'Salir')]")
    private WebElement closeSession;

    public PageFactoryXpathLogic(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userSession(String captureUser){
        user.sendKeys(captureUser);
    }

    public void passwordSession(String capturePassword){
        pass.sendKeys(capturePassword);
    }

    public void clickOnTheButtonLoginSession(){
        buttonGetInto.click();
    }

    public void clickOnTheButtonCloseSession(){
        closeSession.click();
    }
}