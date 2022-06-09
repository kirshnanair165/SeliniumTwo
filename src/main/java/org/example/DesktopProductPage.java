package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DesktopProductPage extends Utils
{
    private By _BuildyourComputer = By.xpath("//div [@class=\"product-item\"]/div[2]/h2/a[@href=\"/build-your-own-computer\"]");
    private By _Processer= By.xpath("//dl//dd[1]//select[@id=\"product_attribute_1\"]");
    private By _Ram = By.xpath("//dl//dd[2]//select['product_attribute_2']");
    private By _HDD =By.xpath("//input [@id=\"product_attribute_3_6\"]");
    private By _Os =By.xpath("//input [@id=\"product_attribute_4_9\"]");
    private By _Software=By.xpath("//input [@id=\"product_attribute_5_11\"]");
    private By _Software1=By.xpath("//input [@id=\"product_attribute_5_12\"]");
    private By _AddToCart =By.xpath("//button[@id=\"add-to-cart-button-1\"]");


    public void userShouldAbleToBuildYourOwnComputer()
    {
        //Selecting the required product form the listed product range
        ClicableElement(_BuildyourComputer);
        //using the method to select the drop-down menu
        Select processor =new Select(driver.findElement(_Processer));
        processor.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
        //Using the Method to select the drop-down menu
        Select ram = new Select(driver.findElement(_Ram));
        ram.selectByValue("3");
        //Select HDD ,According the requirement
        ClicableElement(_HDD);
        //Select OS ,According the requirement
        ClicableElement(_Os);
        //select Software,According the requirement
        ClicableElement(_Software);
        // Select Software requirement.
        ClicableElement(_Software1);
        //click on add to cart
        ClicableElement(_AddToCart);

    }

}
