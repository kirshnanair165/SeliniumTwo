package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    DriverManger driverManger = new DriverManger();

    @BeforeMethod

    public void setup(){
        driverManger.openBrowser();

    }

        @AfterMethod
    public void tearDown(ITestResult result){

        if (result.isSuccess()){

            takeSnapShot(result.getName());
        }

        driverManger.closeBrowser();
        }


    }

