package in.automationtesting.practice.certificacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPage {

    public static final Target TXT_NOMBRE=Target.the("Nombres").located(By.id("billing_first_name"));
    public static final Target TXT_APELLIDOS=Target.the("Apellidos").located(By.id("billing_last_name"));
    public static final Target TXT_EMAIL=Target.the("Email").located(By.id("billing_email"));
    public static final Target TXT_PHONE=Target.the("Telefono").located(By.id("billing_phone"));
    public static final Target TXT_DIRECCION=Target.the("dirección").located(By.id("billing_address_1"));
    public static final Target TXT_CIUDAD=Target.the("ciudad").located(By.id("billing_city"));
    public static final Target TXT_ESTADO=Target.the("estado").located(By.id("billing_state"));
    public static final Target LBL_ETIQUETAS=Target.the("etiquetas a verficar").locatedBy("//strong[contains(.,'{0}')]");

}
