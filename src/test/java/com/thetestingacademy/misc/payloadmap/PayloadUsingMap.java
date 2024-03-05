package com.thetestingacademy.misc.payloadmap;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class PayloadUsingMap {


        RequestSpecification requestSpecification;
        ValidatableResponse validatableResponse ;

    //String token = "YWRtaW46cGFzc3dvcmQxMjM";


    @Test
    public void testPOSTRequest()
    {

//        String payload = "{\n" +
//                "    \"firstname\" : \"Pramod\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";

        // Hashmap

        // Json payload -> Map -> Contain Further map also
        Map<String,Object> jsonbodyUsingMap = new LinkedHashMap<>();
        Faker faker = new Faker();

        String name = faker.name().fullName();


        jsonbodyUsingMap.put("firstname" ,faker.name().firstName());
        jsonbodyUsingMap.put("lastname" , faker.name().lastName());
        jsonbodyUsingMap.put("totalprice" , faker.random().nextInt(1000));
        jsonbodyUsingMap.put("depositpaid" , faker.random().nextBoolean());


        Map<String,Object> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin","2018-01-01");
        bookingdatesMap.put("checkout","2019-01-01");

        jsonbodyUsingMap.put("bookingdates",bookingdatesMap);
        jsonbodyUsingMap.put("additionalneeds","Breakfast");


        System.out.println(jsonbodyUsingMap);
        // "" - Map -> Json





        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonbodyUsingMap).log().all();



        Response responce = requestSpecification.when().post();

        Integer bookingId = responce.then().extract().path("bookingid");


        // Get Validateble response to Perform validation
        validatableResponse = responce.then().log().all();
        validatableResponse.statusCode(200);
        System.out.println("Your Booking id is :->  " + bookingId);


    }
}
