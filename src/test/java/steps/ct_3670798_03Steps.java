package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ct_3670798_03Page;
import static org.junit.Assert.*;

public class ct_3670798_03Steps {

    WebDriver driver;
    ct_3670798_03Page page;

    public ct_3670798_03Steps() {
        page = PageFactory.initElements(driver, ct_3670798_03Page.class);
    }

    @Given("el usuario ha exportado el Excel")
    public void el_usuario_ha_exportado_el_Excel() {
        // Logic to export Excel file
    }

    @When("el archivo es abierto")
    public void el_archivo_es_abierto() {
        page.openExportedExcel();
    }

    @Then("debería ver la columna \"Estado Código\" inmediatamente a la derecha de la columna I")
    public void debería_ver_la_columna_Estado_Código_inmediatamente_a_la_derecha_de_la_columna_I() {
        assertTrue(page.isEstadoCodigoInCorrectPosition());
    }

    @Given("el Excel contiene la columna 'Estado Código'")
    public void el_Excel_contiene_la_columna_Estado_Código() {
        assertTrue(page.isEstadoCodigoColumnPresent());
    }

    @Then("la columna \"Estado Código\" debería mostrarse vacía pero correctamente posicionada")
    public void la_columna_Estado_Código_debería_mostrarse_vacía_pero_correctamente_posicionada() {
        assertTrue(page.isEstadoCodigoColumnCorrectlyEmptyAndPositioned());
    }
}