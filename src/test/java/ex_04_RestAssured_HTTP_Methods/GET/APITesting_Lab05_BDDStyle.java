package ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab05_BDDStyle {

    @Test
    public void GET_Request()
    {
        String pincode= "400008";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }
}
