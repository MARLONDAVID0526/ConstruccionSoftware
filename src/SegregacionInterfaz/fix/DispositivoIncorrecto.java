package SegregacionInterfaz.fix;

// ❌ Interfaz demasiado grande (contiene métodos innecesarios para algunos dispositivos)
public interface DispositivoIncorrecto {
    void encender();
    void apagar();
    void usarPantallaTactil();  // ❌ No todos los dispositivos tienen pantalla táctil
    void reproducirSonido();    // ❌ No todos los dispositivos tienen sonido
    void conectarInternet();    // ❌ No todos los dispositivos tienen internet
}
