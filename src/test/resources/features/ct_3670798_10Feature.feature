Feature: Modificación de la Fórmula de la Columna 'IVA Acumulado'

  Scenario: Verificar fórmula de 'IVA Acumulado'
    Given estoy en el archivo Excel con la columna 'IVA Acumulado'
    When reviso la fórmula de 'IVA Acumulado'
    Then la fórmula actual suma IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO correctamente

  Scenario: Verificar acumulación de IVAs
    Given estoy en el archivo Excel con datos con diferentes tasas de IVA
    When ingreso combinaciones de datos con diferentes tasas de IVA (excluyendo IVA retenido)
    Then la suma resultante refleja correctamente la acumulación de los IVAs especificados
    
  Scenario: Manejo de errores con valores límite y datos nulos
    Given estoy en el archivo Excel con valores límite y datos nulos
    When realizo pruebas con valores límite y datos nulos
    Then la fórmula maneja adecuadamente los datos faltantes sin generar errores