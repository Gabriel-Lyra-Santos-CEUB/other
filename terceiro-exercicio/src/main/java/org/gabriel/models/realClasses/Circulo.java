package org.gabriel.models.realClasses;

import org.gabriel.models.abstractClass.FormaGeometrica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Circulo extends FormaGeometrica {

    private Double raio;

    @Override
    public Double area() {
        return Math.PI;
    }

    @Override
    public Double perimetro() {
        return 4 * Math.PI * this.raio;
    }
    
}
