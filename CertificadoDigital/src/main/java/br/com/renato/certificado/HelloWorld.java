package br.com.renato.certificado;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Renato
 */
@Stateless
@LocalBean
@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/teste")
    public String hello(){
        return "TESTE word";
    }
    
}
