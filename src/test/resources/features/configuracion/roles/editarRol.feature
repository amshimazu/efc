#language: es
#Codigo EFCMB: EFCMB-101

@testfeature
Característica: Editar un rol.
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero editar un rol.

  #Editar roles
  @editarRol
  Esquema del escenario: Editar un rol
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
    Y hago click en editar
    Y ingreso la información del rol.
      | nombreRol | estado | descripcionRol                   | grupoAsociado |
      |           | Activo | Esto es una Automatizacion test1 |               |
    Y agrego los permisos para el rol
    Entonces hago click en el boton guardar
    Y valido toast con mensaje: "Cambios guardados con éxito."


    Ejemplos:
      | usuario                    | contraseña | rol     |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 | LECTURA  |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 | LECTURA |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 | GESTOR  |