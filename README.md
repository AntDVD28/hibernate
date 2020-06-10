# hibernate
Mapeo Objeto-Relacional

Trabajo correspondiente a la asignatura AD (Acceso a Datos) perteneciente a la titulación de Técnico Superior en el Desarrollo de aplicaciones multiplataformas.

La versión que utilicé del JDK es la 1.8

##Instalación / Configuración de Sakila
=====================================

Utilizaremos la BD MySQL Sakila. La instalación de Sakila se hace como un plugin en Netbeans.
Para su instalación desde NetBeans iremos al menú “Herramientas” -> “Plugins” -> “Plugins disponibles” seleccionaremos “Sakila Sample Database” y clic en el botón “Instalar”.

Sakila es una Base de Datos para MySQL por lo que necesitamos un SGBD que la soporte. Voy a utilizar el paquete de software XAMPP el cual integra un SGBD para MySQL. Asegurarnos que el servicio de MySQL queda iniciado.

Desde Netbeans, pestaña "Prestaciones" veremos que tenemos acceso al SGBD con todas las bases de datos existentes contenidas en el mismo.
Crearemos a continuación la Base de Datos de Sakila, para ello clic con el botón derecho del ratón sobre el Servidor de MySQL y “Crear Base de Datos”  y seleccionaremos “Base de datos de muestra: sakila”, copiéndose en nuestro SGBD la base de datos.

Para conectarnos a ella, clic con el botón derecho del ratón sobre la base de datos y seleccionaremos “Conectar”. Esto creará la cadena de conexión, pudiendo desplegarla y acceder a su contenido.


##Instalación / Configuración de Hibernate
========================================

Hibernate se instaló automáticamente durante la instalación del IDE de Netbeans 8.2, dentro del módulo JAVA SE podremos encontrarlo. Si no viniese podríamos instalarlo como un plugin. 

Netbeans nos incluye asistentes mediante los cuales podremos crear los archivos de configuración de Hibernate.

**hibernate.cfg.xml**

Este archivo contiene información sobre la conexión de la base de datos, recursos de mapeo y otras propiedades de conexión.

Para su creación haremos clic con el botón derecho del ratón sobre el nodo “Paquete de fuentes” que cuelga de nuestro proyecto y seleccionaremos “Nuevo”->”Otro”, abriéndose el asistente para crear un nuevo fichero. Seleccionaremos la categoría “Hibernar” y en tipo de archivo “Asistente de configuración de Hibernate”.

El Nombre y Ubicación que nos aparecen en la siguiente ventana podemos dejarlo por defecto y haremos clic en “Siguiente”.

En la siguiente ventana seleccionaremos la base de datos Sakila en la Conexión con la base de datos y clic en “Terminar”.

Observaremos que Netbeans creó automáticamente en nuestro proyecto el archivo de configuración y agregó todas las librerías de Hibernate necesarias además del fichero JAR para conectarnos a MySQL.

Ahora deberemos de indicar en el archivo hibérnate.cfg.xml una serie de propiedades para poder efectuar consultas contra la base de datos. Trabajaremos con la vista Diseño pues nos facilita más la labor.

Expandiremos el nodo “Propiedades de configuración” y agregamos “hibernate.show_sql” con el valor true. Con esto estaremos habilitando la depuración de consultas SQL.

En el nodo “Propiedades Varias” y agregamos “hibérnate.query.factory_class” con el valor “org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory”

Una vez modificadas estas dos propiedades guardaremos los cambios (Ctrl+Mayús+S).


**HibernateUtil.java**

Para usar hibernate necesitamos crear una clase helper que nos ayudará a obtener un objeto Session.

Esta clase llama al método Hibernateconfigure(), que selecciona el fichero hibérnate.config.xml y a partir de él construye SessionFactory para obtener el objeto Session.

Procederemos a construir dicha clase mediante el asistente de igual forma que hicimos con el archivo de configuración. En la categoría seleccionaremos “Hibernar” y en tipos de archivos “HibernateUtil.java”.


**hibernate.revenge.xml**

Archivo de ingeniería inversa que puede utilizarse para modificar la configuración por defecto del archivo hibérnate.config.xml. El proceso de creación es similar a lo que venimos haciendo. En la categoría seleccionaremos “Hibernar” y en tipo de archivos “Asistente de ingeniería inversa de Hibernate”.

En la siguiente pantalla dejamos todos los datos que aparecen por defecto. A continuación seleccionaremos las tablas indicadas en el enunciado de la presente tarea y clic en “Agregar” -> “Terminar”.


**Archivos de mapeo y POJO’s**

El asistente de archivos de mapeo y POJOs desde una base de datos, permiten generar ficheros basados en tablas de la base de datos. Cuando usamos el asistente, NetBeans genera POJOs y archivos de mapeo basados en las tablas de la base de datos especificadas en “hibernate.reveng.xml”  y los añade  a las entradas de mapeo de "hibernate.cfg.xml”.

Para su creación de igual forma a lo ya explicado, en este caso en tipo de archivos seleccionaremos “Archivos de mapas de Hibernate y POJOs de la base de datos” y clic en “Siguiente”.

En la siguiente ventana es importante que nos aseguremos que aparece el archivo de configuración así como el de ingeniería inversa, además de estar marcadas las opciones “Código de dominio (.java)” y “Mapas XML de Hibernate (.hbm.xml)”. Deberemos de rellenar el nombre del paquete “sakila.entity”.

En el paquete sakila.entity podremos visualizar todos los archivos generados de forma automática.


##Consultas HQL
=============

NetBeans nos permite construir y probar consultas basadas en HibernateQueryLanguage (HQL) con el editor de Consultas HQL, al introducir la consulta podremos visualizar la consulta equivalente en SQL. 
Previamente deberemos de compilar la aplicación. Para ello, clic con el botón derecho del ratón sobre el nodo del proyecto y clic en “Generar”.
A continuación clic con el botón derecho del ratón sobre el archivo “hibernate.cfg.xml” y seleccionaremos “Ejecuta la consulta HQL” abriéndose de esta forma el editor HQL.

Ejemplos de consultas realizadas: 

- Consultar nombre y apellidos de los actores ordenados por apellidos.

La consulta sería:
“SELECT a.firstName, a.lastName FROM Actor AS a ORDER BY a.lastName”

- Consultar título, descripción y características especiales de las películas.

La consulta sería:
“SELECT f.title, f.description, f.specialFeatures  FROM Film  AS f”

- Consultar el nombre de todas las ciudades de España

La consulta en SQL sería:

SELECT city.city, country.country FROM city INNER JOIN country ON city.country_id = country.country_id WHERE country.country="Spain"

En HQL:

SELECT ci.city, co.country from City AS ci, Country AS co WHERE ci.country = co.countryId AND co.country="Spain"


##Desarrollar un proyecto
=======================

Debe de implementar un formulario Jframe que permita realizar la consulta de los actores que han participado en una película concreta, que se solicite al usuario. Mostrar en el resultado de la consulta los siguientes campos : Nombre y apellidos del actor y titulo y descripción de la película.


