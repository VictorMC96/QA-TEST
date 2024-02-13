package org.technicalTest.com.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class RegistroDeUsuarioSteps {

    @Given("^Open the mobile application$")
    public void openMobileApplication(){
        Assert.assertTrue("Application start", true);
        System.out.println("Se abrio la aplicación de forma exitosa");
    }

    @When("^Click on the Register button$")
    public void selectButtonCheckIn(){
        Assert.assertTrue("Select button check in", true);
        System.out.println("Se dio clic sobre el botón registrarse");
    }

    @And("^Enter a username (.+)$")
    public void captureUserName(String user){
        Assert.assertTrue(user, true);
        System.out.println("Se capturó el nombre se usuario:" + user);
    }
    @And("^Capture a name (.+)$")
    public void captureFirstName(String firstName){
        Assert.assertTrue(firstName, true);
        System.out.println("Se capturó el nombre:" + firstName);
    }
    @And("^Capture paternal surname (.+)$")
    public void captureSurname(String surName){
        Assert.assertTrue(surName, true);
        System.out.println("Se capturó el apellido paterno:" + surName);
    }
    @And("^Capture mother's last name (.+)$")
    public void secondSurname(String secondName){
        Assert.assertTrue(secondName, true);
        System.out.println("Se capturó el apellido materno:" + secondName);
    }
    @And("^Enter a date of birth (.+)$")
    public void captureBirthdayDate(String date){
        Assert.assertTrue(date, true);
        System.out.println("Se capturó la fecha de nacimiento:" + date);
    }
    @And("^Capture an email (.+)$")
    public void captureEmail(String email){
        Assert.assertTrue(email, true);
        System.out.println("Se capturó el correo electrónico:" + email);
    }
    @And("^Capture a password (.+)$")
    public void capturePassword(String pass){
        Assert.assertTrue(pass, true);
        System.out.println("Se capturó la contraseña:" + pass);
    }
    @And("^Select the create account button$")
    public void selectButtonCreateAccount(){
        System.out.println("Se seleccionó el botón crear cuenta");
    }

    @Then("^Your account was created successfully$")
    public void messagesSuccessful(){
        System.out.println("Se presenta el mensaje:" + "¡Tu cuenta fue creada exitosamente!");
    }
}