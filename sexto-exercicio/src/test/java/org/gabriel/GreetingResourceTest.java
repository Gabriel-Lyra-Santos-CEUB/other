package org.gabriel;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testEndpoint() {
        given()
            .contentType(ContentType.JSON)
            .when()
                .get("/exercicio/myendpoint")
            .then()
                .statusCode(200);
    }

}