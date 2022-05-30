package org.example;

import org.openqa.selenium.By;

public class ComputerProductPage extends Utils{

    public void ClickOnNDesktopProdcutButton(){
        diverWaitUrl(20,"https://demo.nopcommerce.com/computers");
        //selecting the required product from the sublist category
        ClicableElement(By.xpath("//ul[@class=\"sublist\"]/li[1]/a"));



    }
}
