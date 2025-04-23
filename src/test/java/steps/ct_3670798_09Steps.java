package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.ct_3670798_09Page;

public class ct_3670798_09Steps {
    WebDriver driver;
    ct_3670798_09Page page;

    public ct_3670798_09Steps() {
        this.driver = Hooks.getDriver();
        page = new ct_3670798_09Page(driver);
    }

    @Given("el usuario está en la hoja de pagos")
    public void el_usuario_esta_en_la_hoja_de_pagos() {
        page.navigateToHojaDePagos();
    }

    @When("verifica la posición de la columna 'Status Pago Código' a la derecha de 'Fecha de Pago'")
    public void verifica_la_posicion_de_la_columna_status_pago_codigo() {
        page.checkPositionOfStatusPagoCodigoColumn();
    }

    @Then("la columna 'Status Pago Código' aparece en la posición correcta")
    public void la_columna_status_pago_codigo_aparece_en_la_position_correcta() {
        assert(page.isStatusPagoCodigoInCorrectPosition());
    }

    @When("renombre la columna 'Status de Pago' a 'Descripción Status Pago'")
    public void renombre_la_columna_status_de_pago() {
        page.renameStatusDePagoColumn();
    }

    @Then("el encabezado de la columna es actualizado correctamente")
    public void el_encabezado_de_la_columna_es_actualizado_correctamente() {
        assert(page.isColumnRenamedCorrectly());
    }

    @When("revisa valores de ambas columnas")
    public void revisa_valores_de_ambas_columnas() {
        page.checkInitialValuesOfColumns();
    }

    @Then("ambas columnas están inicialmente sin valores asignados")
    public void ambas_columnas_estan_inicialmente_sin_valores_asignados() {
        assert(page.areColumnsEmptyInitially());
    }
}