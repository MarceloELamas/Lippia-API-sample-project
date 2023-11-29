@addTimeEntry
Feature: Add Time Entry

  Scenario Outline: Agregar horas a un proyecto
    Given una cuenta creada en clockify y x-api-key generado
    And un workspaceId '<workSpaceId>' y proyectId '<proyectId>'
    And una descripcion '<description>', fecha hora de entrada '<start>' y salida '<end>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then obtengo la descripcion de mi hora cargada

    Examples:
      | operation | entity      | jsonName     | statusCode | workSpaceId              | proyectId                | description      | start                | end                  |
      | POST      | ADDTIMEUSER | addTimeEntry | 201        | 65386fe31a76042b2285bf81 | 654055fe894cb47eadfcfb14 | Horas Trabajadas | 2023-11-24T15:00:00Z | 2023-11-24T16:00:00Z |