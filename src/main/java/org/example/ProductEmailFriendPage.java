package org.example;

import org.openqa.selenium.By;

public class ProductEmailFriendPage extends Utils {
    private By _buildYourOwnComputer = By.xpath("//div [@class=\"product-item\"]/div[2]/h2/a[@href=\"/build-your-own-computer\"]");
    private By _emailFriend = By.className("email-a-friend");
    private By _friendEmailId = By.xpath("//div/input[@class=\"friend-email\"]");
    private By _PersonalMessage = By.xpath("//div[@class=\"inputs\"]/textarea[@id=\"PersonalMessage\"]");
    private By _sendEmail = By.xpath("//div[@class=\"buttons\"]//button[@name=\"send-email\"]");


    public void registredUserReferProductToFriendSucesscully()

    {
        LoadProp loadProp=new LoadProp();

        //Select the product to recommend to friend
        ClicableElement(_buildYourOwnComputer);
        ClicableElement(_emailFriend);
        // Add your Friend email ID
        inputText(_friendEmailId,loadProp.getProperty("FriendEmailPart1")+randomdate()+ loadProp.getProperty("FriendEmailPart2"));
        //Passing the massage to the Recommended friend
        inputText(_PersonalMessage,loadProp.getProperty("PersonalMessage"));
        //Click on send Email button
        ClicableElement(_sendEmail);



    }

}
