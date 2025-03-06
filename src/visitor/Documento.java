package visitor;

public interface Documento {

    void consultarDatos();

    void crear();

    void firmar(Visitor visitor);

}
