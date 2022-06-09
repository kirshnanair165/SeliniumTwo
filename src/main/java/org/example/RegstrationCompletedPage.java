package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class RegstrationCompletedPage extends Utils{
    private By _registercontinuebutton = By.xpath("//div/a[@class=\"button-1 register-continue-button\"]");
    private By _registrationResult = By.className("result");

    public void userVerifyTheRegstrationSucessfull()
    {
       LoadProp loadProp=new LoadProp();
       //verifying the registration is successful
        String actualMessage = driver.findElement(_registrationResult).getText();
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedMessageforRegstration"),"regstration not complected");
        driver.findElement(_registercontinuebutton).click();


    }
}
