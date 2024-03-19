package org.gabriel.rest;

import org.gabriel.models.Conta;
import org.gabriel.models.Titular;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyMainRestTest {

  private Titular titular = new Titular("Gabriel", "Lyra", "12345678900");
  private Conta conta = new Conta(1234, 7320.0, this.titular);

  // TEST TITULAR
    @Test
    @Order(1)
    void testTitularAsString() {

      String actual = this.titular.toString();

      String response = given()
        .when().get("/exercicio/titularAsString")
        .then()
           .statusCode(200)
           .body(is(actual))
        .and()
          .extract()
          .body()
          .asString();

      System.out.println("###testTitularAsString: " + response);
      
  }

  @Test
  @Order(2)
  void testTitularNomeCompleto() {

      String actual = this.titular.nomeCompleto();

      String response = given()
        .when().get("/exercicio/titularNomeCompleto")
        .then()
         .statusCode(200)
           .body(is(actual))
        .and()
          .extract()
          .body()
          .asString();

      System.out.println("###testTitularNomeCompleto: " + response);

  }

  @Test
  @Order(3)
  void testChangeTitularName() {

      Titular titular = new Titular("Marcos", "Lyra", "12345678900");
      String actual = titular.toString();

      String response = given()
        .when().get("/exercicio/changeTitularName")
        .then()
         .statusCode(200)
           .body(is(actual))
        .and()
          .extract()
          .body()
          .asString();

      System.out.println("###testChangeTitularName: " + response);

  }

  // TEST CONTA
  @Test
  @Order(4)
  void testContaAsString() {

      String actual = conta.toString();

      String response = given()
        .when().get("/exercicio/contaAsString")
        .then()
         .statusCode(200)
           .body(not(actual))
        .and()
          .extract()
          .body()
          .asString();

      System.out.println("###testContaAsString: " + response);

  }

  // TEST CONTA E TITULAR
  @Test
  @Order(5)
  void testMemoryAddresses() {

    String response = given()
        .when().get("/exercicio/memoryAddresses")
        .then()
          .statusCode(200)
        .and()
          .extract()
          .body()
          .asString();

    System.out.println("###testMemoryAddresses: " + response);

  }

  @Test
  @Order(6)
  void testChangeTitularNameThenContaAsString() {

    String response = given()
        .when().get("/exercicio/changeTitularNameThenContaAsString")
        .then()
          .statusCode(200)
        .and()
          .extract()
          .body()
          .asString();

    System.out.println("###testChangeTitularNameThanContaAsString: " + response);

  }

  @Test
  @Order(7)
  void testChangeTitularNameThroughContaThenContaAsString() {

    String response = given()
        .when().get("/exercicio/changeTitularNameThroughContaThenContaAsString")
        .then()
          .statusCode(200)
        .and()
          .extract()
          .body()
          .asString();

    System.out.println("###testChangeTitularNameThroughContaThenContaAsString: " + response);

  }

  @Test
  @Order(8)
  void testChangeTitularNameThroughContaThenTitularAsString() {

    String response = given()
        .when().get("/exercicio/changeTitularNameThroughContaThenTitularAsString")
        .then()
          .statusCode(200)
        .and()
          .extract()
          .body()
          .asString();

    System.out.println("###changeTitularNameThroughContaThenTitularAsString: " + response);

  }

  @Test
  @Order(9)
  void testTitularThroughContaAsString() {

    String response = given()
        .when().get("/exercicio/titularThroughContaAsString")
        .then()
          .statusCode(200)
        .and()
          .extract()
          .body()
          .asString();

    System.out.println("###testTitularThroughContaAsString: " + response);

  }
    
}
