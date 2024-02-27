package org.gabriel;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.gabriel.model.Livro;

@QuarkusTest
class getLivroTest {
    
    @Test
    void getLivros() {

        Integer testID = 1;

        Livro livro1 = new Livro("harry potter", "j.k", 123, 132.4);
        Livro livro2 = new Livro("adabas", "percy", 537);

        given()
          .pathParam("testID", testID)
          .when().get("/getLivro/{testID}/asString")
          .then()
             .statusCode(200)
             .body(is("livro 1: " + livro1.toString() + " livro 2: " + livro2.toString()));
    }

    @Test
    void getLivrosTituloNull() {

        Integer testID = 2;

        given()
          .pathParam("testID", testID)
          .when().get("/getLivro/{testID}/asString")
          .then()
             .statusCode(500);
    }

}