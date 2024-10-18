#language: es
#Codigo EFCMB: EFCMB-100

@testfeature
Característica: Ver el detalle de un rol.
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero ver el detalle de un rol.

  #Detalle de roles
  @verDetalleRol
  Esquema del escenario: Ver detalle de un rol
    Dado que me encuentro en la pagina de inicio de EFC
    Y valido el título de bienvenida "¡Te damos la bienvenida!"
    Y hago click en el botón Inicar sesión con Microsoft.
    Y valido el título de "¿No puede acceder a su cuenta?"
    Entonces ingreso el correo electrónico del usuario "<usuario>" y la contraseña "<contraseña>".
    Y valido mensaje "¿Quiere mantener la sesión iniciada?"
    Entonces hago click si
    Y valido que me encuentro en "Configuración".
    Y hago click en roles.
    Y hago click en el rol "<rol>".
    Y veo los permisos asignados.

    Ejemplos:
      | usuario                    | contraseña | rol   |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 | ADMIN |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 | LECTURA |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 | GESTOR |
