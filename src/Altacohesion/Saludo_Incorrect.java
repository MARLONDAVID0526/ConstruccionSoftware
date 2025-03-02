package Altacohesion;

public class Saludo_Incorrect {
    private String _to;
    private String _message;

    // Constructor corregido
    public Saludo_Incorrect(String to, String message) {
        this._to = to;
        this._message = message;
    }

    // Métodos getter
    public String getTo() {
        return _to;
    }

    public String getMessage() {
        return _message;
    }

    // Método para mostrar el saludo
    public void Saludar() {
        System.out.println("Hola, " + _to + "! " + _message);
    }

    public void Despedir() {
        System.out.println("Hola, " + _to + "! " + _message);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Saludo_Incorrect saludo = new Saludo_Incorrect("Juan", "Espero que tengas un gran día.");
        saludo.Saludar(); // Salida: Hola, Juan! Espero que tengas un gran día.
    }
}


//Baja cohesión:
//
//La clase Saludo_Incorrect maneja dos responsabilidades:
//Almacenar los datos del saludo (_to y _message).
//Imprimir mensajes (Saludar() y Despedir()).
//Principio de Responsabilidad Única (SRP): Esta clase debería ocuparse solo de manejar los datos del saludo, pero además imprime mensajes.
//Si más adelante cambiamos la forma en que se imprimen los mensajes (por ejemplo, en otro idioma o con otro formato), la clase se verá afectada innecesariamente.
//Bajo acoplamiento (Incorrecto):
//
//Los métodos Saludar() y Despedir() dependen de la estructura de la clase.
//Si queremos cambiar la forma en que se muestran los mensajes, tendríamos que modificar esta clase en lugar de delegar la responsabilidad a otra clase que gestione la salida.
//Esto aumenta el acoplamiento, lo que significa que la clase no puede ser fácilmente reutilizada sin traer consigo la forma en que se imprimen los mensajes.