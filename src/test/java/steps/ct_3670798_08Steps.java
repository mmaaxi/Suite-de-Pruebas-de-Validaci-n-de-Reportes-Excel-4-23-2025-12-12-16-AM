package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ct_3670798_08Page;

public class ct_3670798_08Steps {
    WebDriver driver;
    ct_3670798_08Page page = new ct_3670798_08Page(driver);
    
    @Given("el usuario ha exportado el archivo Excel")
    public void el_usuario_ha_exportado_el_archivo_Excel() {
        // Implementación para la descarga y apertura del archivo Excel
    }

    @When("el usuario ubica la columna 'Folio Pre solicitud' a la derecha de la columna 'Ramo'")
    public void el_usuario_ubica_la_columna_Folio_Pre_solicitud() {
        page.locatePreRequestColumn();
    }

    @Then("la columna 'Folio Pre solicitud' aparece en la posición indicada")
    public void la_columna_Folio_Pre_solicitud_aparece_en_la_posicion_indicada() {
        page.verifyPreRequestColumnPosition();
    }

    @When("el usuario verifica la columna 'Folio de Pago' a la derecha de la columna 'Folio Pre solicitud'")
    public void el_usuario_verifica_la_columna_Folio_de_Pago() {
        page.locatePaymentFolioColumn();
    }

    @Then("la columna 'Folio de Pago' aparece en la posición correcta")
    public void la_columna_Folio_de_Pago_aparece_en_la_posicion_correcta() {
        page.verifyPaymentFolioColumnPosition();
    }

    @Then("ambas columnas se muestran vacías conforme al alcance actual")
    public void ambas_columnas_se_muestran_vacias_conforme_al_alcance_actual() {
        page.verifyColumnsAreEmpty();
    }
}