package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.ct_3670798_06Page;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ct_3670798_06Steps {

    WebDriver driver;
    ct_3670798_06Page page;

    @Given("el usuario está en la página de reporte")
    public void elUsuarioEstaEnLaPaginaDeReporte() {
        driver = // Initialize WebDriver
        page = new ct_3670798_06Page(driver);
        page.navigateToReportPage();
    }

    @When("el usuario revisa el encabezado de la columna originalmente llamada 'Monto Acumulado Folio OPC'")
    public void elUsuarioRevisaElEncabezadoDeLaColumna() {
        // Already implemented in page.getHeader()
    }

    @Then("el encabezado se actualiza a 'Monto Acumulado Folio OPC \\(2121\\)' exactamente")
    public void elEncabezadoSeActualiza() {
        String actualHeader = page.getHeader();
        assertEquals("Monto Acumulado Folio OPC (2121)", actualHeader);
    }

    @And("la funcionalidad de cálculo permanece intacta")
    public void laFuncionalidadDeCalculoPermaneceIntacta() {
        boolean isFormulaIntact = page.isFormulaIntact();
        assertTrue(isFormulaIntact);
    }
}