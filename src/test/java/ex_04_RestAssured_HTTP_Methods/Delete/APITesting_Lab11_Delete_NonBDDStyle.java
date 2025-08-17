package ex_04_RestAssured_HTTP_Methods.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab11_Delete_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_delete_nonBdd()
    {
        String BookingId = "792";
        String token = "ced4b5a11d1674c";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("booking/" +BookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);


        response = r.when().log().all().delete();

        vr= response.then().log().all();
        vr.statusCode(201);

    }
}
