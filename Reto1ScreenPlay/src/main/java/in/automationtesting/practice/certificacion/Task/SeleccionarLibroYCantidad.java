package in.automationtesting.practice.certificacion.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static in.automationtesting.practice.certificacion.userinterface.PagPrincipalPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SeleccionarLibroYCantidad implements Task {

    private List<Map<String,String>> datalibro;

    public SeleccionarLibroYCantidad(List<Map<String, String>> datalibro) {
        this.datalibro = datalibro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_PRODUCTO.of(datalibro.get(0).get("nombre_libro"))),
                WaitUntil.the(BTN_MENU.of(datalibro.get(0).get("opcionMenuCarrito")),isVisible()),
                Click.on(BTN_MENU.of(datalibro.get(0).get("opcionMenuCarrito"))),
                WaitUntil.the(INP_QUALITY,isVisible()),
                Clear.field(INP_QUALITY),
                Enter.theValue(datalibro.get(0).get("cantidad")).into(INP_QUALITY),
                Click.on(BTN_UPDATE_BASKET),
                WaitUntil.the(LBL_PRECIO,isVisible()),
                Click.on(BTN_PROCEED_CHECKOUT)
        );
    }

    public static SeleccionarLibroYCantidad con(List<Map<String,String>> datalibro){
        return Tasks.instrumented(SeleccionarLibroYCantidad.class,datalibro);
    }
}
