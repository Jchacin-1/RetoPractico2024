package pa.com.banistmo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/acerca_de_nostros.feature",
        tags = "@VisualizacioProductosYServicios",
        glue = "pa.com.banistmo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnersAcercaDeNostros {
}
