package org.gabriel.rotinas;

import org.gabriel.models.realClass.CarroEconomico;
import org.gabriel.models.realClass.CarroIntermediario;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;

@ApplicationScoped
@Getter
public class MainRotinas {

    private Integer qtdCarros = 0;

    // org.gabriel.models.abstractClass.Carro carro = new Carro();

    private CarroEconomico criarCarroEconomico(String modelo){
        qtdCarros++;
        return new CarroEconomico(modelo);
    }

    private CarroIntermediario criarCarroIntermediario(String modelo){
        qtdCarros++;
        return new CarroIntermediario(modelo);
    }



    // CarroEconomico Rotinas
    public String carroEconomicoAsString(){
        CarroEconomico carroEconomico = criarCarroEconomico("Celta");
        return carroEconomico.toString();
    }

    public String carroEconomicoPrecoDiariaAsString(){
        CarroEconomico carroEconomico = criarCarroEconomico("Celta");
        return carroEconomico.getPrecoBaseLocacao().toString();
    }



    // CarroIntermediario Rotinas
    public String carroIntermediarioAsString(){
        CarroIntermediario carroIntermediario = criarCarroIntermediario("HB20");
        return carroIntermediario.toString();
    }

    public String carroIntermediarioPrecoDiariaAsString(){
        CarroIntermediario carroIntermediario = criarCarroIntermediario("HB20");
        return carroIntermediario.getPrecoBaseLocacao().toString();
    }
    
}
