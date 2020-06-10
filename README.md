# hibernate
Mapeo Objeto-Relacional

Trabajo correspondiente a la asignatura AD (Acceso a Datos) perteneciente a la titulación de Técnico Superior en el Desarrollo de aplicaciones multiplataformas.

La versión que utilicé del JDK es la 1.8

Instalación / Configuración de Sakila
=====================================

Utilizaremos la BD MySQL Sakila. La instalación de Sakila se hace como un plugin en Netbeans.
Para su instalación desde NetBeans iremos al menú “Herramientas” -> “Plugins” -> “Plugins disponibles” seleccionaremos “Sakila Sample Database” y clic en el botón “Instalar”.

Sakila es una Base de Datos para MySQL por lo que necesitamos un SGBD que la soporte. Voy a utilizar el paquete de software XAMPP el cual integra un SGBD para MySQL. Asegurarnos que el servicio de MySQL queda iniciado.

Desde Netbeans, pestaña "Prestaciones" veremos que tenemos acceso al SGBD con todas las bases de datos existentes contenidas en el mismo.
Crearemos a continuación la Base de Datos de Sakila, para ello clic con el botón derecho del ratón sobre el Servidor de MySQL y “Crear Base de Datos”  y seleccionaremos “Base de datos de muestra: sakila”, copiéndose en nuestro SGBD la base de datos.

Para conectarnos a ella, clic con el botón derecho del ratón sobre la base de datos y seleccionaremos “Conectar”. Esto creará la cadena de conexión, pudiendo desplegarla y acceder a su contenido.


Instalación / Configuración de Hibernate
========================================

Hibernate se instaló automáticamente durante la instalación del IDE de Netbeans 8.2, dentro del módulo JAVA SE podremos encontrarlo. Si no viniese podríamos instalarlo como un plugin. 

Netbeans nos incluye asistentes mediante los cuales podremos crear los archivos de configuración de Hibernate.

hibernate.cfg.xml

Este archivo contiene información sobre la conexión de la base de datos, recursos de mapeo y otras propiedades de conexión.

Para su creación haremos clic con el botón derecho del ratón sobre el nodo “Paquete de fuentes” que cuelga de nuestro proyecto y seleccionaremos “Nuevo”->”Otro”, abriéndose el asistente para crear un nuevo fichero. Seleccionaremos la categoría “Hibernar” y en tipo de archivo “Asistente de configuración de Hibernate”.

El Nombre y Ubicación que nos aparecen en la siguiente ventana podemos dejarlo por defecto y haremos clic en “Siguiente”.

En la siguiente ventana seleccionaremos la base de datos Sakila en la Conexión con la base de datos y clic en “Terminar”.

Observaremos que Netbeans creó automáticamente en nuestro proyecto el archivo de configuración y agregó todas las librerías de Hibernate necesarias además del fichero JAR para conectarnos a MySQL.

Ahora deberemos de indicar en el archivo hibérnate.cfg.xml una serie de propiedades para poder efectuar consultas contra la base de datos. Trabajaremos con la vista Diseño pues nos facilita más la labor.

Expandiremos el nodo “Propiedades de configuración” y agregamos “hibernate.show_sql” con el valor true. Con esto estaremos habilitando la depuración de consultas SQL.

En el nodo “Propiedades Varias” y agregamos “hibérnate.query.factory_class” con el valor “org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory”

Una vez modificadas estas dos propiedades guardaremos los cambios (Ctrl+Mayús+S).

