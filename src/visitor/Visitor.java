package visitor;

public interface Visitor {

    void firmarExtracto(ExtractoBancario extracto);

    void firmarCertificado(CertificadoBancario certificado);

}
