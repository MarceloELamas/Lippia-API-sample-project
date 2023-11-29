Feature: Update time entry

  Scenario Outline: Actualizar campos de un registro de hora
    Given una cuenta creada en clockify y x-api-key generado
    And un workspaceId '<workSpaceId>' y timeId '<timeId>'
    And una descripcion '<description>', fecha hora de entrada '<start>' y salida '<end>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then obtengo la descripcion de mi hora actualizada

    Examples:
      | operation | entity         | jsonName        | statusCode | workSpaceId              | timeId                   | description             | start                | end                  |
      | PUT       | UPDATETIMEUSER | updateTimeEntry | 200        | 65386fe31a76042b2285bf81 | 656735fdf8bf2b116111cc8e | Update Horas Trabajadas | 2023-11-24T19:30:00Z | 2023-11-24T23:00:00Z |
