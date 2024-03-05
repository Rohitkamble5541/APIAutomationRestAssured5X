package com.thetestingacademy.misc.gson.Example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.annotations.Test;

public class Simpleser {

    //            {
//                   "firstname" : "Pramod" ,
//                   "lastname" : "Dutta",
//                  "gender" : "M" ,
//                  "age" : "31",
//                   "salary" : "500.00",
//                    "married" : "false"
//                }


    @Test

        public void test1()
        {
            // Object -> JSON String - Ser (Client -> Server)  Ser manner -1

            Employee employee = new Employee();
            employee.setFirstname("Pramod");
            employee.setLastname("Dutta");
            employee.setAge(31);
            employee.setSalary(500);
            employee.setMarried(false);
            employee.setGender("Male");


            // Create a Gson object

            Gson gson = new Gson();
            String jsonEmployee = gson.toJson(employee);
            System.out.println(jsonEmployee);

            Gson gsonbuilder = new GsonBuilder().setPrettyPrinting().create();
            String employeeJsonStringUsingJsonBuilder = gsonbuilder.toJson(employee);
            System.out.println("Pretty JSON String:- ");
            System.out.println(employeeJsonStringUsingJsonBuilder);







        }



}
