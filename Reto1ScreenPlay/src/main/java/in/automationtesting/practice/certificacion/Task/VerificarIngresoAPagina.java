package in.automationtesting.practice.certificacion.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static in.automationtesting.practice.certificacion.userinterface.PagPrincipalPage.BTN_MENU;
import static in.automationtesting.practice.certificacion.userinterface.PagPrincipalPage.IMG_SELENIUM_BOOKS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificarIngresoAPagina implements Task {

    private String opcion;

    public VerificarIngresoAPagina(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(IMG_SELENIUM_BOOKS,isVisible()),
                Click.on(BTN_MENU.of(opcion)));
    }

    public static VerificarIngresoAPagina verificarIngresaMenu(String opcion){
        return Tasks.instrumented(VerificarIngresoAPagina.class,opcion);
    }

}
