package com.thetestingacademy.tests.crud.GET;

import io.restassured.RestAssured;

public class BDDStyleGET {

    public static void main(String[] args) {

        // GET Request - https://api.zippopotam.us/in/560037
        // URL -
        // Header -
        // GET Method -
        // Base URL - https://api.zippopotam.us
        // Base Path - /in/560037
        // Payload - ? No
        // Auth - Basic , Digest , JWT , Bearer Token 2.0  ? = No
        // Status code
        // Response Body
        // Time Headers , Cookies


        // Gherkin -> Given , When , Then -> Style
        // BDD - Framework different
        // Syntax - Gherkin Syntax - (Given , when , then )
        // NON BDD and still Gherkin syntax

        // pm.test("TestCase Name ", function()
        //{

        //} -> DSL belongs Postman Testcase

        //RestAssured.given().when().then();  - DSL (JAVA)


        // Given ->
        // URL -
        // Header - ?, Cookies
        // Base URL - https://api.zippopotam.us
        // Base Path - /in/560037
        // Payload - ? No
        // Auth - Basic , Digest , JWT , Bearer Token 2.0  ? = No


        // When ->
        // Payload - ? No / YES -> JSON , XML  -> String , Hashmap  , Object Class
        // GET Method -


        // Then ->
        // Response
        // Validation
        // Status code
        // Response Body
        // Time Headers , Cookies


        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/560037")

                .when().log().all()
                .get()

                .then().log().all().statusCode(201);


    }



}
