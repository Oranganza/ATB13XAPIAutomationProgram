package ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab12_Head_Request {

    RequestSpecification r; //pre-request given part
    Response response; //making the request when
    ValidatableResponse vr; // Post-request then

    @Test
    public void test_Get_NonBDD()
    {
        //Part 1
        String pincode = "400008";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode) ;

        //Part 2
        response = r.when().log().all().get();

        //Part 3
        vr = response.then().log().all();
        vr.statusCode(200);
    }

    @Test
    public void test_Get_NonBDD_Negative()
    {
        //Given
        String pincode = " @ ";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode) ;

        //When
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //Then
        vr = response.then().log().all();
        vr.statusCode(404);
    }

}
