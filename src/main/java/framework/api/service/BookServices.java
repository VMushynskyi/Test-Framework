package framework.api.service;

import framework.api.models.Book;
import io.qameta.allure.Step;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static framework.api.service.BaseServiceMethods.*;

public class BookServices {

    @Step("Get book with {0} id")
    public String getBookTile(String bookId) {
        return getPostsById(bookId)
                .then()
                .extract()
                .body()
                .jsonPath()
                .getObject("", Book.class)
                .getTitle();
    }

    @Step("Get all book")
    public List<Book> getAllBooks() {
        return getPosts()
                .then()
                .extract()
                .body()
                .jsonPath()
                .getList("", Book.class);
    }

    @Step("Post book {0}")
    public void createBook(Book book) {
        post(book)
                .then()
                .assertThat()
                .statusCode(201);
    }

    @Step("Patch book with {0} id and {2}")
    public void updateBookTitle(String id, String title) {
        patch(id, title)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("Delete book with {0} id")
    public void deleteBook(String id) {
        delete(id)
                .then()
                .assertThat()
                .statusCode(200);
    }
}
