package ex_06_TestAssertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

public class APITesting_Lab23_RestAssured_Assertions {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer bookingId;

    @Test
    public void test_createBooking_post()
    {

        // 1. Payload
        // 2. given: Setting upp the body, url, basepath, uri
        // 3. when : making the req
        // 4. then : extraction

        String request_payload = "{\n" +
                "        \"firstname\": \"Pramod\",\n" +
                "        \"lastname\": \"Brown\",\n" +
                "        \"totalprice\": 111,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2018-01-01\",\n" +
                "            \"checkout\": \"2019-01-01\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Breakfast\"\n" +
                "    }";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");

        //Header information
        r.contentType(ContentType.JSON);
        r.body(request_payload).log().all();

        response = r.when().log().all().post();



        // Get Validate response to perform validation

        vr = response.then().log().all();


        vr.statusCode(200);

        //Booking id != null, firstname == pramod
        // extract the response body and do it
        //RestAssured assertion

        //System.out.println(response.asString());
        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname", Matchers.equalTo("Pramod"));
        vr.body("booking.lastname", Matchers.equalTo("Brown"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));
    }
}
