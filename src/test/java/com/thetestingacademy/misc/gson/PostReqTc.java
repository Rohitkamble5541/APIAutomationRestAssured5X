package com.thetestingacademy.misc.gson;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.thetestingacademy.misc.gson.Example.BookingResponse;
import com.thetestingacademy.misc.gson.Example.Employee;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class PostReqTc {



    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse ;
    @Test

    public void testpositive()
    {
        // Step1 - POST
        // URL -> Base URL + Base Path
        // HEADERS
        // BODY
        // Auth - NO



        // Step 2
        // Prepare the Payload (Object -> JSON String )
        // Send the request




        // Step 3
        // Validate Response (JSON String -> Object)
        // FirstName,
        // StatusCode
        // Time Response time


        // Prepare your Payload
        Faker faker = new Faker();
        Booking booking = new Booking();
        String expectFirstName = faker.name().firstName();
        booking.setFirstname(expectFirstName);
        //booking.setFirstname("Pramod");
        //booking.setFirstname(faker.name().firstName());
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        // Object -> JSON String (GSON)
        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);






        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonStringBooking).log().all();



        Response response = requestSpecification.when().post();
        String jsonResponseString = new response.asString();



        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);



        // Validate Response (JSON String -> Object)
        BookingResponse bookingResponseObject = gson.fromJson(jsonResponseString, BookingResponse.class);

        assertThat(bookingResponseObject.getBookingid()).isNotNull();
        assertThat(bookingResponseObject.getBookingid().getFirstname()).isEqualTo(expectFirstName);



        // Request Payload - Response - - 3 Class
        //1.Booking -> Bookingdates
        //2. Response - BookingResponse - Booking







    }
}
