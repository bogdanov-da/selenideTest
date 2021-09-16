import io.restassured.RestAssured;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("api")
public class ApiTest {
    @Test
    void name() {
        RestAssured.given().log().all().get("https://demoqa.com/BookStore/v1/Books");
        System.out.println("EEEEE");
    }
}
