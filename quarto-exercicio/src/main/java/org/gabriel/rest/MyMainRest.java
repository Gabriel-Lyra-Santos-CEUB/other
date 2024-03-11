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

    // CarroEconomico Rest
    @GET
    @Path("/carroEconomicoAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String carroEconomicoAsString() {
        return mainRotinas.carroEconomicoAsString();
    }

    @GET
    @Path("/carroEconomicoPrecoDiariaAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String carroEconomicoPrecoDiariaAsString() {
        return mainRotinas.carroEconomicoPrecoDiariaAsString();
    }


    // CarroIntermediario
    @GET
    @Path("/carroIntermediarioAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String carroIntermediarioAsString() {
        return mainRotinas.carroIntermediarioAsString();
    }

    @GET
    @Path("/carroIntermediarioPrecoDiariaAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String carroIntermediarioPrecoDiariaAsString() {
        return mainRotinas.carroIntermediarioPrecoDiariaAsString();
    }



    // MainRotinas
    @GET
    @Path("/quantidadeObjetosCriadosAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String quantidadeObjetosCriadosAString() {
        return mainRotinas.getQtdCarros().toString();
    }

}
