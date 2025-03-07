Readme Altacohesion
===============
Este proyecto demuestra la importancia de seguir el principio de Responsabilidad Única (SRP) para lograr alta cohesión y bajo acoplamiento en el diseño de clases.

Se presentan dos implementaciones que realizan la misma tarea (mostrar un saludo y una despedida), pero de manera diferente:


Usage Saludo_Incorrect
-----
La clase ```Saludo_Incorrect``` se encarga tanto de almacenar los datos (_to y message) como de la presentación (métodos ```Saludar()``` y ```Despedir()```). Esto implica que, si en el futuro se requiere modificar la forma de imprimir los mensajes, se tendrá que alterar la clase, afectando así su reusabilidad y mantenimiento.



Usage SaludoCorrecto
-----
La clase ```SaludoCorrecto``` se dedica exclusivamente a almacenar los datos del saludo. 
La responsabilidad de presentar el mensaje se delega a una clase separada, ```GestorSaludo```, que contiene los métodos ```Saludar()``` y ```Despedir()```. De esta forma, se respeta el SRP y se logra un diseño más flexible y fácil de mantener.


