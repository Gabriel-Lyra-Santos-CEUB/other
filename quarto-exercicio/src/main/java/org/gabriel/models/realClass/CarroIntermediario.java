package org.gabriel.models.realClass;

import org.gabriel.models.abstractClass.Carro;

public class CarroIntermediario extends Carro {

    private static final Double VALOR_ACRESCIMENTO = 1.10;

    Double baseAcrescimento = VALOR_ACRESCIMENTO;

    public CarroIntermediario(String modelo) {
        super(modelo);
    }

    @Override
    public Double precoDiaria() {
        return super.getPrecoBaseLocacao() * baseAcrescimento;
    }

    @Override
    public String toString() {
        return "CarroIntermediario [baseAcrescimento=" + this.baseAcrescimento + "]" + " is " + super.toString();
    }
    
}
