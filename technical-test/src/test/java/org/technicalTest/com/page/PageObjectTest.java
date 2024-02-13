package org.technicalTest.com.page;

public class PageObjectTest {

    PageObjectModelAction action = new PageObjectModelAction();

    public void pageTest(){
        action.captureUserOnTheCamp();
        action.capturePassOnTheCamp();
        action.selectButtonLoginSession();
    }
}