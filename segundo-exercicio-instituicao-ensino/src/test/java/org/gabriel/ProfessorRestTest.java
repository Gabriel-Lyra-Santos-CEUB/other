package org.gabriel;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gabriel.model.Professor;
import org.gabriel.rest.ProfessorRest;

@QuarkusTest
class ProfessorRestTest {

    @Test
    void getAsStringTest() {
      Professor professor1 = new Professor("João", 0, 4, 730.30);

        given()
          .when().get("/professor/getAsString")
          .then()
             .statusCode(200)
             .body(is(professor1.toString()));
    }

    @Test
    void getNomeTest() {
        Professor professor1 = new Professor("João", 0, 2, 730.30);

        given()
          .when().get("/professor/getNome")
          .then()
             .statusCode(200)
             .body(is(professor1.getNome()));
    }

    @Test
    void getProfessoresAsStringTest() {
      Professor professor1 = new Professor("João", 0, 2, 730.30);
      Professor professor2 = new Professor("Pedro", 2);
      Professor professor3 = new Professor();
      Professor professor4 = Professor.builder()
          .nome("Carlos")
          .qtd_turma(4)
          .build();
        
        given()
          .when().get("/professor/getProfessoresAsString")
          .then()
             .statusCode(200)
             .body(is(professor1.toString() + professor2.toString() + professor3.toString() + professor4.toString()));
    }

    @Test
    void getRendimentoTest() {

        Double expected = 1460.60;

        ProfessorRest rest = new ProfessorRest();
        Professor professor1 = new Professor("João", 0, 2, 730.30);

        given()
          .when().get("/professor/getRendimento")
          .then()
             .statusCode(200);

        assertEquals(expected, rest.rendimento(professor1));
    }

}