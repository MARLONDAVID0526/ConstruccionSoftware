Readme Controller
===============
Este proyecto demuestra la aplicación del método Controller para mejorar la cohesión y reducir el acoplamiento en una sencilla aplicación de login. Se presentan dos implementaciones:



Usage codesmell
-----
En esta versión, la clase ```LoginUI``` se encarga de múltiples responsabilidades:

Gestiona la interacción con el usuario (entrada y salida).
Realiza la lógica de autenticación directamente, accediendo a los usuarios a través de la clase ```InMemoryUsers```.
Esto viola el principio de Responsabilidad Única (SRP) y dificulta la extensión o modificación de la lógica de negocio sin afectar la interfaz.


Usage fix
-----
En la versión mejorada se separa la lógica de autenticación del manejo de la interfaz de usuario mediante la introducción de un controlador (por ejemplo, ```LoginController```).

La clase ```LoginController``` se encarga exclusivamente de gestionar la autenticación.
La clase ```LoginUI``` (o similar) se encarga solo de la interacción con el usuario, delegando la lógica de negocio al controlador.
La clase ```InMemoryUsers``` se mantiene como repositorio de usuarios.


Esta separación permite modificar o extender la lógica de autenticación sin afectar la interfaz, favoreciendo un diseño más limpio, modular y fácil de mantener.


```