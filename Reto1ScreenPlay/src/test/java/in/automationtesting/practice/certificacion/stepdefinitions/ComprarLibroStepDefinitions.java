package in.automationtesting.practice.certificacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.automationtesting.practice.certificacion.GeneralStepDefinitions;
import in.automationtesting.practice.certificacion.Task.LlenarInformaciónPersonal;
import in.automationtesting.practice.certificacion.Task.SeleccionarLibroYCantidad;
import in.automationtesting.practice.certificacion.Task.VerificarIngresoAPagina;
import in.automationtesting.practice.certificacion.question.VaidateTarget;

import java.util.List;
import java.util.Map;

import static in.automationtesting.practice.certificacion.userinterface.InformacionPage.LBL_ETIQUETAS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarLibroStepDefinitions extends GeneralStepDefinitions {

    private static final String URL="http://practice.automationtesting.in/";

    @Before
    public void configuracionInicial(){
        setUp(URL);
    }

    @Given("^que me encuentro en la pagina automationtesting con opción (.*)$")
    public void queMeEncuentroEnLaPaginaAutomationtestingConOpciónShop(String opcionMenu) {
        theActorInTheSpotlight().attemptsTo(VerificarIngresoAPagina.verificarIngresaMenu(opcionMenu));
    }

    @When("^se procede a ingresar a comprar el libro e ingresar la cantidad$")
    public void seProcedeAIngresarAComprarElLibroEIngresarLaCantidad(List<Map<String,String>> datalibro) {
        theActorInTheSpotlight().attemptsTo(SeleccionarLibroYCantidad.con(datalibro));
    }

    @When("^se debe llenar el formulario de datos personales$")
    public void seDebeLlenarElFormularioDeDatosPersonales(List<Map<String, String>> dataPersonal) {
        theActorInTheSpotlight().attemptsTo(LlenarInformaciónPersonal.conDatos(dataPersonal));
    }

    @Then("^Verifico que la cantidad y el precio total\\.$")
    public void verificoQueLaCantidadYElPrecioTotal(List<Map<String, String>> datosEsperados) {
        theActorInTheSpotlight().should(seeThat(VaidateTarget.attach(datosEsperados.get(0).get("cantidad"), LBL_ETIQUETAS.of(datosEsperados.get(0).get("cantidad")))));
        theActorInTheSpotlight().should(seeThat(VaidateTarget.attach(datosEsperados.get(0).get("valor_pagar"), LBL_ETIQUETAS.of(datosEsperados.get(0).get("valor_pagar")))));
    }

}
