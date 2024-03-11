package org.gabriel.models.realClass;

import org.gabriel.models.abstractClass.Carro;

public class CarroEconomico extends Carro {

    private static final double VALOR_ACRESCIMENTO = 105.0;

    Double baseAcrescimento = VALOR_ACRESCIMENTO;

    public CarroEconomico(String modelo) {
        super(modelo);
    }

    @Override
    public Double precoDiaria() {
        return super.getPrecoBaseLocacao() * baseAcrescimento;
    }

    @Override
    public String toString() {
        return "CarroEconomico [baseAcrescimento=" + this.baseAcrescimento + "]" + " is " + super.toString();
    }
    
}
