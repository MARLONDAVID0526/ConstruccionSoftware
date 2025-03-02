package Altacohesion;

// Clase que solo gestiona los datos del saludo (Alta Cohesión)
public class SaludoCorrecto {
    private String _to;
    private String _message;

    public SaludoCorrecto(String to, String message) {
        this._to = to;
        this._message = message;
    }

    public String getTo() {
        return _to;
    }

    public String getMessage() {
        return _message;
    }
}

// Clase separada que maneja la presentación del mensaje (Bajo Acoplamiento)
class GestorSaludo {
    public void Saludar(SaludoCorrecto SaludoCorrecto) {
        System.out.println("Hola, " + SaludoCorrecto.getTo() + "! " + SaludoCorrecto.getMessage());
    }

    public void Despedir(SaludoCorrecto SaludoCorrecto) {
        System.out.println("Adiós, " + SaludoCorrecto.getTo() + "! " + SaludoCorrecto.getMessage());
    }
}

// Método main para probar la implementación
class Main {
    public static void main(String[] args) {
        SaludoCorrecto saludo = new SaludoCorrecto("Juan", "Espero que tengas un gran día.");
        GestorSaludo gestor = new GestorSaludo();

        gestor.Saludar(saludo); // Salida: Hola, Juan! Espero que tengas un gran día.
        gestor.Despedir(saludo); // Salida: Adiós, Juan! Espero que tengas un gran día.
    }
}


//Clase Saludo (Alta Cohesión)
//Únicamente almacena los datos del saludo (_to y _message).
//No tiene lógica adicional como imprimir mensajes.
//Sigue el Principio de Responsabilidad Única (SRP), ya que su única función es representar un saludo.
//Clase GestorSaludoCorrecto (Alta Cohesión)
//Únicamente maneja la presentación del saludo (Saludar() y Despedir()).
//No almacena datos, solo usa la información de la clase Salud