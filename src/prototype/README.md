Readme Prototype
===============
Este proyecto ejemplifica la implementación del patrón Prototype, permitiendo clonar objetos sin conocer sus detalles de implementación. La demostración se centra en la clonación de un objeto de tipo AvionPrototype mediante la interfaz Prototype.



Usage Prototype.java
-----
Define la interfaz del patrón con el método ```clone()```, que debe implementarse para permitir la clonación de objetos.

AvionPrototype.java
-----
Implementa la interfaz Prototype.

Incluye un constructor por defecto para crear instancias vacías.
Utiliza un constructor de clonación que recibe un objeto ```Prototype``` (convertido a ```AvionPrototype```) y copia sus atributos.
El método ```clone()``` retorna una nueva instancia clonada utilizando el constructor de clonación.

