package org.gabriel.models.abstractClass;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Carro {

    private String modelo;
    private Double precoBaseLocacao = 100.0;
    
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public abstract Double precoDiaria();

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", precoBaseLocacao=" + precoBaseLocacao + "]";
    }

}
