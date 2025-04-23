package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ct_3670798_01Page;

public class ct_3670798_01Steps {
    ct_3670798_01Page reportPage = new ct_3670798_01Page();

    @Given("el usuario inicia sesión y navega al módulo 'Canned Reports' -> Module Claim -> Report Code -> Claim Accounting Report")
    public void elUsuarioIniciaSesionYNavegaAlModulo() {
        Assert.assertTrue(reportPage.loginAndNavigateToReport());
    }

    @When("el usuario ejecuta la acción de 'Submit' y 'View Log' para generar el reporte")
    public void elUsuarioEjecutaSubmitYViewLog() {
        Assert.assertTrue(reportPage.submitAndGenerateReport());
    }

    @Then("el sistema procesa la solicitud para generar el archivo Excel")
    public void elSistemaProcesaLaSolicitud() {
        Assert.assertTrue(reportPage.isReportProcessing());
    }

    @When("el usuario descarga el archivo Excel y lo abre")
    public void elUsuarioDescargaYAbreElArchivoExcel() {
        Assert.assertTrue(reportPage.downloadAndOpenExcelFile());
    }

    @Then("el archivo Excel se descarga correctamente")
    public void elArchivoExcelSeDescargaCorrectamente() {
        Assert.assertTrue(reportPage.isExcelDownloaded());
    }

    @When("el usuario localiza la columna C y evalúa la fórmula de concatenación")
    public void elUsuarioLocalizaColumnaCEvaluaFormula() {
        Assert.assertTrue(reportPage.evaluateConcatenationFormula());
    }

    @Then("la columna C muestra correctamente la concatenación con los separadores '_' en todas las filas")
    public void laColumnaCMuestraConcatenacion() {
        Assert.assertTrue(reportPage.isConcatenationCorrect());
    }

    @When("el usuario realiza pruebas con datos nulos o en blanco en alguna de las columnas referenciadas")
    public void elUsuarioRealizaPruebasConDatosNulosOEnBlanco() {
        Assert.assertTrue(reportPage.testWithNullOrBlankData());
    }

    @Then("el sistema maneja adecuadamente los valores nulos, sin producir errores de fórmula")
    public void elSistemaManejaValoresNulos() {
        Assert.assertTrue(reportPage.isHandlingNullValuesProperly());
    }
}