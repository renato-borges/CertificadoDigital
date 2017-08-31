package br.com.renato.certificado.controllers;

import br.com.renato.certificado.models.Certificado;
import br.com.renato.certificado.services.CertificadoDigitalService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Classe responsavel pela regra persistencia da entidade de Classificados.
 *
 * @author Renato
 */
@Path("/certificadoDigital")
public class CertificadoDigitalController {

    @EJB
    private CertificadoDigitalService certificadoDigitalService;

    /**
     * Salva o certificado
     *
     * @param certificado
     */
    @POST
    //@Consumes("application/json")
    public void salvar(Certificado certificado) {
        certificadoDigitalService.salvar(certificado);
    }

    /**
     * Altera o certificado
     *
     * @param certificado
     */
    @PUT
    //@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public void alterar(Certificado certificado) {
        certificadoDigitalService.alterar(certificado);
    }

    /**
     * Deleta o certificado
     *
     * @param certificado
     */
    @DELETE
    //@Produces("application/json")
    //@Consumes("application/json")
    public void excluir(Certificado certificado) {
        certificadoDigitalService.excluir(certificado);
    }

    /**
     * Recupera todos os {@link Certificado} cadastrados.
     *
     * @return
     */
    @GET
    @Path("/getAll")
    //@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Certificado> getAll() {
        return certificadoDigitalService.getAll();
    }

    /**
     * Recupera o certificado pelo id informado.
     *
     * @param id
     * @return
     */
    @GET
    @Path("/{id}")
    public Certificado getCertificado(@PathParam("id") Integer id) {
        return certificadoDigitalService.getCertificado(id);
    }
}
