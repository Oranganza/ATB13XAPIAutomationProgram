package ex_06_TestAssertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class APITesting_Lab25_RestAssured_Testng_AssertJ_Assertions {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer bookingId;

    @Test
    public void test_createBooking_post() {

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

        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname", Matchers.equalTo("Pramod"));
        vr.body("booking.lastname", Matchers.equalTo("Brown"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));

        //Testng - Extract the details of firstname , last name, bookingid, depositepaid
        bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        //Another mechanism to extract Json, value by JSON path

        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingID1 = jsonPath.getString("bookingId");

        // Testng assertion = 75%
        // Soft Assertion vs hard assertion(90%)
        // This means any assertion fail,
        // the remaining statement in that test method will not executed.

        Assert.assertEquals(firstname, "Pramod");
        Assert.assertEquals(lastname, "Brown");
        Assert.assertNotNull(bookingId);

        //AssertJ (3rd - lib, assertion) 20%

        assertThat(bookingId).isNotNegative().isNotZero().isPositive();
        assertThat(firstname).isNotBlank().isNotNull().isNotEmpty().isEqualTo();

    }
}
