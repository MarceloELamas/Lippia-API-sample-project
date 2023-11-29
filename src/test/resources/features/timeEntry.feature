@timeEntry
Feature: Time Entry
  @Test
  Scenario Outline: Obtener horas de Workspace y User
    Given una cuenta creada en clockify y x-api-key generado
    And un workspaceId '<workSpaceId>' y un id '<userId>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then obtengo los datos de mi proyecto


    Examples:
      | operation | entity   | jsonName     | statusCode | workSpaceId              | userId                   |
      | GET       | TIMEUSER | timeEntryGet | 200        | 65386fe31a76042b2285bf81 | 653843b0205d0441c5275e74 |