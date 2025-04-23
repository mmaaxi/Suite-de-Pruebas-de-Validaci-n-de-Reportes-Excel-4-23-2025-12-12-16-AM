Feature: Exportación y Validación de la Llave (Columna C)

  Scenario: Validar concatenación en columna C de informe exportado
    Given el usuario inicia sesión y navega al módulo 'Canned Reports' -> Module Claim -> Report Code -> Claim Accounting Report
    When el usuario ejecuta la acción de 'Submit' y 'View Log' para generar el reporte
    Then el sistema procesa la solicitud para generar el archivo Excel
    When el usuario descarga el archivo Excel y lo abre
    Then el archivo Excel se descarga correctamente
    When el usuario localiza la columna C y evalúa la fórmula de concatenación
    Then la columna C muestra correctamente la concatenación con los separadores '_' en todas las filas
    When el usuario realiza pruebas con datos nulos o en blanco en alguna de las columnas referenciadas
    Then el sistema maneja adecuadamente los valores nulos, sin producir errores de fórmula