Feature: Validación de Inclusión y Ajuste de Columnas de Status de Pago

  Scenario: Validar posiciones y nombres de columnas relacionados al Status de Pago
    Given el usuario está en la hoja de pagos
    When verifica la posición de la columna 'Status Pago Código' a la derecha de 'Fecha de Pago'
    Then la columna 'Status Pago Código' aparece en la posición correct
    When renombre la columna 'Status de Pago' a 'Descripción Status Pago'
    Then el encabezado de la columna es actualizado correctamente
    When revisa valores de ambas columnas
    Then ambas columnas están inicialmente sin valores asignados