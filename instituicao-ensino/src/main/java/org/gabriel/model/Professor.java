package org.gabriel.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Pessoa{

    private Integer qtd_turma;
    private Double valorPorTurma;

    public Professor(String nome, Integer dependentes) {
        super(nome, dependentes);
    }

    public Professor(String nome, Integer dependentes, Integer qtd_turma, Double valorPorTurma) {
        super(nome, dependentes);
        this.qtd_turma = qtd_turma;
        this.valorPorTurma = valorPorTurma;
    }

    public Integer getQtd_turma() {
        return qtd_turma;
    }

    public void setQtd_turma(Integer qtd_turma) {
        this.qtd_turma = qtd_turma;
    }

    public Double getValorPorTurma() {
        return valorPorTurma;
    }

    public void setValorPorTurma(Double valorPorTurma) {
        this.valorPorTurma = valorPorTurma;
    }

    @Override
    public String toString() {
        return "Professor [qtd_turma=" + qtd_turma + ", valorPorTurma=" + valorPorTurma + "] is a " + super.toString();
    }
    
}
