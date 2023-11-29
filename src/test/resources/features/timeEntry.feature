@timeEntry
Feature: Time Entry

  Scenario Outline: Obtener horas de Workspace y User
    Given una cuenta creada en clockify y x-api-key '<token>' generado
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then obtengo los datos de mi proyecto

    Examples:
      | operation | entity    | jsonName      | statusCode | token |
      | GET       | TIME_USER | allTimesEntry | 200        |       |