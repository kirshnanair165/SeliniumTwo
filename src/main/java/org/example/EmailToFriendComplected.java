package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailToFriendComplected extends Utils
{
    LoadProp loadProp = new LoadProp();
    private By _result = By.xpath("//div[@class=\"result\"]");

    public void userAbleTosendEmailtoFriendSucessfully()
    {

        //Verifying the message has been sent to friend
        String expectedmassage1 = "";
        String actualMessage1 = driver.findElement(_result).getText();
        Assert.assertEquals(actualMessage1,loadProp.getProperty("expectedMassageToverifyemailFriend"),"Your message has not been sent");

    }
}
