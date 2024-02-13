package org.technicalTest.com.page;

import org.technicalTest.com.conts.PropertyConst;

public class PageObjectModelAction extends PageObjectModelLogic{

    WebDriverDto webDriverDto = new WebDriverDto();

    public void captureUserOnTheCamp(){
        insertUserOnTheCamp(webDriverDto.getUserLocator(), PropertyConst.User);
    }

    public void capturePassOnTheCamp(){
        insertPasswordOnTheCamp(webDriverDto.getPasswordLocator(), PropertyConst.Pass);
    }

    public void selectButtonLoginSession(){
        clickOnTheSessionButton(webDriverDto.getButtonSessionLocator());
    }
}