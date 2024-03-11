package org.gabriel.rest;

import org.gabriel.models.realClass.CarroEconomico;
import org.gabriel.models.realClass.CarroIntermediario;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyMainRestTest {

    // CarroEconomico
    @Test
    @Order(1)
    void testCarroEconomicoAsString() {

        CarroEconomico carroEconomico = new CarroEconomico("Celta");
        String actual = new CarroEconomico("Celta").toString();

        System.out.println("Testando testCarroEconomicoAsString: " + carroEconomico.toString());

        given()
          .when().get("/exercicio/carroEconomicoAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    @Test
    @Order(2)
    void testCarroEconomicoPrecoDiariaAsString() {

        CarroEconomico carroEconomico = new CarroEconomico("Celta");
        String actual = new CarroEconomico("Celta").getPrecoBaseLocacao().toString();

        System.out.println("Testando testCarroEconomicoPrecoDiariaAsString: " + carroEconomico.toString());

        given()
          .when().get("/exercicio/carroEconomicoPrecoDiariaAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    
    // CarroIntermediario
    @Test
    @Order(3)
    void testCarroIntermediarioAsString() {

        CarroIntermediario carroIntermediario = new CarroIntermediario("HB20");
        String actual = new CarroIntermediario("HB20").toString();

        System.out.println("Testando testCarroIntermediarioAsString: " + carroIntermediario.toString());

        given()
          .when().get("/exercicio/carroIntermediarioAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    @Test
    @Order(4)
    void testCarroIntermediarioPrecoDiariaAsString() {

        CarroIntermediario carroIntermediario = new CarroIntermediario("HB20");
        String actual = new CarroIntermediario("HB20").getPrecoBaseLocacao().toString();

        System.out.println("Testando testCarroIntermediarioPrecoDiariaAsString: " + carroIntermediario.toString());

        given()
          .when().get("/exercicio/carroIntermediarioPrecoDiariaAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }


    // MainRotinas
    @Test
    @Order(5)
    void testQuantidadeObjetosCriadosAsString() {

        String actual = "4";

        System.out.println("Testando testQuantidadeObjetosCriadosAsString");

        given()
          .when().get("/exercicio/quantidadeObjetosCriadosAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }
    
}
