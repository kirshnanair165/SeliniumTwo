package org.example;

import org.openqa.selenium.By;

public class ProductEmailFriendPage extends Utils {


    public void registredUserReferProductToFriendSucesscully(){
          //diverWaitUrl(20,"https://demo.nopcommerce.com/productemailafriend/1");

        //Select the product to recommend to friend
        ClicableElement(By.xpath("//div [@class=\"product-item\"]/div[2]/h2/a[@href=\"/build-your-own-computer\"]"));
        ClicableElement(By.className("email-a-friend"));
        // Add your Friend email ID
        findelemnt(By.xpath("//div/input[@class=\"friend-email\"]"),"friendemail"+randomdate()+"@gmail.com");
        //Passing the massage to the Recommended friend
        findelemnt(By.xpath("//div[@class=\"inputs\"]/textarea[@id=\"PersonalMessage\"]"),"This product is recommended");
        //Click on send Email button
        ClicableElement(By.xpath("//div[@class=\"buttons\"]//button[@name=\"send-email\"]"));



    }


}
