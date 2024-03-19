package org.gabriel.rest;

import org.gabriel.rotinas.MainRotinas;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/exercicio")
public class MyMainRest {
    
    @Inject
    MainRotinas mainRotinas;

    // REST TITULAR
    @GET
    @Path("/titularAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String titularAsString() {
        return mainRotinas.titularAsString();
    }

    @GET
    @Path("/titularNomeCompleto")
    @Produces(MediaType.TEXT_PLAIN)
    public String titularNomeCompleto() {
        return mainRotinas.titularNomeCompleto();
    }

    @GET
    @Path("/changeTitularName")
    @Produces(MediaType.TEXT_PLAIN)
    public String changeTitularName() {
        mainRotinas.changeTitularName();
        return mainRotinas.titularAsString();
    }


    // REST CONTA
    @GET
    @Path("/contaAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String contaAsString() {
        return mainRotinas.contaAsString();
    }

    // CONTA e TITULAR
    @GET
    @Path("/memoryAddresses")
    @Produces(MediaType.TEXT_PLAIN)
    public String memoryAddresses() {
        return mainRotinas.memoryAddresses();
    }

    @GET
    @Path("/changeTitularNameThenContaAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String changeTitularNameThenContaAsString() {
        return mainRotinas.changeTitularNameThenContaAsString();
    }

    @GET
    @Path("/changeTitularNameThroughContaThenContaAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String changeTitularNameThroughContaThenContaAsString() {
        return mainRotinas.changeTitularNameThroughContaThenContaAsString();
    }

    @GET
    @Path("/changeTitularNameThroughContaThenTitularAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String changeTitularNameThroughContaThenTitularAsString() {
        return mainRotinas.changeTitularNameThroughContaThenTitularAsString();
    }
    
}
