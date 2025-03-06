package visitor;

public class CertificadoBancario implements Documento {

    private String identificacion;
    private String tipoDocumento;

    public CertificadoBancario(String identificacion, String tipoDocumento) {
        this.identificacion = identificacion;
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public void consultarDatos() {
        System.out.printf("Consultando datos para : %s - %s%n", this.tipoDocumento,  this.identificacion);
    }

    @Override
    public void crear() {
        System.out.println("Creando Certificado Bancario");

    }

    @Override
    public void firmar(Visitor visitor) {
        visitor.firmarCertificado(this);
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
