package framework.api.steps;

import framework.api.models.Book;
import io.qameta.allure.Step;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BookSteps {

    @Step("Get book with {0} id")
    public String getBookTile(int bookId, RequestSpecification requestSpecification) {
        return given()
                .spec(requestSpecification)
                .when()
                .get("posts/" + bookId)
                .then()
                .extract()
                .body()
                .jsonPath()
                .getObject("", Book.class)
                .getTitle();
    }

    @Step("Get all book")
    public List<Book> getAllBooks(RequestSpecification requestSpecification) {
        return given()
                .spec(requestSpecification)
                .when()
                .get("posts")
                .then()
                .extract()
                .body()
                .jsonPath()
                .getList("", Book.class);
    }

    @Step("Post book {0}")
    public void createBook(Book book, RequestSpecification requestSpecification) {
        given()
                .spec(requestSpecification)
                .body(book)
                .post("posts")
                .then()
                .assertThat()
                .statusCode(201);
    }

    @Step("Patch book with {0} id and {2}")
    public void updateBookTitle(int id, RequestSpecification requestSpecification, String title) {
        given()
                .spec(requestSpecification)
                .patch("posts/"+id+"?title="+title)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("Delete book with {0} id")
    public void deleteBook(int id, RequestSpecification requestSpecification) {
        given()
                .spec(requestSpecification)
                .delete("posts/"+id)
                .then()
                .assertThat()
                .statusCode(200);
    }
}
