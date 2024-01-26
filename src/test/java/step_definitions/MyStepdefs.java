package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("que soy un nuevo usuario en la app {string}")
    public void queSoyUnNuevoUsuarioEnLaApp(String arg0) {
        System.out.println("arg0 = " + arg0);
    }

    @When("Me registro como un usuario nuevo")
    public void meRegistroComoUnUsuarioNuevo() {
        System.out.println("true = " + true);
    }

    @Then("Se despliega la informacion para registro de nuevo usuario")
    public void seDespliegaLaInformacionParaRegistroDeNuevoUsuario() {
        System.out.println("true = " + true);
    }

    @And("Lleno los datos de registro")
    public void llenoLosDatosDeRegistro() {
        System.out.println("true = " + true);
    }

    @Then("Se crea mi cuenta en la app")
    public void seCreaMiCuentaEnLaApp() {
        System.out.println("true = " + true);
    }

    @Given("que me conecto al endpoint transacciones")
    public void queMeConectoAlEndpointTransacciones() {
        System.out.println("true = " + true);
    }

    @When("Posteo transacciones")
    public void posteoTransacciones() {
        System.out.println("true = " + true);
    }

    @Then("La api responde con un codigo {string}")
    public void laApiRespondeConUnCodigo(String arg0) {
        System.out.println("arg0 = " + arg0);
    }

    @And("Ingreso como usuario registrado del back office")
    public void ingresoComoUsuarioRegistradoDelBackOffice() {
        System.out.println("true = " + true);
    }

    @Then("Valido que la transaccion se muestre en los registros del back office")
    public void validoQueLaTransaccionSeMuestreEnLosRegistrosDelBackOffice() {
        System.out.println("true = " + true);
    }

    @Given("que me conecto al endpoint procesar transacciones")
    public void queMeConectoAlEndpointProcesarTransacciones() {
        System.out.println("true = " + true);
    }

    @When("Proceso <transacciones>")
    public void procesoTransacciones() {
        System.out.println("true = " + true);
    }

    @Then("Valido que las <transacciones procesadas> se muestre en los registros del back office")
    public void validoQueLasTransaccionesProcesadasSeMuestreEnLosRegistrosDelBackOffice() {
        System.out.println("true = " + true);
    }

    @Given("que soy un usuario con sesion iniciada en la app web")
    public void queSoyUnUsuarioConSesionIniciadaEnLaAppWeb() {
        System.out.println("true = " + true);
    }

    @When("Ingreso a mi historial de transacciones")
    public void ingresoAMiHistorialDeTransacciones() {
        System.out.println("true = " + true);
    }

    @And("Recupero de la api historial de transacciones las transacciones")
    public void recuperoDeLaApiHistorialDeTransaccionesLasTransacciones() {
        System.out.println("true = " + true);
    }

    @Then("Comparo el historial de transacciones recuperado por la api con lo que se muestra en el sitio web")
    public void comparoElHistorialDeTransaccionesRecuperadoPorLaApiConLoQueSeMuestraEnElSitioWeb() {
        System.out.println("true = " + true);
    }

    @When("Posteo <cantidad> transacciones")
    public void posteoCantidadTransacciones() {
        System.out.println("true = " + true);
    }

    @And("Valido que las transacciones aparezcan en el back office con un usuario registrado y con un tiempo menor a <tiempo back office>")
    public void validoQueLasTransaccionesAparezcanEnElBackOfficeConUnUsuarioRegistradoYConUnTiempoMenorATiempoBackOffice() {
        System.out.println("true = " + true);
    }

    @Then("valido que el tiempo de respuesta en el back y front sea menor a <tiempo en back> y <tiempo front>")
    public void validoQueElTiempoDeRespuestaEnElBackYFrontSeaMenorATiempoEnBackYTiempoFront() {
        System.out.println("true = " + true);
    }

    @Given("que soy un usuario con sesion iniciada en la app")
    public void queSoyUnUsuarioConSesionIniciadaEnLaApp() {
        System.out.println("true = " + true);
    }

    @When("actualizo una transaccion a procesada")
    public void actualizoUnaTransaccionAProcesada() {
        System.out.println("true = " + true);
    }

    @Then("la transaccion se actualiza con el nuevo estatus")
    public void laTransaccionSeActualizaConElNuevoEstatus() {
        System.out.println("true = " + true);
    }
}
