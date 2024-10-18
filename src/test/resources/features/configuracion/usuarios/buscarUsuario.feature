#language: es
#Codigo EFCMB: EFCMB-104

@testfeature
Característica: Buscar usuarios.
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero poder buscar un usuario.

  #Buscar usuarios
  @buscarUsuarios
  Esquema del escenario: Buscar usuarios
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
    Y hago click en filtros.
    Entonces ingreso los campos para filtrar el usuario
      | nombres   | apellidos | email               | estado |
      | Alejandra | Merchor   | amerchor@efc.com.pe | Activo |
    Y hago click en aplicar filtros

    Ejemplos:
      | usuario                    | contraseña |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 |