package Facade.codesmell;

class ReproductorDVD {
    public void encender() { System.out.println("Reproductor DVD encendido."); }
    public void apagar() { System.out.println("Reproductor DVD apagado."); }
    public void reproducir(String pelicula) { System.out.println("Reproduciendo: " + pelicula); }
}