package ex_03_testNg_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab04_testcase {

    String pincode;

    @Test
    //valid pincode
    public void test_tc1_pincode_valid()
    {
        pincode = "400008";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
    // Special character - @, # $
    @Test
    public void test_tc2_pincode_Invalid()
    {
        pincode = "@";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
    // Blank Space = " "
    @Test
    public void test_tc3_pincode_Invalid()
    {
        pincode = " ";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
