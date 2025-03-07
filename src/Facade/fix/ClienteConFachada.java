package Facade.fix;

// Clase principal con el método main
public class ClienteConFachada {
    public static void main(String[] args) {
        // Crear instancias de los subsistemas.
        Amplificador amplificador = new Amplificador();
        ReproductorDVD reproductor = new ReproductorDVD();
        Proyector proyector = new Proyector();
        Luces luces = new Luces();

        // Crear la fachada del Home Theater.
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, reproductor, proyector, luces);

        // Utilizar la interfaz simplificada para ver una película.
        homeTheater.verPelicula("Inception");

        // Al finalizar la película, apagar todos los componentes.
        homeTheater.terminarPelicula();
    }
}