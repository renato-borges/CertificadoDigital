package br.com.renato.certificado;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Classe responsavel pela persistencia da entidade de Classificados. 
 *
 * @author Renato
 */
@Stateless
@LocalBean
public class CertificadoDigitalDAO {

	@PersistenceContext(unitName = "certificadoDigitalPU")
    private EntityManager em;

	/**
	* Salva o certificado
	*/
	public void salvar(Certificado certificado) {
		em.save(certificado);
	}
	
	/**
	* Altera o certificado
	*/
	public void alterar(Certificado certificado) {
		em.merge(certificado);
	}
	
	/**
	* Deleta o certificado
	*/
	public void excluir(Certificado certificado) {
		em.delete(certificado);
	}
	
	/**
	* Recupera todos os {@link Certificado} cadastrados.
	*/
	public List<Certificado> getAll() {
		TypedQuery query = em.createQuery("SELECT o FROM br.com.renato.models.Certificado o", Certificado.class);
		return query.getResultList();
	}
	
	/**
	* Recupera o certificado pelo id informado.
	* 
	* @param id
	*/
    public Certificado getCertificado(Integer id) {
        return em.find(Certificado.class, id);
    }
}
