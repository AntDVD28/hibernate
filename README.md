# hibernate
Mapeo Objeto-Relacional

Trabajo correspondiente a la asignatura AD (Acceso a Datos) perteneciente a la titulación de Técnico Superior en el Desarrollo de aplicaciones multiplataformas.

Utilizaremos la BD MySQL Sakila. La instalación de Sakila se hace como un plugin en Netbeans.
Para su instalación desde NetBeans iremos al menú “Herramientas” -> “Plugins” -> “Plugins disponibles” seleccionaremos “Sakila Sample Database” y clic en el botón “Instalar”.

Sakila es una Base de Datos para MySQL por lo que necesitamos un SGBD que la soporte. Voy a utilizar el paquete de software XAMPP el cual integra un SGBD para MySQL. Asegurarnos que el servicio de MySQL queda iniciado.

Desde Netbeans, pestaña "Prestaciones" veremos que tenemos acceso al SGBD con todas las bases de datos existentes contenidas en el mismo.
Crearemos a continuación la Base de Datos de Sakila, para ello clic con el botón derecho del ratón sobre el Servidor de MySQL y “Crear Base de Datos”  y seleccionaremos “Base de datos de muestra: sakila”, copiéndose en nuestro SGBD la base de datos.

Para conectarnos a ella, clic con el botón derecho del ratón sobre la base de datos y seleccionaremos “Conectar”. Esto creará la cadena de conexión, pudiendo desplegarla y acceder a su contenido.

La versión que utilicé del JDK es la 1.8
