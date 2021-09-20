import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("api")
@Epic("ApiTest")
@Feature("bookStore api test")
public class ApiTest {
    @Test
    void name() {
        RestAssured.given().log().all().get("https://demoqa.com/BookStore/v1/Books");
        System.out.println("EEEEE");
    }

    
}
