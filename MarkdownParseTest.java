import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void TestParseOne() throws IOException {
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        List<String> testList = List.of("https://something.com", "some-page.html");
        assertEquals("test one", testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void TestParseTwo() throws IOException {
        Path fileName = Path.of("test.md");
	    String contents = Files.readString(fileName);
        List<String> testList = List.of("fail");
        assertEquals("test two", testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void TestParseThree() throws IOException {
        Path fileName = Path.of("test2.md");
	    String contents = Files.readString(fileName);
        List<String> testList = List.of("hello.html");
        assertEquals("test three", testList, MarkdownParse.getLinks(contents));
    }
}
