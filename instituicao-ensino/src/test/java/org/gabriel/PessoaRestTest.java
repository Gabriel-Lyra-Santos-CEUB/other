package org.gabriel;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.gabriel.model.Pessoa;

@QuarkusTest
class PessoaRestTest {
    @Test
    void getPessoaAsStringTest() {

        Pessoa pessoa1 = new Pessoa("Gabriel", 0);

        given()
          .when().get("/pessoa/getAsString")
          .then()
             .statusCode(200)
             .body(is(pessoa1.toString()));
    }

}