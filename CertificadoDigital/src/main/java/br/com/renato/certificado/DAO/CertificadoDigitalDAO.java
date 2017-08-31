package br.com.renato.certificado.DAO;

import br.com.renato.certificado.models.Certificado;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Classe responsavel pela persistencia da entidade de Classificados.
 *
 * @author Renato
 */
//@Stateless
//@LocalBean
public class CertificadoDigitalDAO {

    @PersistenceContext(unitName = "certificadoDigitalPU")
    private EntityManager em;

    /**
     * Salva o certificado
     *
     * @param certificado
     */
    public void salvar(Certificado certificado) {
        em.persist(certificado);
    }

    /**
     * Altera o certificado
     *
     * @param certificado
     */
    public void alterar(Certificado certificado) {
        em.merge(certificado);
    }

    /**
     * Deleta o certificado
     *
     * @param certificado
     */
    public void excluir(Certificado certificado) {
        em.remove(certificado);
    }

    /**
     * Recupera todos os {@link Certificado} cadastrados.
     *
     * @return
     */
    public List<Certificado> getAll() {
        TypedQuery query = em.createQuery("SELECT o FROM br.com.renato.certificado.models.Certificado o", Certificado.class);
        return query.getResultList();
    }

    /**
     * Recupera o certificado pelo id informado.
     *
     * @param id
     * @return
     */
    public Certificado getCertificado(Integer id) {
        return em.find(Certificado.class, id);
    }
}
