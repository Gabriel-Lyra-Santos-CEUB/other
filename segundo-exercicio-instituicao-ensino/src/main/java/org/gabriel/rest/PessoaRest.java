package org.gabriel.rest;

import org.gabriel.model.Pessoa;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pessoa")
public class PessoaRest {

    @GET
    @Path("/getAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPessoaAsString(){

        Pessoa pessoa1 = new Pessoa("Gabriel", 0);
        return pessoa1.toString();
        
    }


    
}
