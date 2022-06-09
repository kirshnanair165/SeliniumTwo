package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerProductPage extends Utils
{

    private By _DesktopProdcut = By.xpath("//ul[@class=\"sublist\"]/li[1]/a");

    public void ClickOnNDesktopProdcutButton()
    {
        //selecting the required product from the sublist category
        ClicableElement(_DesktopProdcut);

    }
}
