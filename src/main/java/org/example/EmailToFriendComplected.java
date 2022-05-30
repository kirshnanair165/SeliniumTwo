package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailToFriendComplected extends Utils{

    public void userAbleTosendEmailtoFriendSucessfully(){

        //Verifying the message has been sent to friend
        String expectedmassage1 = "Your message has been sent.";
        String actualMessage1 = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        Assert.assertEquals(actualMessage1,expectedmassage1,"Your message has not been sent");

    }
}
