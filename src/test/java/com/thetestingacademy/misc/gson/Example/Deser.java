package com.thetestingacademy.misc.gson.Example;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Deser {


    @Test
    public void DeSerializationTest()
    {

        String jsonString = "{\r\n" + " \"firstName\":\"Pramod\", \r\n" +"\"lastName\": \"Dutta\",\r\n"
                +"gender\": \"M\",\r\n" + " \"age\": 31, \r\n" +"\"salary\": 3422.33, \r\n" +"married\" false\r\n" + "}";

        Gson gson = new Gson();
        Employee employeeobj = gson.fromJson(jsonString, Employee.class);

        String firstname = employeeobj.getFirstname();
        String lastname = employeeobj.getLastname();


        Assert.assertEquals(firstname,"Pramod");




    }
}
