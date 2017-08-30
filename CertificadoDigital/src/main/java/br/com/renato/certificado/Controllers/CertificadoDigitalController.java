package br.com.renato.certificado;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


/**
 * Classe responsavel pela regra persistencia da entidade de Classificados. 
 *
 * @author Renato
 */
@Stateless
@LocalBean
@Path("/certificadoDigital")
public class CertificadoDigitalController {

	@EJB
    private CertificadoDigitalService certificadoDigitalService;

	/**
	* Salva o certificado
	*/
	@POST
	@Consumes("application/json")
	public void salvar(Certificado certificado) {
		certificadoDigitalService.salvar(certificado);
	}
	
	/**
	* Altera o certificado
	*/
	@PUT
	@Consumes("application/json")
	public void alterar(Certificado certificado) {
		certificadoDigitalService.alterar(certificado);
	}
	
	/**
	* Deleta o certificado
	*/
	@DELETE
	@Produces("application/json")
	@Consumes("application/json")
	public void excluir(Certificado certificado) {
		certificadoDigitalService.excluir(certificado);
	}
	
	/**
	* Recupera todos os {@link Certificado} cadastrados.
	*/
	@GET
	@Path("/getAll")
	public List<Certificado> getAll() {
		return certificadoDigitalService.getAll();
	}
	
	/**
	* Recupera o certificado pelo id informado.
	* 
	* @param id
	*/
	@GET
    @Path("/{id}")
    public Certificado getCertificado(@pathParam("id")Integer id) {
        return certificadoDigitalService.getCertificado(Certificado.class, id);
    }
}
