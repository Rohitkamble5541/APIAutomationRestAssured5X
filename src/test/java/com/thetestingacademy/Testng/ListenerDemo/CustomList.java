package com.thetestingacademy.Testng.ListenerDemo;

import org.testng.IExecutionListener;
import org.testng.ISuiteListener;

public class CustomList implements IExecutionListener , ISuiteListener {


    @Override
    public void onExecutionStart() {

        // Excel File Read , JSON File , Allure Report Start , Reporting , Logs Starting
        long endTime = System.currentTimeMillis();
        System.out.println("**** *** Started Execution at - " + endTime + "**** ***");

        // Email to QA lead automation started!!

    }

    @Override
    public void onExecutionFinish() {

        long startTime = System.currentTimeMillis();
        System.out.println("**** *** Finished Execution at - " + startTime + "**** ***");

        // Send Email to QA Lead
        // Write Java Code to Write the Email to QA lead
    }
}


