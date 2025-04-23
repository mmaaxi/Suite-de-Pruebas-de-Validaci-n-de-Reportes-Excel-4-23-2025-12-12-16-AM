package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ct_3670798_05Page;

public class ct_3670798_05Steps {
    
    ct_3670798_05Page excelPage;

    @Given("el usuario abre el documento de Excel con las reservas")
    public void usuarioAbreDocumentoExcel() {
        excelPage = new ct_3670798_05Page();
        excelPage.openExcelDocument();
    }

    @When("el usuario verifica la presencia de la columna 'Monto acumulado Folio Reserva 5401'")
    public void usuarioVerificaPresenciaColumna() {
        excelPage.verifyPresenceOfAccumulatedAmountColumn();
    }

    @Then("la columna aparece a la derecha de 'Monto (reserva)'")
    public void columnaApareceALaDerecha() {
        Assert.assertTrue(excelPage.isColumnInCorrectPosition());
    }

    @When("el usuario aplica la fórmula de acumulación en diferentes filas")
    public void usuarioAplicaFormulaDeAcumulacion() {
        excelPage.applyAccumulationFormula();
    }

    @Then("el valor de la columna se calcula correctamente en cada fila")
    public void valorDeColumnaCalculaCorrectamente() {
        Assert.assertTrue(excelPage.verifyAccumulationValues());
    }
}