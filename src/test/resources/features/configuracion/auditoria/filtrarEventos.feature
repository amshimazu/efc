#language: es
#Codigo EFCMB: EFCMB-107

@testfeature
Característica: filtrar eventos registrados
  Yo, como usuario al encontrarme logeado en la pagina de EFC quiero poder filtrar los eventos registrados.

  #Filtrar eventos registrados.
  @filtrarEvento
  Esquema del escenario: Listar y ver el detalle de los eventos registrados.
    Dado que me encuentro en la pagina de inicio de EFC
    Y valido el título de bienvenida "¡Te damos la bienvenida!"
    Y hago click en el botón Inicar sesión con Microsoft.
    Y valido el título de "¿No puede acceder a su cuenta?"
    Entonces ingreso el correo electrónico del usuario "<usuario>" y la contraseña "<contraseña>".
    Y valido mensaje "¿Quiere mantener la sesión iniciada?"
    Entonces hago click si
    Y valido que me encuentro en "Configuración".
    Y hago click en auditoria.
    Y hago click en filtros.
    Entonces selecciono los filtros para eventos.
      | tipoEvento | entidad | idEntidad | usuarioEvento            | fechaInicioEvento | fechaFinEvento |
      | Creación   |         |           | Usuario de prueba 1 - IP |                   |                |
     #| #Edición   |         | 16,17,18,19 | cbarahona              |                   |                |
    #Y hago click en aplicar filtros

    Ejemplos:
      | usuario                    | contraseña | rol   |
      | IP_usuario1@ext.efc.com.pe | Hayuk46911 | ADMIN |
      #| IP_usuario2@ext.efc.com.pe | Hayuk46921 | LECTURA |
      #| IP_usuario3@ext.efc.com.pe | Hayuk46931 | GESTOR |
