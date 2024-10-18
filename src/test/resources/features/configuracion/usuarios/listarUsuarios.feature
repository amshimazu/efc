#language: es
#Codigo EFCMB: EFCMB-103

@testfeature
Característica: Listar usuarios.
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero poder listar todos los usuarios.

  #Listar usuarios
  @listarUsuarios
  Esquema del escenario: Listar usuarios
    Dado que me encuentro en la pagina de inicio de EFC
    Y valido el título de bienvenida "¡Te damos la bienvenida!"
    Y hago click en el botón Inicar sesión con Microsoft.
    Y valido el título de "¿No puede acceder a su cuenta?"
    Entonces ingreso el correo electrónico del usuario "<usuario>" y la contraseña "<contraseña>".
    Y valido mensaje "¿Quiere mantener la sesión iniciada?"
    Entonces hago click si
    Y valido que me encuentro en "Configuración".
    Dado que hago click en usuarios.
    Y valido que me encuentre en la lista de usuarios "Lista de usuarios".

    Ejemplos:
      | usuario                    | contraseña |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 |