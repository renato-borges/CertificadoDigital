package br.com.renato.certificado;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

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
	*/
	public void salvar(Certificado certificado) {
		certificadoDigitalDao.salvar(certificado);
	}
	
	/**
	* Altera o certificado
	*/
	public void alterar(Certificado certificado) {
		certificadoDigitalDao.alterar(certificado);
	}
	
	/**
	* Deleta o certificado
	*/
	public void excluir(Certificado certificado) {
		certificadoDigitalDao.excluir(certificado);
	}
	
	/**
	* Recupera todos os {@link Certificado} cadastrados.
	*/
	public List<Certificado> getAll() {
		return certificadoDigitalDao.getAll();
	}
	
	/**
	* Recupera o certificado pelo id informado.
	* 
	* @param id
	*/
    public Certificado getCertificado(Integer id) {
        return certificadoDigitalDao.getCertificado(Certificado.class, id);
    }
}
