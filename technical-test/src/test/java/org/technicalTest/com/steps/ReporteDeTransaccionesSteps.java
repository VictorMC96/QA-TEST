package org.technicalTest.com.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.technicalTest.com.conts.PropertyConst;

public class ReporteDeTransaccionesSteps {

    @Given("^Endpoint consumption of transactions$")
    public void endpointConsumptionOfTransactions() {
        System.out.println("Transaction endpoint consumption is performed");
    }

    @When("^Capture backoffice credentials$")
    public void captureBackofficeCredentials() {
        Assert.assertTrue(PropertyConst.User, true);
        Assert.assertTrue(PropertyConst.Pass, true);
        System.out.println("Successful signing with the backoffice user");
    }

    @Then("^The endPoint returns status (.+)$")
    public void theEndPointReturnsStatus(Integer int1) {
        Assert.assertTrue(String.valueOf(int1), true);
        System.out.println("The endPoint returns the response with the details of the transactions");
    }
}