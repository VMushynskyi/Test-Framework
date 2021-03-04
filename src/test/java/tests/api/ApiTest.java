package tests.api;

import framework.api.models.Book;
import framework.api.service.BookServices;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.BaseApi;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ApiTest extends BaseApi {

    private BookServices bookServices;

    @AfterTest
    public void initBookServices() {
        bookServices = new BookServices();
    }

    @Test
    @Parameters("title")
    public void testGetBookTitle(String title) {
        System.out.println(bookServices.getBookTile("1"));
        assertThat(bookServices.getBookTile("1")).isEqualTo(title);
    }

    @Test
    public void testGetAllBook() {
        System.out.println(bookServices.getAllBooks().size());
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
