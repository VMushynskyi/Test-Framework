package tests.api;

import framework.api.models.Book;
import framework.api.steps.BookSteps;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ApiTest extends BaseApi {

    @Test
    public void testGetBookTitle() {
        BookSteps bookSteps = new BookSteps();
        System.out.println(bookSteps.getBookTile(1, getRequestSpecification()));
        assertThat(bookSteps.getBookTile(1, getRequestSpecification())).isEqualTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
    }

    @Test
    public void testGetAllBook() {
        BookSteps bookSteps = new BookSteps();
        System.out.println(bookSteps.getAllBooks(getRequestSpecification()).size());
        assertThat(bookSteps.getAllBooks(getRequestSpecification()).size()).isEqualTo(100);
    }

    @Test
    public void testPostBook() {
        BookSteps bookSteps = new BookSteps();
        bookSteps.createBook(new Book(101, "Heroes", "hello test", 1), getRequestSpecification());
    }

    @Test
    public void testGetSpecificBook() {
        BookSteps bookSteps = new BookSteps();
        assertThat(bookSteps.getBookTile(101, getRequestSpecification())).isEqualTo("Heroes");
    }

    @Test
    public void testPatchBook() {
        BookSteps bookSteps = new BookSteps();
        bookSteps.updateBookTitle(101, getRequestSpecification(), "New Heroes");
    }

    @Test
    public void testDeleteBook() {
        BookSteps bookSteps = new BookSteps();
        bookSteps.deleteBook(101, getRequestSpecification());
    }
}
