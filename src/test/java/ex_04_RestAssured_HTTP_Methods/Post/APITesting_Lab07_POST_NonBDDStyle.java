package ex_04_RestAssured_HTTP_Methods.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab07_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_POST_NONBDDStyle_Create_Token()
    {
        //URL - https://restful-booker.herokuapp.com/auth
        //Payload - {
        //            "username" : "admin",
        //                "password" : "password123"
        //        }
        //  Header - Content-Type: application/json
        // Auth - NA
        // Cookie - NA
        // Validate - 200K
        // body Response - Token is created or not

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";


        System.out.println("------Part 1--------");

        // Part 1 - Pre-condition - Preparing request - URL, Headers, Auto....
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("------Part 2--------");
        //Making Http request
        response = r.when().log().all().post();

        System.out.println("------Part 3--------");
        //Verification Part
        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
