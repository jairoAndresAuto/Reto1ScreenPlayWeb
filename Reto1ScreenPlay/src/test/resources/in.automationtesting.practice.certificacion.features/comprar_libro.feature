#Languaje:En
  ## Jairo Andres Garcia - jairo_garcia82122@elpoli.edu.co

  Feature: Yo como usuario
    Debe de crear un escenario para validar la funcionalidad de comprar libro
    Para validar que este funcionando de forma correcta

  Scenario:Comprar libro
    Given que me encuentro en la pagina automationtesting con opción Shop
    When se procede a ingresar a comprar el libro e ingresar la cantidad
    |nombre_libro|opcionMenuCarrito|cantidad|
    | Android    |      1 item     |   2    |
    And se debe llenar el formulario de datos personales
    |nombre|apellido|         correo       | telefono |     direccion     |ciudad|estado|
    |Jairo | Garcia |Jairo@hotmail.com     |3004368887|  Carrera 80       | Medellin     |  1    |
    Then Verifico que la cantidad y el precio total.
    |valor_pagar|cantidad|
    |945.00|2|