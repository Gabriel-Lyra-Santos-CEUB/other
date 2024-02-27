package org.gabriel.rest;

import org.gabriel.model.Livro;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getLivro/{testID}")
public class getLivro {

    @GET
    @Path("/asString")
    @Produces(MediaType.TEXT_PLAIN)
    public String getlivroAsString(@PathParam(value = "testID") Integer testID) {

        if (testID == 1) {
            Livro livro1 = new Livro("harry potter", "j.k", 123, 132.4);
            Livro livro2 = new Livro("adabas", "percy", 537);

            return "livro 1: " + mostraDados(livro1) + " livro 2: " + mostraDados(livro2);
        } else if (testID == 2) {
            Livro livro1 = new Livro("harry potter", "j.k", 123, 132.4);
            livro1.setTitulo(null);
            
            return "livro 1: " + mostraDados(livro1);
        }

        return "Internal Error";

    }

    private String mostraDados(Livro livro1) {
        return livro1.toString();
    }
    
}
