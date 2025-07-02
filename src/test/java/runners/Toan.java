package runners;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.devtools.v136.fetch.model.AuthChallengeResponse;

import static io.restassured.RestAssured.given;
public class Toan {
    public static void main(String[] args) {

        Response resp=given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://nightly2.eng.mcu.local:5334");
        System.out.println("hellow");
    }
}

