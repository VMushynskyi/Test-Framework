package framework.api.service;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static framework.api.constants.Endpoints.POSTS;
import static framework.api.constants.Endpoints.TITLE_QUERY;
import static framework.utils.properties.PropertiesManager.getBaseApiURI;
import static framework.utils.properties.PropertiesManager.getPostsEndpoint;
import static io.restassured.RestAssured.given;

public class BaseServiceMethods {

    public static RequestSpecification requestSpecification;

    public static RequestSpecification getRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(getBaseApiURI())
                .setContentType(ContentType.JSON)
                .build();
        return requestSpecification;
    }

    public static Response getPostsById(String id) {
        return given()
                .spec(requestSpecification)
                .get(getPostsEndpoint() + id);
    }

    public static Response getPosts() {
        return given()
                .spec(requestSpecification)
                .when()
                .get(getPostsEndpoint());
    }

    public static Response post(Object bodyData) {
        return given()
                .spec(requestSpecification)
                .body(bodyData)
                .post(getPostsEndpoint());
    }

    public static Response patch(String id, String title) {
        return given()
                .spec(requestSpecification)
                .patch(getPostsEndpoint() + id + TITLE_QUERY + title);
    }

    public static Response delete(String id) {
        return given()
                .spec(requestSpecification)
                .delete(getPostsEndpoint() + id);
    }
}
