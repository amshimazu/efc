#language: es
#Codigo EFCMB: EFCMB-102

@testfeature
Característica: Filtrar roles.
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero filtrar los roles.

  #Filtrar roles
  @filtrarRoles
  Esquema del escenario: filtrar roles
    Dado que me encuentro en la pagina de inicio de EFC
    Y valido el título de bienvenida "¡Te damos la bienvenida!"
    Y hago click en el botón Inicar sesión con Microsoft.
    Y valido el título de "¿No puede acceder a su cuenta?"
    Entonces ingreso el correo electrónico del usuario "<usuario>" y la contraseña "<contraseña>".
    Y valido mensaje "¿Quiere mantener la sesión iniciada?"
    Entonces hago click si
    Y valido que me encuentro en "Configuración".
    Y hago click en roles.
    Y hago click en filtros.
    Entonces selecciono los campos a filtrar
      | nombreRol | bloquePermisos | estado |
      | LECTURA   |                | Activo |
    Y hago click en aplicar filtros

    Ejemplos:
      | usuario | contraseña |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 |