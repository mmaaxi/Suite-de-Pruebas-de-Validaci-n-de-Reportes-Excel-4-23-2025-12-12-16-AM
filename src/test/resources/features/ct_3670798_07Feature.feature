Feature: Validación de la Fórmula Actualizada del 'Monto Acumulado Folio OPC 2121' en Movimientos de Pago

  Scenario: Verificar fórmula y cálculo en Movimientos de Pago
    Given Estoy en la sección de Movimientos de Pago del Excel
    When Reviso la fórmula actualizada que debería ser "=Z4+AD5+AE5+AH5+AC5+AB5+AM5"
    Then La fórmula está presente y correcta

    When Ingreso valores en las celdas Z4, AD5, AE5, AH5, AC5, AB5 y AM5
    Then La suma se calcula correctamente considerando solo los campos indicados

    When Verifico que valores no relacionados no se incluyan en la suma
    Then El resultado refleja únicamente los campos correctos