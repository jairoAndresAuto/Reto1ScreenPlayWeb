package in.automationtesting.practice.certificacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PagPrincipalPage {

    public static final Target IMG_SELENIUM_BOOKS=Target.the("imagen a esperar").located(By.xpath("//img[@alt='Shop Selenium Books']"));
    public static final Target BTN_MENU=Target.the("boton menu").locatedBy("//a[contains(.,'{0}')]");
    public static final Target BTN_AGREGAR_PRODUCTO=Target.the("boton agregar producto").locatedBy("//h3[contains(.,'{0}')]/../..//a[contains(.,'Add to basket')]");
    public static final Target INP_QUALITY=Target.the("Numero de productos").located(By.xpath("//div[@class='quantity']//input"));
    public static final Target BTN_UPDATE_BASKET=Target.the("actualizar Numero de productos").located(By.xpath("//input[@value='Update Basket']"));
    public static final Target BTN_PROCEED_CHECKOUT=Target.the("actualizar Numero de productos").located(By.xpath("//div//a[contains(.,'Proceed to')]"));
    public static final Target LBL_PRECIO=Target.the("Etiqueta precio actualizado").located(By.xpath("//span[contains(.,'945.00')]"));



}
