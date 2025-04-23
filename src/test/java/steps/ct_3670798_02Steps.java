package steps;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
import pages.ct_3670798_02Page;

public class ct_3670798_02Steps {
    ct_3670798_02Page ivaPage = new ct_3670798_02Page();

    @Given("el archivo Excel está abierto")
    public void el_archivo_excel_esta_abierto() {
        ivaPage.openExcelFile();
    }

    @When("verifico la presencia de las columnas {string}, {string} y {string}")
    public void verifico_la_presencia_de_las_columnas(String col1, String col2, String col3) {
        boolean columnsPresent = ivaPage.verifyColumnsPresence(col1, col2, col3);
        assertTrue(columnsPresent);
    }

    @Then("las columnas están presentes y en el orden especificado")
    public void las_columnas_estan_presentes_y_en_el_orden_especificado() {
        assertTrue(ivaPage.areColumnsInOrder());
    }

    @Given("hay registros en el archivo Excel")
    public void hay_registros_en_el_archivo_excel() {
        assertTrue(ivaPage.hasRecords());
    }

    @When("simulo registros con diferentes tasas de IVA")
    public void simulo_registros_con_diferentes_tasas_de_iva() {
        ivaPage.simulateIvaRates();
    }

    @Then("cada columna muestra los montos correspondientes a la tasa indicada")
    public void cada_columna_muestra_los_montos_correspondientes_a_la_tasa_indicada() {
        assertTrue(ivaPage.areAmountsCorrectlyDisplayed());
    }

    @Given("existen múltiples tasas de IVA en el archivo Excel")
    public void existen_multiples_tasas_de_iva_en_el_archivo_excel() {
        assertTrue(ivaPage.hasMultipleIvaRates());
    }

    @When("verifico la asignación de datos a cada columna")
    public void verifico_la_asignacion_de_datos_a_cada_columna() {
        ivaPage.checkDataAssignment();
    }

    @Then("cada tipo de IVA se asigna a su columna correcta")
    public void cada_tipo_de_iva_se_asigna_a_su_columna_correcta() {
        assertTrue(ivaPage.isIvaCorrectlyAssigned());
    }
}