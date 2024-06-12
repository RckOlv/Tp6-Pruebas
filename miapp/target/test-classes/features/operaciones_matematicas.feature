Feature: Operaciones matemáticas

  Scenario: Sumar dos números
    Given que tengo dos números {int} y {int}
    When los sumo
    Then el resultado de la suma es {int}

  Scenario: Multiplicar dos números
    Given que tengo dos números {int} y {int}
    When los multiplico
    Then el resultado de la multiplicación es {int}
