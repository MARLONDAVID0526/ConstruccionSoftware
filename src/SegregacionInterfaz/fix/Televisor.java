package SegregacionInterfaz.fix;

class Televisor implements Dispositivo, ReproductorSonido, ConectividadInternet {
    @Override
    public void encender() { System.out.println("El televisor se ha encendido."); }
    @Override
    public void apagar() { System.out.println("El televisor se ha apagado."); }
    @Override
    public void reproducirSonido() { System.out.println("Reproduciendo sonido desde el televisor."); }
    @Override
    public void conectarInternet() { System.out.println("El televisor se ha conectado a internet."); }
}

class Audifonos implements Dispositivo, ReproductorSonido {
    @Override
    public void encender() { System.out.println("Los audífonos están encendidos."); }
    @Override
    public void apagar() { System.out.println("Los audífonos están apagados."); }
    @Override
    public void reproducirSonido() { System.out.println("Reproduciendo sonido en los audífonos."); }
}

class Smartphone implements Dispositivo, PantallaTactil, ReproductorSonido, ConectividadInternet {
    @Override
    public void encender() { System.out.println("El smartphone está encendido."); }
    @Override
    public void apagar() { System.out.println("El smartphone está apagado."); }
    @Override
    public void usarPantallaTactil() { System.out.println("Usando la pantalla táctil del smartphone."); }
    @Override
    public void reproducirSonido() { System.out.println("Reproduciendo música en el smartphone."); }
    @Override
    public void conectarInternet() { System.out.println("El smartphone está conectado a internet."); }
}



//Clase principal con el método main
class  mainCorrect {
    public static void main(String[] args) {
        // Creando diferentes dispositivos
        Televisor  miTelevisor= new Televisor();
        Audifonos misAudifonos = new Audifonos();
        Smartphone miSmartphone = new Smartphone();

        // Probando el Televisor
        System.out.println("=== TELEVISOR ===");
        miTelevisor.encender();
        miTelevisor.reproducirSonido();
        miTelevisor.conectarInternet();
        if (miTelevisor instanceof PantallaTactil) {
            ((PantallaTactil) miTelevisor).usarPantallaTactil();
        } else {
            System.out.println("El televisor no tiene pantalla táctil.");
        }
        miTelevisor.apagar();

        System.out.println("\n=== AUDÍFONOS ===");
        misAudifonos.encender();
        misAudifonos.reproducirSonido();
        misAudifonos.apagar();

        System.out.println("\n=== SMARTPHONE ===");
        miSmartphone.encender();
        miSmartphone.usarPantallaTactil();
        miSmartphone.reproducirSonido();
        miSmartphone.conectarInternet();
        miSmartphone.apagar();
    }
}