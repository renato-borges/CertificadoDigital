package br.com.renato.certificado.Controllers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
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
