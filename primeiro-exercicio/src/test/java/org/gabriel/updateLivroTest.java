package org.gabriel;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class updateLivroTest {
    
    @Test
    void updatePrecolivro() {

        Integer testID = 1;

        given()
          .pathParam("testID", testID)
          .when().get("/updateLivro/{testID}/updatePreco")
          .then()
             .statusCode(200);
    }

    @Test
    void updatePorcentagemlivro() {

        Integer testID = 2;

        given()
          .pathParam("testID", testID)
          .when().get("/updateLivro/{testID}/updatePorcentagem")
          .then()
             .statusCode(200);
    }
}
