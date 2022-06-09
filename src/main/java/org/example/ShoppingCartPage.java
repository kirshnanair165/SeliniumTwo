package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils {
    LoadProp loadProp=new LoadProp();

        private By _cartButton = By.className("cart-label");
        private By _soppingcartVerification = By.xpath("//div /h1");

        public void VerifyTheProductInTheShoppingCart(){
            //Click on cart button on top right corner
            ClicableElement(_cartButton);

            //Using the methods to verify the product are in the shopping cart successfully.
            String actualMessage= driver.findElement(_soppingcartVerification).getText();
            Assert.assertEquals(loadProp.getProperty("shoopingcartexpectedMessage"),actualMessage,"Products not added to shopping cart");

        }


    }

