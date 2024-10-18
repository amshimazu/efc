#language: es
#Codigo EFCMB: EFCMB-105

@testfeature
Característica: Crear un nuevo rol.
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero crear un nuevo rol.

  #Crear rol.
  @crearRol
  Esquema del escenario: Crear nuevo rol.
    Dado que me encuentro en la pagina de inicio de EFC
    Y valido el título de bienvenida "¡Te damos la bienvenida!"
    Y hago click en el botón Inicar sesión con Microsoft.
    Y valido el título de "¿No puede acceder a su cuenta?"
    Entonces ingreso el correo electrónico del usuario "<usuario>" y la contraseña "<contraseña>".
    Y valido mensaje "¿Quiere mantener la sesión iniciada?"
    Entonces hago click si
    Y valido que me encuentro en "Configuración".
    Y hago click en roles.
    Entonces hago click en crear nuevo rol.
    Y ingreso la información del rol.
      | nombreRol | estado | descripcionRol               | grupoAsociado |
      | LECTURA   | Activo | Este es el nuevo rol lectura | IP_Lectura    |
    Y agrego los permisos para el rol
    Cuando hago click en crear rol
    Y valido toast: "Rol creado con éxito."

    Ejemplos:
      | usuario                    | contraseña | rol   |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 | ADMIN |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 | LECTURA |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 | GESTOR |
