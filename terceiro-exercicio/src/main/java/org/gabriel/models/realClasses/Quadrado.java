package org.gabriel.models.realClasses;

import org.gabriel.models.abstractClass.FormaGeometrica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Quadrado extends FormaGeometrica {

    private Double lado;

    @Override
    public Double area() {
        return this.lado;
    }

    @Override
    public Double perimetro() {
        return 4.0;
    }
    
}
