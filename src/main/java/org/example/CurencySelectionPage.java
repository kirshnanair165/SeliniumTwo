package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CurencySelectionPage extends Utils {

    public void userShouldAbleToSelectTheCurencyDollar() {
        // Selecting the US Dollar currency
        Select curencyUsDollar = new Select(driver.findElement((By.xpath("//div[@class=\"currency-selector\"]/select"))));
        curencyUsDollar.selectByValue(("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F"));
        // Verifying the US Dollar Currency
        String actualCurency1 = driver.findElement(By.xpath("//div[@class=\"prices\"]/span")).getText();
        Assert.assertTrue(actualCurency1.contains("$"));

    }
    public void userShouldAbleToSelectTheCurencyEuro(){
        // Select the EURO currency
        Select curencyEuro = new Select(driver.findElement(By.xpath("//div[@class=\"currency-selector\"]/select")));
        curencyEuro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

        // Verifying the EURO Currency
        String actualCurency2 = (driver.findElement(By.xpath("//div[@class=\"prices\"]/span[contains(text(),\"€\")]"))).getText();
        Assert.assertTrue(actualCurency2.contains("€"));

    }
}

