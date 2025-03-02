package SegregacionInterfaz;
// 📺 Televisor: Obligado a implementar métodos que no usa
class televisorIncorrecto implements DispositivoIncorrecto {
    @Override
    public void encender() {
        System.out.println("El televisor se ha encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor se ha apagado.");
    }

    @Override
    public void usarPantallaTactil() {
        throw new UnsupportedOperationException("El televisor no tiene pantalla táctil.");  // ❌ MAL
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Reproduciendo sonido desde el televisor.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("El televisor se ha conectado a internet.");
    }
}

// 🎧 Audífonos: Obligados a implementar métodos que no aplican
class AudifonosIncorrecto implements DispositivoIncorrecto {
    @Override
    public void encender() {
        System.out.println("Los audífonos están encendidos.");
    }

    @Override
    public void apagar() {
        System.out.println("Los audífonos están apagados.");
    }

    @Override
    public void usarPantallaTactil() {
        throw new UnsupportedOperationException("Los audífonos no tienen pantalla táctil.");  // ❌ MAL
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Reproduciendo sonido en los audífonos.");
    }

    @Override
    public void conectarInternet() {
        throw new UnsupportedOperationException("Los audífonos no se conectan a internet.");  // ❌ MAL
    }
}

// 📱 Smartphone: Único que usa todos los métodos correctamente
class SmartphoneIncorrecto implements DispositivoIncorrecto {
    @Override
    public void encender() {
        System.out.println("El smartphone está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El smartphone está apagado.");
    }

    @Override
    public void usarPantallaTactil() {
        System.out.println("Usando la pantalla táctil del smartphone.");
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Reproduciendo música en el smartphone.");
    }

    @Override
    public void conectarInternet() {
        System.out.println("El smartphone está conectado a internet.");
    }
}

// 📌 Clase principal con el método main
class  mainIncorrect {
    public static void main(String[] args) {
        // Creando diferentes dispositivos
        televisorIncorrecto  miTelevisor= new televisorIncorrecto();
        AudifonosIncorrecto misAudifonos = new AudifonosIncorrecto();
        SmartphoneIncorrecto miSmartphone = new SmartphoneIncorrecto();

        // Probando el Televisor
        System.out.println("=== TELEVISOR ===");
        miTelevisor.encender();
        miTelevisor.reproducirSonido();
        miTelevisor.conectarInternet();
        try {
            miTelevisor.usarPantallaTactil(); // ❌ Esto lanzará una excepción
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        miTelevisor.apagar();

        System.out.println("\n=== AUDÍFONOS ===");
        misAudifonos.encender();
        misAudifonos.reproducirSonido();
        try {
            misAudifonos.conectarInternet(); // ❌ Esto lanzará una excepción
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        misAudifonos.apagar();

        System.out.println("\n=== SMARTPHONE ===");
        miSmartphone.encender();
        miSmartphone.usarPantallaTactil();
        miSmartphone.reproducirSonido();
        miSmartphone.conectarInternet();
        miSmartphone.apagar();
    }
}

//Diseño incorrecto: La interfaz DispositivoIncorrecto es demasiado grande y obliga a implementar métodos innecesarios.
//Solución correcta: Dividir la interfaz en varias interfaces pequeñas, asegurando que cada clase implemente solo lo que necesita.
//Beneficios: Código más flexible, escalable y fácil de mantener. 🚀
