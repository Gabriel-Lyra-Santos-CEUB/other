package org.gabriel.model;

import javax.management.InvalidAttributeValueException;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Pessoa{

    private Double salario;

    public Funcionario(String nome, Integer dependentes) {
        super(nome, dependentes);
    }

    public Funcionario(String nome, Integer dependentes, Double salario) {
        super(nome, dependentes);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) throws InvalidAttributeValueException {
        if(salario < 0.0){
            throw new InvalidAttributeValueException(); 
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + "] is a " + super.toString();
    }
    
}
