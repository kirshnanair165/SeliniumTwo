package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
private By _restrationButton = By.className("ico-register");
private By _computerpge = By.xpath("//a[@href=\"/computers\"]");

    public void clickOnRegstrationButton(){
        driver.findElement (_restrationButton).click();
    }
    public void clickOnComputerComputerCategoryButton(){
        // Click on the top menu panel and select computers
        ClicableElement(_computerpge);


    }


}
