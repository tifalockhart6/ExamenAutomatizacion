# language: es
# encoding: iso-8859-1
Característica: Busqueda de Empleo
  Como usuario de El Empleo
  deseo poder buscar un trabajo como contador
  para evitar aplicar a una oferta de empleo

  Esquema del escenario: Busqueda Empleo Contador
    Dado que estoy en la pagina de inicio de El Empleo
    Cuando ingreso los datos de cargo, profesion o empresa <cargo> y <ciudad>
    Entonces puedo realizar la busqueda de trabajo

    Ejemplos: 
      | cargo    | ciudad |
      | Contador | Bogotá |
