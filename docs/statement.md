**UD5 – Práctica 1 – Ranking de restaurantes**

**Requisitos previos:**

Para esta práctica, vamos a trabajar todo lo referente a la gestión de proyectos utilizando Git como sistema de control de versiones y GitHub como servicio para alojar repositorios.

Para asimilar el flujo de trabajo, progresivamente, vamos a meternos en el papel de un equipo de desarrollo que, efectivamente, tenga que asumir un nuevo proyecto.

Cuando un proyecto comienza desde cero y se nos permite, incluso, seleccionar las herramientas de trabajo y frameworks que queremos utilizar sin restricciones, decimos que estamos ante un proyecto “**Green Field**”.

Antes de comenzar, lee con atención todos los requisitos indicados a continuación, es importante que seas consciente del proceso:

- El proyecto debe recogerse desde su estado inicial en un repositorio público de Github.
- Cada operación importante de tu proyecto debe estar reflejada en un commit dentro del repositorio.
- El mensaje de commit debe seguir las pautas del proyecto Karma tal y como hemos visto en clase. Durante el desarrollo del proyecto, se darán situaciones en las que tengas que arreglar un error o reestructurar directorios, renombrar clases, etc... Son oportunidades perfectas para utilizar mensajes de commit descriptivos.
- Cada nueva característica debe desarrollarse en una rama que parta de la rama development.  Una  vez  terminada  una  característica, sin  borrar  la  rama, la combinaremos con la rama development. Recuerda subir todas las ramas al repositorio de GitHub.
- Cuando hayas terminado de desarrollar todas las características, mergea la rama development con la rama main.
- La raíz del proyecto debe tener un fichero Readme.md que contenga, empleando la sintaxis Markdown, los objetivos del proyecto, las descripciones de cada clase desarrollada y un pequeño manual de usuario. Para reducir el tamaño de este fichero, se recomienda enlazar las descripciones y el manual de usuario a otros documentos que se encuentren en una carpeta “docs” del repositorio.
- Recuerda mantener una estructura coherente de paquetes.
- Para realizar la entrega, se indicará el link correspondiente al repositorio en la tarea de la plataforma virtual.

**Descripción del ejercicio práctico:**

Para esta entrega, nos ha contactado un cliente importantísimo del mundo del ranking de la hostelería, RipAdbaisor. Esta empresa es pionera en el sector de la información de cadenas de restauración, compitiendo con la mismísima GulúGulú.

El mayor handicap que presenta este proyecto es que el cliente no está familiarizado con el sector de la informática y le da pánico la consola, por lo que nos veremos obligados a informarnos sobre el uso de la librería Swing de Java para la muestra de información y recogida de datos. Puedes obtener más información haciendo click en los siguientes enlaces: [DDR y](https://www.discoduroderoer.es/metodos-y-funciones-joptionpane-de-java/) [CDIW.](https://www.clasesdeinformaticaweb.com/java-desde-cero/joptionpane-entrada-de-datos-en-java/)

La aplicación tendrá las características de un CRUD, es decir, debe permitir crear, mostrar, editar y eliminar los restaurantes almacenados. La información guardada no debe almacenarse entre ejecución y ejecución del programa.

**Requisitos funcionales:**

1) El restaurante almacenará la siguiente información:
- Nombre
- Localización
- Horario
- Puntuación
2) Almacenar los objetos en una lista inteligente, utilizando sus métodos para trabajar con cada registro.
3) Utilizar la librería java.swing para la recolección y muestra de datos.
3) Utiliza una o varias clases con métodos estáticos para realizar validaciones, conversión de tipos o solicitud de datos para que el código quede modularizado adecuadamente. Esto permitirá reutilizar características y funcionalidades sin duplicar código.
3) Mostrar un menú con la siguiente información:
1. *Añadir restaurante.*  Mostrará uno o varios paneles con los cuadros necesarios para ingresar la información de un nuevo registro.
1. Editar restaurante. Mostrará uno o varios paneles y permitirá la edición de la información de algún registro guardado.
1. Mostrar restaurantes. Mostrará toda la información de cada restaurante ordenado por ranking de forma descendente.
1. Eliminar restaurante. Permitirá eliminar un registro almacenado.

   Q. Salir del programa. Terminará la ejecución del programa.

6) Controlar todas las posibles excepciones que puedan romper el programa. La única manera posible del salir del programa, debe ser a través de la opción del menú.