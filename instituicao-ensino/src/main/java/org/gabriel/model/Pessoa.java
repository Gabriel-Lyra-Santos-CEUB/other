package org.gabriel.model;

import javax.management.InvalidAttributeValueException;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String nome;
    private Integer dependentes;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDependentes() {
        return dependentes;
    }

    public void setDependentes(Integer dependentes) throws InvalidAttributeValueException {
        if(dependentes < 0) {
            throw new InvalidAttributeValueException();
        }
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "pessoa [nome=" + nome + ", dependentes=" + dependentes + "]";
    }

    
    
}
