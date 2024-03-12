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

        String actual = new CarroEconomico("Celta").toString();

        given()
          .when().get("/exercicio/carroEconomicoAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    @Test
    @Order(2)
    void testCarroEconomicoPrecoDiariaAsString() {

        String actual = "105,00";

        given()
          .when().get("/exercicio/carroEconomicoPrecoDiariaAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    @Test
    @Order(3)
    void testCarroEconomicoPrecoDiariaAlteradoAsString() {

        String actual = "210,00";

        given()
          .when().get("/exercicio/carroEconomicoPrecoDiariaAlteradoAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    
    // CarroIntermediario
    @Test
    @Order(4)
    void testCarroIntermediarioAsString() {

        String actual = new CarroIntermediario("HB20").toString();

        given()
          .when().get("/exercicio/carroIntermediarioAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }

    @Test
    @Order(5)
    void testCarroIntermediarioPrecoDiariaAsString() {

        String actual = "110,00";

        given()
          .when().get("/exercicio/carroIntermediarioPrecoDiariaAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }


    // MainRotinas
    @Test
    @Order(6)
    void testQuantidadeObjetosCriadosAsString() {

        String actual = "5";

        given()
          .when().get("/exercicio/quantidadeObjetosCriadosAsString")
          .then()
             .statusCode(200)
             .body(is(actual));
    }
    
}
