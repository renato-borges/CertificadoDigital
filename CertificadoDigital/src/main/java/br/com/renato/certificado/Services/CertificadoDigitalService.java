package br.com.renato.certificado.services;

import br.com.renato.certificado.DAO.CertificadoDigitalDAO;
import br.com.renato.certificado.models.Certificado;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Classe responsavel pela regra persistencia da entidade de Classificados.
 *
 * @author Renato
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CertificadoDigitalService {

    @EJB
    private CertificadoDigitalDAO certificadoDigitalDao;

    /**
     * Salva o certificado
     *
     * @param certificado
     */
    public void salvar(Certificado certificado) {
        certificadoDigitalDao.salvar(certificado);
    }

    /**
     * Altera o certificado
     *
     * @param certificado
     */
    public void alterar(Certificado certificado) {
        certificadoDigitalDao.alterar(certificado);
    }

    /**
     * Deleta o certificado
     *
     * @param certificado
     */
    public void excluir(Certificado certificado) {
        certificadoDigitalDao.excluir(certificado);
    }

    /**
     * Recupera todos os {@link Certificado} cadastrados.
     *
     * @return
     */
    public List<Certificado> getAll() {
        return certificadoDigitalDao.getAll();
    }

    /**
     * Recupera o certificado pelo id informado.
     *
     * @param id
     * @return
     */
    public Certificado getCertificado(Integer id) {
        return certificadoDigitalDao.getCertificado(id);
    }
}
