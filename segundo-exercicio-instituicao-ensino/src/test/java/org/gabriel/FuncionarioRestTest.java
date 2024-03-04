package org.gabriel;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gabriel.model.Funcionario;
import org.gabriel.rest.FuncionarioRest;

@QuarkusTest
class FuncionarioRestTest {

    @Test
    void getFuncionarioesAsStringTest() {
        Funcionario funcionario1 = new Funcionario("Gabriel", 3, 5600.50);
        Funcionario funcionario2 = new Funcionario("João", 2);
        Funcionario funcionario3 = new Funcionario();
        
        given()
          .when().get("/funcionario/getFuncionariosAsString")
          .then()
             .statusCode(200)
             .body(is(funcionario1.toString() + funcionario2.toString() + funcionario3.toString()));
    }

    @Test
    void getRendimentoTest() {

        Double expected = 5900.50;

        FuncionarioRest rest = new FuncionarioRest();
        Funcionario funcionario1 = new Funcionario("Gabriel", 3, 5600.50);

        given()
          .when().get("/funcionario/getSalarioTotal")
          .then()
             .statusCode(200);

        assertEquals(expected, rest.calculaSalarioTotal(funcionario1));
    }

}