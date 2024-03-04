package org.gabriel.rest;

import org.gabriel.model.Professor;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/professor")
public class ProfessorRest {

    @GET
    @Path("/getAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String getProfessorAsString(){

        Professor professor1 = new Professor("Gabriel", 0, 2, 730.30);
        professor1.setQtd_turma(4);
        professor1.setValorPorTurma(1030.70);

        return professor1.toString();
        
    }

    @GET
    @Path("/getNome")
    @Produces(MediaType.TEXT_PLAIN)
    public String getNome(){

        Professor professor1 = new Professor("João", 0, 2, 730.30);
        
        return professor1.getNome();
        
    }

    @GET
    @Path("/getProfessoresAsString")
    @Produces(MediaType.TEXT_PLAIN)
    public String getProfessoresAsString(){

        Professor professor1 = new Professor("João", 0, 2, 730.30);
        Professor professor2 = new Professor("Pedro", 2);
        Professor professor3 = new Professor();
        Professor professor4 = Professor.builder()
            .nome("Carlos")
            .qtd_turma(4)
            .build();
        
        return professor1.toString() + professor2.toString() + professor3.toString() + professor4.toString();
        
    }

    @GET
    @Path("/getRendimento")
    @Produces(MediaType.TEXT_PLAIN)
    public Double getRendimento(){

        Professor professor1 = new Professor("João", 0, 2, 730.30);
        return rendimento(professor1).doubleValue();
        
    }

    public Double rendimento(Professor professor) {
        return professor.getQtd_turma() * professor.getValorPorTurma();
    }


    
}
