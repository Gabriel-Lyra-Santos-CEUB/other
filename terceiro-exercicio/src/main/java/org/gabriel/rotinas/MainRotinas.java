package org.gabriel.rotinas;

import org.gabriel.models.realClasses.Circulo;
import org.gabriel.models.realClasses.Quadrado;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;

@ApplicationScoped
@Getter
public class MainRotinas {

    private Integer qtdFiguras = 0;

    public Quadrado criarQuadrado(){
        qtdFiguras++;
        return new Quadrado(5.5);
    }

    public Circulo criarCirculo(){
        qtdFiguras++;
        return new Circulo(5.5);
    }

    //FormaGeometrica formaGeometrica = new FormaGeometrica();

    // Quadrados
    public String quadradoArea(){
        Quadrado quadrado = criarQuadrado();
        return quadrado.area().toString();
    }

    public String quadradoPerimetro(){
        Quadrado quadrado = criarQuadrado();
        return quadrado.perimetro().toString();
    }

    public String quadradoMensagemIdentificado(){
        Quadrado quadrado = criarQuadrado();
        return quadrado.mensagem() + " " + quadrado.getClass().toString();
    }

    // Circulos
    public String circuloArea(){
        Circulo circulo = criarCirculo();
        return circulo.area().toString();
    }

    public String circuloPerimetro(){
        Circulo circulo = criarCirculo();
        return circulo.perimetro().toString();
    }

    public String circuloMensagemIdentificado(){
        Circulo circulo = criarCirculo();
        return circulo.mensagem() + " " + circulo.getClass().toString();
    }
    
}
