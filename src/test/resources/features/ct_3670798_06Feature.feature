Feature: Renombramiento de la Columna 'Monto Acumulado Folio OPC (2121)'

  Scenario: Verificar el renombramiento de columna y la integridad de la fórmula
    Given el usuario está en la página de reporte
    When el usuario revisa el encabezado de la columna originalmente llamada 'Monto Acumulado Folio OPC'
    Then el encabezado se actualiza a 'Monto Acumulado Folio OPC (2121)' exactamente
    And la funcionalidad de cálculo permanece intacta