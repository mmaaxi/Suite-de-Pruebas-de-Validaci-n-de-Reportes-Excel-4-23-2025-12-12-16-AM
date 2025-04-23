Feature: Validación de la Inclusión de Columnas 'Folio Pre solicitud' y 'Folio de Pago'

  Scenario: Verificar las posiciones y valores de las columnas 'Folio Pre solicitud' y 'Folio de Pago' en el Excel exportado
    Given el usuario ha exportado el archivo Excel
    When el usuario ubica la columna 'Folio Pre solicitud' a la derecha de la columna 'Ramo'
    Then la columna 'Folio Pre solicitud' aparece en la posición indicada
    When el usuario verifica la columna 'Folio de Pago' a la derecha de la columna 'Folio Pre solicitud'
    Then la columna 'Folio de Pago' aparece en la posición correcta
    And ambas columnas se muestran vacías conforme al alcance actual