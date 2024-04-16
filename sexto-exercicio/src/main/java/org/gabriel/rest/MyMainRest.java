package org.gabriel.rest;

import org.gabriel.models.Funcionario;
import org.gabriel.rotinas.MainRotinas;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/exercicio")
@RequestScoped
public class MyMainRest {
    
    @Inject
    private MainRotinas mainRotinas;

    @GET
    @Path("/getFuncionario")
    public Response getFuncionario(Integer id) {
        Funcionario mymodel = mainRotinas.findFuncionarioById(id);
        return Response.ok(mymodel).build();
    }

    @PUT
    @Path("/createDatabaseEmpresa")
    public Response createDatabaseEmpresa() {
        mainRotinas.createDatabaseEmpresa();
        return Response.ok().build();
    }

    @PUT
    @Path("/createTableFuncionario")
    public Response createTableFuncionario() {
        mainRotinas.createTableFuncionario();
        return Response.ok().build();
    }

    
}