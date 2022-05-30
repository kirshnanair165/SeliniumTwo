package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class RegstrationCompletedPage extends Utils{

    public void userVerifyTheRegstrationSucessfull(){

        String expectedMessage = "Your registration completed";

        String actualMessage = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(actualMessage,expectedMessage,"regstration not complected");


        driver.findElement(By.xpath("//div/a[@class=\"button-1 register-continue-button\"]")).click();


    }
}
