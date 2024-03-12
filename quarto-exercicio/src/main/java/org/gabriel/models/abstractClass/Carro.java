package org.gabriel.models.abstractClass;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Carro {

    private static final Double PRECO_BASE_LOCACAO = 100.0;

    private String modelo;
    private Double precoBaseLocacao = PRECO_BASE_LOCACAO;
    
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public abstract Double precoDiaria();

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", precoBaseLocacao=" + precoBaseLocacao + "]";
    }

}
