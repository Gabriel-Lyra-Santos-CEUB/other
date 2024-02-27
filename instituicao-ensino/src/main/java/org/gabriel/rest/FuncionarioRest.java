package org.gabriel.rest;

import org.gabriel.model.Funcionario;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/funcionario")
public class FuncionarioRest {

    private static final int valorAuxilioDependente = 100;

    @GET
    @Path("/getFuncionariosAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String getFuncionarioAsString(){

        Funcionario funcionario1 = new Funcionario("Gabriel", 3, 5600.50);
        Funcionario funcionario2 = new Funcionario("João", 2);
        Funcionario funcionario3 = new Funcionario();

        return funcionario1.toString() + funcionario2.toString() + funcionario3.toString();
        
    }

    @GET
    @Path("/getSalarioTotal")
    @Produces(MediaType.TEXT_PLAIN)
    public Double getSalarioTotal(){

        Funcionario funcionario1 = new Funcionario("Gabriel", 3, 5600.50);

        return calculaSalarioTotal(funcionario1);
        
    }

    public Double calculaSalarioTotal(Funcionario funcionario1) {
        return funcionario1.getSalario() + (funcionario1.getDependentes() * valorAuxilioDependente);
    }
    
}
