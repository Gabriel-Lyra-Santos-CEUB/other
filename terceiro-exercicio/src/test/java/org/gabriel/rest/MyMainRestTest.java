package org.gabriel.rest;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.gabriel.models.realClasses.Circulo;
import org.gabriel.models.realClasses.Quadrado;
import org.gabriel.rotinas.MainRotinas;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MyMainRestTest {

    @Inject
    MainRotinas exercicioMain;
    
    // Quadrado Tests
    @Test
    @Order(1)
    void testQuadradoArea() {

        Quadrado quadrado = new Quadrado(5.5);
        Double actual = quadrado.getLado();

        System.out.println("Testando testQuadradoArea: " + quadrado.area().toString());

        given()
          .when().get("/exercicio/quadradoArea")
          .then()
             .statusCode(200)
             .body(is(actual.toString()));
    }

    @Test
    @Order(2)
    void testQuadradoPerimetro() {
        
        Quadrado quadrado = new Quadrado(5.5);
        Double actual = 4.0;

        System.out.println("Testando testQuadradoPerimetro: " + quadrado.perimetro().toString());

        given()
          .when().get("/exercicio/quadradoPerimetro")
          .then()
             .statusCode(200)
             .body(is(actual.toString()));
    }

    @Test
    @Order(3)
    void testQuadradoMensagemIdentificado() {
        
        Quadrado quadrado = new Quadrado(5.5);
        String actual = quadrado.mensagem() + " " + quadrado.getClass().toString();

        System.out.println("Testando testQuadradoMensagemIdentificado: " + quadrado.mensagem() + " " + quadrado.getClass().toString());

        given()
          .when().get("/exercicio/quadradoMensagemIdentificado")
          .then()
             .statusCode(200)
             .body(is(actual));
    }


    // Circulo Tests
    @Test
    @Order(4)
    void testCirculoArea() {

        Circulo circulo = new Circulo(5.5);
        Double actual = Math.PI;

        System.out.println("Testando testCirculoArea: " + circulo.area().toString());

        given()
          .when().get("/exercicio/ciculoArea")
          .then()
             .statusCode(200)
             .body(is(actual.toString()));
    }

    @Test
    @Order(5)
    void testCiculoPerimetro() {
        
        Circulo circulo = new Circulo(5.5);
        Double actual = 4 * Math.PI * circulo.getRaio();

        System.out.println("Testando testCiculoPerimetro: " + circulo.perimetro().toString());

        given()
          .when().get("/exercicio/ciculoPerimetro")
          .then()
             .statusCode(200)
             .body(is(actual.toString()));
    }

    @Test
    @Order(6)
    void testCiculoMensagemIdentificado() {
        
        Circulo circulo = new Circulo(5.5);
        String actual = circulo.mensagem() + " " + circulo.getClass().toString();

        System.out.println("Testando testCiculoMensagemIdentificado: " + circulo.mensagem() + " " + circulo.getClass().toString());

        given()
          .when().get("/exercicio/circuloMensagemIdentificado")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    @Test
    @Order(7)
    void testQuantidadeObjetosCriados() {
        
        String actual = "6";
        System.out.println("Testando testQuantidadeObjetosCriados");

        given()
          .when().get("/exercicio/quantidadeObjetosCriados")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    //@Test
    //void testQuantidadeObjetosCriados() {
    //    Integer actual = 6;
    //    System.out.println("Testando testQuantidadeObjetosCriados: " + this.exercicioMain.getQtdFiguras());
    //    assertEquals(this.exercicioMain.getQtdFiguras(), actual);
    //}

}