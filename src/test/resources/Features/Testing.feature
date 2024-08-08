@Demo-auto
  Feature: Test Desafio tecnico
    Scenario Outline: Registro de reserva
      Given Ingresamos a la URL del <ambiente>
      Then Seleccionamos ubicacion <destino>
      And Seleccionamos campo fecha
      And Seleccionamos boton buscar
      When Seleccionamos precio

  Examples:
    | ambiente | destino |
    | PRD      | Cusco   |