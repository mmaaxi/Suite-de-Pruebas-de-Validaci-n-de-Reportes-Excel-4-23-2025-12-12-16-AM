Feature: Validación de 'Monto acumulado Folio Reserva 5401'

  Scenario: Verificar la presencia y cálculo de la columna 'Monto acumulado Folio Reserva 5401'
    Given el usuario abre el documento de Excel con las reservas
    When el usuario verifica la presencia de la columna 'Monto acumulado Folio Reserva 5401'
    Then la columna aparece a la derecha de 'Monto (reserva)'
    When el usuario aplica la fórmula de acumulación en diferentes filas
    Then el valor de la columna se calcula correctamente en cada fila