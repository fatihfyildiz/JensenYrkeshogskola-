package org.example.JUnit_Lektioner9_10.Lektion11_27_11_23;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class UserApiIntegrationTest {

    @Test
    public void testApiFetchUser_ONE() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users/1")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Leanne Graham"))
                .body("email", equalTo("Sincere@april.biz"));
    }

    @Test
    public void testApiFetchUser_TWO() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users/2")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Ervin Howell"))
                .body("email", equalTo("Shanna@melissa.tv"));
    }

    @Test
    public void testApiÖvning1() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/posts/1")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void testApiÖvning2() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/posts/1")
                .then().assertThat().statusCode(200)
                .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }

    @Test
    public void testApiÖvning3() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .pathParam("userId",1)
                .when().get("/users/{userId}")
                .then().assertThat().statusCode(200);
    }

}
