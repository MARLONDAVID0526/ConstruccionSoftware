package Facade.codesmell;

public class ClienteSinFachada {
    public static void main(String[] args) {
        // Crear instancias de cada subsistema
        Amplificador amplificador = new Amplificador();
        ReproductorDVD reproductor = new ReproductorDVD();
        Proyector proyector = new Proyector();
        Luces luces = new Luces();

        // Configurar manualmente cada componente para ver una película
        System.out.println("Preparando la sala para ver la película...");
        luces.atenuar(30);
        proyector.encender();
        proyector.ajustarResolucion("1080p");
        amplificador.encender();
        amplificador.ajustarVolumen(50);
        reproductor.encender();
        reproductor.reproducir("Inception");

        // Finalizando la sesión
        System.out.println("Terminando la sesión...");
        reproductor.apagar();
        amplificador.apagar();
        proyector.apagar();
        luces.restaurar();
    }
}