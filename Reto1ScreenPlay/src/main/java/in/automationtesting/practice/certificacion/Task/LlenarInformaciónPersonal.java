package in.automationtesting.practice.certificacion.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static in.automationtesting.practice.certificacion.userinterface.InformacionPage.*;

public class LlenarInformaciónPersonal implements Task {

    private List<Map<String,String>> dataPersonal;

    public LlenarInformaciónPersonal(List<Map<String, String>> dataPersonal) {
        this.dataPersonal = dataPersonal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue(dataPersonal.get(0).get("nombre")).into(TXT_NOMBRE),
               Enter.theValue(dataPersonal.get(0).get("apellido")).into(TXT_APELLIDOS),
               Enter.theValue(dataPersonal.get(0).get("correo")).into(TXT_EMAIL),
               Enter.theValue(dataPersonal.get(0).get("telefono")).into(TXT_PHONE),
               Enter.theValue(dataPersonal.get(0).get("direccion")).into(TXT_DIRECCION),
               Enter.theValue(dataPersonal.get(0).get("ciudad")).into(TXT_CIUDAD),
               Enter.theValue(dataPersonal.get(0).get("estado")).into(TXT_ESTADO)
       );
    }

    public static LlenarInformaciónPersonal conDatos(List<Map<String,String>> dataPersonal){
        return Tasks.instrumented(LlenarInformaciónPersonal.class,dataPersonal);
    }
}
