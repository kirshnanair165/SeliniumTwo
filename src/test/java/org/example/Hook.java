package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hook extends Utils{
    DriverManger driverManger= new DriverManger();

    @Before
    public void setUp(){
        driverManger.openBrowser();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            scenario.attach(screenshot, "image/png", screenshotName); //stick it in the report
        }
        driverManger.closeBrowser();
    }

}
