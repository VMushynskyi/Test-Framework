package tests.api;

import framework.api.models.Book;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ApiTest extends BaseApiTest {

    @Test
    public void testGetBookTitle() {
        assertThat(bookServices.getBookTile("1")).contains("sunt aut");
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
    public void testPatchBook() {
        bookServices.updateBookTitle("27", "New Heroes");
    }

    @Test
    public void testGetSpecificBook() {
        assertThat(bookServices.getBookTile("27")).contains("quasi id");
    }

    @Test
    public void testDeleteBook() {
        bookServices.deleteBook("1");
    }
}
