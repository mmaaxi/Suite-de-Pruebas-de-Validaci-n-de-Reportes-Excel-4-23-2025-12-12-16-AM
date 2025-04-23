package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ct_3670798_10Page;

public class ct_3670798_10Steps {
    private ct_3670798_10Page page;

    @Given("estoy en el archivo Excel con la columna 'IVA Acumulado'")
    public void estoyEnElArchivoExcelConLaColumnaIVA_Acumulado() {
        page = new ct_3670798_10Page();
        page.openExcelFile();
    }

    @When("reviso la fórmula de 'IVA Acumulado'")
    public void revisoLaFormulaDeIVA_Acumulado() {
        page.verifyIVAFormula();
    }

    @Then("la fórmula actual suma IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO correctamente")
    public void laFormulaSumaCorrectamente() {
        Assert.assertTrue(page.isFormulaCorrect());
    }

    @Given("estoy en el archivo Excel con datos con diferentes tasas de IVA")
    public void estoyEnElArchivoConDatosDiferentesTasasIVA() {
        page = new ct_3670798_10Page();
        page.openExcelWithIVAData();
    }

    @When("ingreso combinaciones de datos con diferentes tasas de IVA \\(excluyendo IVA retenido)")
    public void ingresoCombinacionesDeDatos() {
        page.inputDifferentIVATaxesData();
    }

    @Then("la suma resultante refleja correctamente la acumulación de los IVAs especificados")
    public void laSumaReflejaCorrectamente() {
        Assert.assertTrue(page.isIVASumCorrect());
    }

    @Given("estoy en el archivo Excel con valores límite y datos nulos")
    public void estoyEnElArchivoConValoresLimite() {
        page = new ct_3670798_10Page();
        page.openExcelWithLimitAndNullValues();
    }

    @When("realizo pruebas con valores límite y datos nulos")
    public void realizoPruebasConValoresLimiteYNulos() {
        page.testBoundaryAndNullValues();
    }

    @Then("la fórmula maneja adecuadamente los datos faltantes sin generar errores")
    public void laFormulaManejaAdecuadamente() {
        Assert.assertTrue(page.handlesMissingData());
    }
}