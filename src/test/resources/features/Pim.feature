#Proyecto de pruebas y cargado en Github
#23/07/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Pim
	@Addemploe 
	@Sprint2
  Scenario Outline: Add Employee
    Given abrir el navegador
    And diligenciar usuario <userName> y password <pass>
    And llegar a la opcion agregar empleado

    Examples: 
      | userName | pass     |firsName| lastName|
      | Admin    | admin123 |Jhonatan| medina|
      

