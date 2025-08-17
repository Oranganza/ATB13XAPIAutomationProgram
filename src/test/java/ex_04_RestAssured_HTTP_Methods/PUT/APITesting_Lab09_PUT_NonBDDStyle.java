package ex_04_RestAssured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab09_PUT_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_put_nonBdd()
    {
        String BookingId = "792";
        String token = "ced4b5a11d1674c";
        String payload = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("booking/" +BookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().put();

        vr= response.then().log().all();
        vr.statusCode(200);

    }
}
