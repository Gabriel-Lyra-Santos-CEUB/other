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

    // Quadrado Rest
    @GET
    @Path("/quadradoArea")
    @Produces(MediaType.TEXT_PLAIN)
    public String quadradoArea() {
        return mainRotinas.quadradoArea();
    }

    @GET
    @Path("/quadradoPerimetro")
    @Produces(MediaType.TEXT_PLAIN)
    public String quadradoPerimetro() {
        return mainRotinas.quadradoPerimetro();
    }

    @GET
    @Path("/quadradoMensagemIdentificado")
    @Produces(MediaType.TEXT_PLAIN)
    public String quadradoMensagemIdentificado() {
        return mainRotinas.quadradoMensagemIdentificado();
    }

    // Circulo Rest
    @GET
    @Path("/ciculoArea")
    @Produces(MediaType.TEXT_PLAIN)
    public String ciculoArea() {
        return mainRotinas.circuloArea();
    }

    @GET
    @Path("/ciculoPerimetro")
    @Produces(MediaType.TEXT_PLAIN)
    public String ciculoPerimetro() {
        return mainRotinas.circuloPerimetro();
    }

    @GET
    @Path("/circuloMensagemIdentificado")
    @Produces(MediaType.TEXT_PLAIN)
    public String circuloMensagemIdentificado() {
        return mainRotinas.circuloMensagemIdentificado();
    }


    @GET
    @Path("/quantidadeObjetosCriados")
    @Produces(MediaType.TEXT_PLAIN)
    public String quantidadeObjetosCriados() {
        return mainRotinas.getQtdFiguras().toString();
    }

}
