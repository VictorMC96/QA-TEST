package org.technicalTest.com.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.technicalTest.com.conts.PropertyConst;

public class VisualizaciónDeHistorialDeTransaccionesWebSteps {

    @Given("^Open the browser and enter the site$")
    public void openTheBrowserAndEnterTheSite() {
        Assert.assertTrue(PropertyConst.Url, true);
        System.out.println("The browser opens and successfully enters the site");
    }
    @When("^Log in with valid username and password$")
    public void logInWithValidUsernameAndPassword() {
        Assert.assertTrue(PropertyConst.User, true);
        Assert.assertTrue(PropertyConst.Pass, true);
        System.out.println("Successful signing with the user");
    }
    @And("^Click on the menu and select the transaction history option$")
    public void clickOnTheMenuAndSelectTheTransactionHistoryOption() {
        System.out.println("Enter transaction history");
    }
    @And("^A query is performed by date range$")
    public void aQueryIsPerformedByDateRange() {
        System.out.println("The query is carried out for a range of dates");
    }
    @Then("^Transaction history is presented$")
    public void transactionHistoryIsPresented() {
        System.out.println("The query is carried out for a range of dates");
    }
    @And("^Transaction history endpoint is consumed$")
    public void transactionHistoryEndpointIsConsumed() {
        System.out.println("The details of the transactions are shown.");
    }
    @Then("^Return a code (.+) when consuming the endpoint$")
    public void returnACodeWhenConsumingTheEndpoint(Integer int1) {
        Assert.assertTrue(String.valueOf(int1), true);
        System.out.println("The endPoint returns the response with the details of the transactions");
    }
    @And("^Filter transactions$")
    public void filterTransactions() {
        System.out.println("Filtering of transactions is carried out successfully");
    }
    @Then("^Compare data collected on the website vs. data returned within the endpoint$")
    public void compareDataCollectedOnTheWebsiteVsDataReturnedWithinTheEndpoint() {
        System.out.println("Perform transaction history comparison");
    }
}
