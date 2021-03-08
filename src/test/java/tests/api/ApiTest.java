package tests.api;

import framework.api.models.Book;
import framework.api.service.BookServices;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ApiTest {

    private BookServices bookServices;

    @BeforeTest
    public void initBookServices() {
        bookServices = new BookServices();
    }

    @Test
    public void testGetBookTitle() {
        assertThat(bookServices.getBookTile("1")).isEqualTo("");
    }

    @Test
    public void testGetAllBook() {
        assertThat(bookServices.getAllBooks().size()).isEqualTo(100);
    }

    @Test
    public void testPostBook() {
        bookServices.createBook(new Book(101, "Heroes", "hello test", 1));
    }

    @Test
    public void testGetSpecificBook() {
        assertThat(bookServices.getBookTile("101")).isEqualTo("Heroes");
    }

    @Test
    public void testPatchBook() {
        bookServices.updateBookTitle("101", "New Heroes");
    }

    @Test
    public void testDeleteBook() {
        bookServices.deleteBook("101");
    }
}
