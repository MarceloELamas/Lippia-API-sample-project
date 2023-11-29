Feature: Delete time entry

  Scenario Outline: Eliminar una hora registrada por Workspace
    Given una cuenta creada en clockify y x-api-key generado
    And un workspaceId '<workSpaceId>' y proyectId '<proyectId>'
    And una descripcion 'Horas Trabajadas', fecha hora de entrada '2023-11-27T15:00:00Z' y salida '2023-11-24T16:00:00Z'
    And I perform a 'POST' to 'ADDTIMEUSER' endpoint with the 'addTimeEntry' and ''
    And status code 201 is obtained
    And obtengo un id timeEntry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code 204 is obtained

    Examples:
      | workSpaceId              | proyectId                | operation | entity         | jsonName        |
      | 65386fe31a76042b2285bf81 | 654055fe894cb47eadfcfb14 | DELETE    | DELETETIMEUSER | deleteTimeEntry |

