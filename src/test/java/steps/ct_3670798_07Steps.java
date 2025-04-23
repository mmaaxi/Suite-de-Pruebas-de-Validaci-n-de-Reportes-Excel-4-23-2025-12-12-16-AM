package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ct_3670798_07Page;

public class ct_3670798_07Steps {

    ct_3670798_07Page movimientosDePagoPage = new ct_3670798_07Page();

    @Given("Estoy en la sección de Movimientos de Pago del Excel")
    public void estoy_en_seccion_movimientos_pago_excel() {
        movimientosDePagoPage.openMovimientosDePagoSection();
    }

    @When("Reviso la fórmula actualizada que debería ser {string}")
    public void reviso_formula_actualizada(String expectedFormula) {
        String actualFormula = movimientosDePagoPage.getFormula();
        Assert.assertEquals(expectedFormula, actualFormula);
    }

    @When("Ingreso valores en las celdas Z4, AD5, AE5, AH5, AC5, AB5 y AM5")
    public void ingreso_valores_en_celdas() {
        movimientosDePagoPage.fillReferencedCellsWithValues();
    }

    @Then("La suma se calcula correctamente considerando solo los campos indicados")
    public void suma_se_calcula_correctamente() {
        Assert.assertTrue(movimientosDePagoPage.isSumCalculatedCorrectly());
    }
    
    @When("Verifico que valores no relacionados no se incluyan en la suma")
    public void verifico_valores_no_relacionados_no_incluidos() {
        Assert.assertTrue(movimientosDePagoPage.verifyExclusionOfUnrelatedValues());
    }

    @Then("El resultado refleja únicamente los campos correctos")
    public void resultado_refleja_campos_correctos() {
        Assert.assertTrue(movimientosDePagoPage.isResultAccurate());
    }
}