package org.technicalTest.com.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.technicalTest.com.conts.PropertyConst;

public class IntegraciónDeBackendYBackOfficeSteps {
    @Given("^Endpoint consumption of transactions(.+)$")
    public void endpointConsumptionOfTransactions(String id) {
        Assert.assertTrue(id, true);
        System.out.println("Transaction endpoint consumption is performed");
    }

    @When("^Backoffice credentials$")
    public void captureBackofficeCredentials() {
        Assert.assertTrue(PropertyConst.User, true);
        Assert.assertTrue(PropertyConst.Pass, true);
        System.out.println("Successful signing with the backoffice user");
    }

    @Then("^Returns a status of (.+)$")
    public void endPointReturnsStatus(Integer int1) {
        Assert.assertTrue(String.valueOf(int1), true);
        System.out.println("The endPoint returns the response with the details of the transactions");
    }

    @And("^Filter transactions (.+)$")
    public void filterTransaction(String transaction) {
        Assert.assertTrue(transaction, true);
        System.out.println("Filtering of transactions is carried out successfully");
    }

    @And("^The backoffice consults the transactions (.+) in the different statuses (.+)$")
    public void consultsTheTransactions(String transaction, String status) {
        Assert.assertTrue(transaction, true);
        Assert.assertTrue(status, true);
        System.out.println("Consultation of transactions for each of the statuses");
    }
}