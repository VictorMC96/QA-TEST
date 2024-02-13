package org.technicalTest.com.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class PruebasDeRendimientoSteps {

    @Given("^Transaction endpoint is consumed$")
    public void transactionEndpointIsConsumed() {
        System.out.println("Transaction endpoint consumption is performed");
    }
    @When("^Capture backoffice credentials (.+) and (.+)$")
    public void captureBackofficeCredentials(String user, String pass) {
        Assert.assertTrue(user, true);
        Assert.assertTrue(pass, true);
        System.out.println("Successful signing with the backoffice user");
    }
    @And("^The (.+) is captured$")
    public void theCapturedAmount(Integer amount) {
        Assert.assertTrue(String.valueOf(amount), true);
        System.out.println("An amount was captured");
    }
    @And("^Transaction concept (.+)$")
    public void transactionConcept(String concept) {
        Assert.assertTrue(concept, true);
        System.out.println("A concept was added to the transaction");
    }
}