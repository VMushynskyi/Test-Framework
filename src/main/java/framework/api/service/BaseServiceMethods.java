package framework.api.service;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static framework.api.constants.Parameters.POSTS;
import static framework.api.constants.Parameters.TITLE_QUERY;
import static framework.utils.properties.PropertiesManager.getBaseApiURI;
import static io.restassured.RestAssured.given;

public class BaseServiceMethods {

    public static RequestSpecification requestSpecification;

    public static void setupRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(getBaseApiURI())
                .setContentType(ContentType.JSON)
                .build();
    }

    private static RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public static Response getPostsById(String id){
        return given()
                .spec(getRequestSpecification())
                .when()
                .get(POSTS + id);
    }

    public static Response getPosts(){
        return given()
                .spec(requestSpecification)
                .when()
                .get(String.valueOf(POSTS));
    }

    public static Response post(Object bodyData){
        return given()
                .spec(requestSpecification)
                .body(bodyData)
                .post(String.valueOf(POSTS));
    }

    public static Response patch(String id, String title){
        return given()
                .spec(requestSpecification)
                .patch(POSTS + id + TITLE_QUERY + title);
    }

    public static Response delete(String id){
        return given()
                .spec(requestSpecification)
                .delete(POSTS + id);
    }
}
