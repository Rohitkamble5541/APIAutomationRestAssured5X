package com.thetestingacademy.tests.crud.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBddDelete {



    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse ;

    String token = "YWRtaW46cGFzc3dvcmQxMjM";


    @Test
    public void testdeleteRequest()
    {

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/1679");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);





        Response responce = requestSpecification.when().delete();


        // Get Validateble response to Perform validation
        validatableResponse = responce.then().log().all();
        validatableResponse.statusCode(201);
//        validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
//        validatableResponse.body("lastname", Matchers.equalTo("Brown"));






    }






}
