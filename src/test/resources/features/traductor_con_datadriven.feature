Feature:
  Como un usuario
  Quiero ingresar a google Translator
  A traducir palabras entre diferentes lenguajes

  @traducir
  Scenario: Traducir de Ingles a Español
    Given que Alejandra quiere usar el traductor de Google
    When ella traduce una palabra de ingles a español
    | origen | destino | palabra |
    | ingles | español | hello   |
    Then el deberia ver la palabra traducida del idioma origen a idioma destino
    | palabra_esp |
    | Hola|