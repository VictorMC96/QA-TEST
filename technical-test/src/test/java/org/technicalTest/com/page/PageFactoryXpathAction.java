package org.technicalTest.com.page;

import org.technicalTest.com.conts.PropertyConst;

public class PageFactoryXpathAction {
    PageFactoryXpathLogic pageFactoryXpathLogic;

    public void startSession(){
        pageFactoryXpathLogic.userSession(PropertyConst.User);
        pageFactoryXpathLogic.passwordSession(PropertyConst.Pass);
        pageFactoryXpathLogic.clickOnTheButtonLoginSession();
        pageFactoryXpathLogic.clickOnTheButtonCloseSession();
    }
}