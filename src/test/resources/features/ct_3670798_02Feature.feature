Feature: Validación de Columnas de IVA

  Scenario: Verificar la presencia de las nuevas columnas de IVA
    Given el archivo Excel está abierto
    When verifico la presencia de las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido'
    Then las columnas están presentes y en el orden especificado

  Scenario: Simular registros con diferentes tasas de IVA
    Given hay registros en el archivo Excel
    When simulo registros con diferentes tasas de IVA
    Then cada columna muestra los montos correspondientes a la tasa indicada

  Scenario: Verificar que no se mezclen datos entre columnas de diferentes tasas
    Given existen múltiples tasas de IVA en el archivo Excel
    When verifico la asignación de datos a cada columna
    Then cada tipo de IVA se asigna a su columna correcta