Feature: Validación de la Actualización de la Columna 'estado'

  Scenario: Verificar que la columna 'estado' se actualiza correctamente después de la exportación del Excel
    Given que estoy en la página de exportación de Excel
    When comparo los datos de la columna 'estado' antes y después de la exportación
    Then los datos de la columna 'estado' deben actualizarse conforme a las modificaciones requeridas

  Scenario: Verificar consistencia y exactitud de las modificaciones aplicadas a la columna 'estado'
    Given que estoy en la página de validación de exportación de Excel
    When reviso la consistencia y exactitud de las modificaciones aplicadas
    Then la actualización debe ser correcta y sin inconsistencias