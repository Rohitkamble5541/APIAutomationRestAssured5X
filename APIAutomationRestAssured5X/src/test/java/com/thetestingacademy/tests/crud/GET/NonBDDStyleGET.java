package com.thetestingacademy.tests.crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGET {
    // GET Request
    // BDD Style and Non BDD Style


    // GIVEN WHEN THEN ()

    public static void main(String[] args) {

    // https://restful-booker.herokuapp.com/booking/1

        RequestSpecification r = RestAssured.given();


        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/5007").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);


        // Testing Framework -> Allow us to execute the test cases
        // 1 main -> it will execute all the test cases that we have mentioned






    }
}
