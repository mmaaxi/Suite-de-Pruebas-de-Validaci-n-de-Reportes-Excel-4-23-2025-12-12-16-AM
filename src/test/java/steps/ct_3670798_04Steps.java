package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ct_3670798_04Page;

import static org.junit.Assert.assertTrue;

public class ct_3670798_04Steps {

    WebDriver driver;
    ct_3670798_04Page page;

    public ct_3670798_04Steps() {
        // Assumes driver is set up elsewhere, e.g., in a hooks class
        this.page = PageFactory.initElements(driver, ct_3670798_04Page.class);
    }

    @Given("que estoy en la página de exportación de Excel")
    public void estoyEnLaPaginaDeExportacionExcel() {
        page.navigateToExportPage();
    }

    @When("comparo los datos de la columna 'estado' antes y después de la exportación")
    public void comparoDatosColumnaEstado() {
        page.captureEstadoDataBeforeExport();
        page.exportExcelFile();
        page.captureEstadoDataAfterExport();
    }

    @Then("los datos de la columna 'estado' deben actualizarse conforme a las modificaciones requeridas")
    public void validarActualizacionColumnaEstado() {
        assertTrue(page.isEstadoUpdatedCorrectly());
    }

    @Given("que estoy en la página de validación de exportación de Excel")
    public void estoyEnLaPaginaDeValidacionExportacionExcel() {
        page.navigateToValidationPage();
    }

    @When("reviso la consistencia y exactitud de las modificaciones aplicadas")
    public void revisarConsistenciaExactitud() {
        page.verifyConsistencyAndAccuracy();
    }

    @Then("la actualización debe ser correcta y sin inconsistencias")
    public void validarConsistenciaSinInconsistencias() {
        assertTrue(page.isUpdateConsistentAndAccurate());
    }
}