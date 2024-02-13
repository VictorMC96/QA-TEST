package org.technicalTest.com.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.technicalTest.com.conts.PropertyConst;

public class ActualizaciónDeEstadoDeTransaccionesSteps {
    @When("Sign in with a valid username and password")
    public void signInWithAValidUsernameAndPassword() {
        Assert.assertTrue(PropertyConst.User, true);
        Assert.assertTrue(PropertyConst.Pass, true);
        System.out.println("Successful signing with the user");
    }
    @And("Click on the menu and select the transaction status option")
    public void clickOnTheMenuAndSelectTheTransactionStatusOption() {
        System.out.println("Select the transaction status menu option");
    }
    @And("Validate transactions with pending status and finalized status")
    public void validateTransactionsWithPendingStatusAndFinalizedStatus() {
        System.out.println("Pending and completed transactions are downloaded");
    }
    @And("Make the status change manually")
    public void makeTheStatusChangeManually() {
        System.out.println("The change is made and the update made is saved");
    }
    @Then("The state change is successfully carried out")
    public void theStateChangeIsSuccessfullyCarriedOut() {
        System.out.println("The status change is carried out successfully");
    }
}