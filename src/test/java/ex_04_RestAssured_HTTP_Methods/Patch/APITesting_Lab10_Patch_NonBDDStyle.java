package ex_04_RestAssured_HTTP_Methods.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab10_Patch_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_patch_nonBdd()
    {
        String BookingId = "792";
        String token = "ced4b5a11d1674c";
        String payload = "{\n" +
                "    \"firstname\" : \"Joy\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("booking/" +BookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();

        vr= response.then().log().all();
        vr.statusCode(200);

    }
}
