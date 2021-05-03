package in.automationtesting.practice.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "in.automationtesting.practice.certificacion.stepdefinitions",
        features = "src/test/resources/in.automationtesting.practice.certificacion.features/comprar_libro.feature",
        snippets = SnippetType.CAMELCASE
)
public class ComprarLibroRunner {
}
