				Proyecto de Gestión de Asesorías y Capacitaciones

Introducción:

Este proyecto es una aplicación de gestión de asesorías y capacitaciones para una empresa dedicada a brindar 
servicios de consultoría y formación. La empresa trabaja con una amplia base de clientes y cuenta con un equipo 
de profesionales y administrativos que participan en el proceso de asesoramiento y capacitación. La necesidad 
principal es contar con una solución informática que permita registrar y administrar toda la información relacionada 
con los clientes, profesionales, administrativos y capacitaciones.

Problema:

La empresa se enfrenta a dificultades para llevar un seguimiento organizado de los clientes y las capacitaciones solicitadas. 
La gestión manual de la información ha llevado a errores, pérdida de datos y una falta de eficiencia en el proceso. Además, 
se requiere un sistema que facilite la generación de informes y estadísticas relacionadas con las capacitaciones realizadas.

Planteamiento de la solución:

El objetivo principal del proyecto es desarrollar un sistema de gestión en Java que permita a la empresa administrar de manera eficiente 
y automatizada sus asesorías y capacitaciones. La solución se basa en el paradigma de programación orientada a objetos, utilizando 
clases y objetos para representar las entidades involucradas.

El sistema ofrece las siguientes funcionalidades clave:

1.      Registro de clientes: Permite agregar nuevos clientes al sistema, ingresando información como nombre, apellido, número de contacto,
         dirección, entre otros datos relevantes.

2.      Registro de profesionales: Permite registrar y gestionar la información de los profesionales que participan en las asesorías y capacitaciones.
         Se almacena información como nombre, especialidad, experiencia, entre otros detalles.

3.      Registro de administrativos: Permite ingresar y mantener los datos de los administrativos que brindan apoyo en el proceso de gestión. 
         Se registran detalles como nombre, apellido, área de trabajo, experiencia, entre otros.

4.      Registro de capacitaciones: Permite registrar las capacitaciones ofrecidas por la empresa. Se incluye información como fecha, hora, lugar, 
         duración, temario, número máximo de participantes, entre otros datos relevantes.

5.      Asociación de capacitaciones a clientes: El sistema permite asociar las capacitaciones a los clientes correspondientes. De esta manera, 
         se puede llevar un seguimiento de las capacitaciones solicitadas por cada cliente.

6.      Eliminación de usuarios: Permite eliminar clientes, profesionales o administrativos del sistema, en caso de ser necesario.

7.      Listado de usuarios: Ofrece la posibilidad de listar y visualizar en pantalla todos los usuarios registrados en el sistema, brindando una visión 
         general de la base de datos de clientes, profesionales y administrativos.

8.      Listado de capacitaciones: Permite listar y visualizar en pantalla todas las capacitaciones registradas en el sistema, facilitando el seguimiento y la gestión de las mismas.

Además de estas funcionalidades principales, el sistema implementa la persistencia de datos utilizando archivos de texto. Cada entidad 
(clientes, profesionales, administrativos, capacitaciones) tiene su propio archivo de texto donde se almacenan los datos correspondientes.
 Esto garantiza que la información se conserve incluso después de cerrar y volver a ejecutar la aplicación.

Instrucciones de uso:

1. Ejecutar el programa "Principal.java

2. Se mostrará un menú principal con varias opciones numeradas del 1 al 9.

3. Ingrese el número correspondiente a la opción que desee utilizar y presione Enter.

4. Dependiendo de la opción seleccionada, se le pedirá ingresar los datos requeridos, como el nombre, apellido, RUT, teléfono, etc.

5. Una vez que haya ingresado los datos solicitados, el sistema realizará la acción correspondiente, como agregar un cliente, un profesional, 
    un administrativo, una capacitación, eliminar un usuario, listar usuarios o listar capacitaciones.

6. En caso de agregar una capacitación, se le pedirá ingresar el RUT del cliente que solicitó la capacitación. Si el cliente existe en el sistema, 
se asociará la capacitación a ese cliente. De lo contrario, se mostrará un mensaje indicando que no se encontró ningún cliente con el RUT especificado.

7. Para finalizar la ejecución del programa, seleccione la opción "9. Salir" en el menú principal. Se mostrará un mensaje de despedida y la aplicación se cerrará.

8. Los datos ingresados se guardarán automáticamente en archivos de texto correspondientes a cada entidad (clientes, profesionales, administrativos, capacitaciones).

9. Al reiniciar la aplicación, los datos se cargarán desde los archivos de texto, lo que permitirá mantener la persistencia de la información.

Consideraciones adicionales:

Si se ingresa una opción inválida en el menú principal, se mostrará un mensaje de error y se solicitará ingresar una opción válida.
Al realizar la búsqueda de un cliente por su RUT, el sistema buscará en la lista de clientes almacenados y devolverá el cliente correspondiente. 
Si no se encuentra ningún cliente con ese RUT, se devolverá un valor nulo.
Al eliminar un usuario, el sistema buscará en todas las listas (clientes, profesionales, administrativos) y eliminará el usuario con el RUT especificado. 
Se mostrará un mensaje indicando si el usuario fue eliminado correctamente o si no se encontró ningún usuario con el RUT especificado.
Los listados de usuarios y capacitaciones se mostrarán en pantalla, brindando una visión general de los datos almacenados en el sistema.

¡Disfrute utilizando el sistema de gestión de asesorías y capacitaciones! Si tiene alguna pregunta o necesita ayuda adicional, no dude en comunicarse con nuestro equipo de soporte.