package Facade.fix;

class HomeTheaterFacade {
    private Amplificador amplificador;
    private ReproductorDVD reproductor;
    private Proyector proyector;
    private Luces luces;

    public HomeTheaterFacade(Amplificador amplificador, ReproductorDVD reproductor, Proyector proyector, Luces luces) {
        this.amplificador = amplificador;
        this.reproductor = reproductor;
        this.proyector = proyector;
        this.luces = luces;
    }

    // Método para iniciar la experiencia de ver una película.
    public void verPelicula(String pelicula) {
        System.out.println("Preparando el Home Theater para ver la película...");
        luces.atenuar(30);
        proyector.encender();
        proyector.ajustarResolucion("1080p");
        amplificador.encender();
        amplificador.ajustarVolumen(50);
        reproductor.encender();
        reproductor.reproducir(pelicula);
    }

    // Método para finalizar la experiencia y apagar todos los componentes.
    public void terminarPelicula() {
        System.out.println("Apagando el Home Theater...");
        reproductor.apagar();
        amplificador.apagar();
        proyector.apagar();
        luces.restaurar();
    }
}