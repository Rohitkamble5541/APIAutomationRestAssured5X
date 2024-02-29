package com.thetestingacademy.tests.crud.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDPUT {


    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse ;

    String token = "YWRtaW46cGFzc3dvcmQxMjM";



    @Test
    public void testPutRequest()
    {
        // URL
        // Authentication - Token -> 27d1b53d403b640 , Headers - json
        // id -> 4635
        // payload

        String payload = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/1019");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.body(payload).log().all();


        // Calling PUT Method on URL . After hitting we get Responce

        Response responce = requestSpecification.when().put();


        // Get Validateble response to Perform validation
        validatableResponse = responce.then().log().all();
        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("lastname", Matchers.equalTo("Brown"));













    }
}
