package org.gabriel.rest;

import org.gabriel.model.Livro;
import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/updateLivro/{testID}")
public class updateLivro {

    @GET
    @Path("/updatePreco")
    @Produces(MediaType.TEXT_PLAIN)
    public RestResponse<Livro> updatePrecolivro(@PathParam(value = "testID") Integer testID) {

        Livro livro1 = new Livro("adabas", "percy", 537);

        if (testID == 1) {
            aumentoPreco(livro1, 130.5);
            return ResponseBuilder.ok(livro1).build();
        }

        throw new BadRequestException("Faltou o testID");


    }

    @GET
    @Path("/updatePorcentagem")
    @Produces(MediaType.TEXT_PLAIN)
    public RestResponse<Livro> updatePorcentagemlivro(@PathParam(value = "testID") Integer testID) {

        if (testID == 2) {
            Livro livro1 = new Livro("adabas", "percy", 537);
            updatePorcentagem(livro1, 275.5);
            return ResponseBuilder.ok(livro1).build();
        }

        throw new BadRequestException("Faltou o testID");

    }

    private void aumentoPreco(Livro livro, Double precoNovo) {
        livro.setPreco(precoNovo);
    }

    private void updatePorcentagem(Livro livro, Double porcentagemAumento) {
        livro.setPreco(livro.getPreco() * (1.0 + (porcentagemAumento/100)));
    }
}
