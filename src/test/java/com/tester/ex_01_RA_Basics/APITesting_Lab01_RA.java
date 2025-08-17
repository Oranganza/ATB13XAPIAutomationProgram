package com.tester.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab01_RA {

    public static void main(String[] args)
    {
        //Gherkin syntax
        //Given() - pre req. - url, Headers, Auth, body....
        // When() - HTTP method? - Get/Post/Patch/Put...
        //Then() - Validation -200K, firstname == pramod

        //Full Url -> https://api.zippopotam.us/IN/400001
        // Base Url -> https://api.zippopotam.us
        // Bath Path -> /IN/400001

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode!");
        String pincode = sc.next();

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }
}
