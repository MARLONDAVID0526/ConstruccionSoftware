package visitor;

public class FirmaVisitor implements Visitor {


    @Override
    public void firmarExtracto(ExtractoBancario extracto) {
        System.out.printf("Frimando extracto para : %s - %s%n", extracto.getTipoDocumento(), extracto.getIdentificacion());
    }

    @Override
    public void firmarCertificado(CertificadoBancario certificado) {
        System.out.printf("Frimando Certificado para : %s - %s%n", certificado.getTipoDocumento(), certificado.getIdentificacion());
    }
}
