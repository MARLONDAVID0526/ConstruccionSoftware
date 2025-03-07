Readme Fachada
===============

Este proyecto ejemplifica el Principio de Segregación de Interfaz (ISP) a través de dos implementaciones:





Usage codesmell
-----
En esta versión, se agrupan múltiples responsabilidades en una única interfaz. Esto obliga a los televisores  a depender de métodos que en muchos casos no necesitan, lo que incrementa el acoplamiento y dificulta la reutilización y el mantenimiento del código.



Usage fix
-----
La solución correcta aplica el ISP segregando las interfaces en partes más pequeñas y específicas. 
De esta forma, cada dispositivo sólo depende de los métodos que realmente utiliza. Esto mejora la cohesión, reduce el acoplamiento y facilita la extensión o modificación de las funcionalidades sin impactar a otros componentes.





