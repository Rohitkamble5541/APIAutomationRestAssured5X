package com.thetestingacademy.tests.crud.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBddPatch {



    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse ;

    String token = "YWRtaW46cGFzc3dvcmQxMjM";


    @Test
    public void testpatchRequest()
    {
        String payloadpatch = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";





        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/1019");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);



        // Patch Request
        requestSpecification.body(payloadpatch).log().all();

        Response responce = requestSpecification.when().patch();


        // Get Validateble response to Perform validation
        validatableResponse = responce.then().log().all();
        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("lastname", Matchers.equalTo("Brown"));






    }






}
