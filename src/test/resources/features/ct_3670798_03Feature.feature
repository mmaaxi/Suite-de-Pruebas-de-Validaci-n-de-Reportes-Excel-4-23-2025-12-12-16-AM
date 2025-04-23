Feature: Validación de la Nueva Columna "Estado Código"

  Scenario: Exportar el Excel con la columna 'Estado Código'
    Given el usuario ha exportado el Excel
    When el archivo es abierto
    Then debería ver la columna "Estado Código" inmediatamente a la derecha de la columna I

  Scenario: Verificar que la columna "Estado Código" se muestra correctamente
    Given el Excel contiene la columna 'Estado Código'
    When el archivo es abierto
    Then la columna "Estado Código" debería mostrarse vacía pero correctamente posicionada