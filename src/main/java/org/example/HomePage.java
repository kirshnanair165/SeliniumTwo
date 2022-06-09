package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{
    LoadProp loadProp=new LoadProp();

    private By _restrationButton = By.className("ico-register");
    private By _computerpge = By.xpath("//a[@href=\"/computers\"]");
    private By _shoopingCart = By.className("cart-label");
    private By _voteValue = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _voteButton = By.id("vote-poll-1");
    private By _voteResult1 = By.xpath("//div[@id=\"block-poll-vote-error-1\"]");
    private By _voteResult2 = By.className("poll-total-votes");
    private By _faceBookLink= By.className("facebook");
    private By _Productlist = By.xpath("//div[contains(@class,'product-grid')]//div[@class=\"item-box\"]");
    private By _ProdcutName = By.xpath("//input[@type=\"text\"]");
    private By _Submitbutton = By.xpath("//button[@type=\"submit\"]");
    private By _Productlist2 =By.xpath("//h2[@class=\"product-title\"]/a");
    private By _NewRelease=By.xpath("//a[@href=\"/nopcommerce-new-release\"]");

    public void clickOnRegstrationButton()
    {
        // CLick on Regstration Button
        driver.findElement(_restrationButton).click();
    }

    public void clickOnComputerCategoryButton()
    {
        // Click on the top menu panel and select computers
        ClicableElement(_computerpge);

    }

    public void clickOnShoppingCartButton()
    {
//Click on cart button on top right corner
        ClicableElement(_shoopingCart);
    }

    public void clickOnVoteButton()
    {
// click on vote button on the bottom panel
        ClicableElement(_voteValue);
        ClicableElement(_voteButton);
//Verifying Expected vote Massage with-out regstration
        String actualMassageVote = driver.findElement(_voteResult1).getText();
        Assert.assertEquals(loadProp.getProperty("expectedMassageVote"), "Only registered users can vote.", actualMassageVote);
    }

    public void ClickOnVoteButtonAfterRegistration()
    {
        // CLick on the vote Buttton on Bottom panal
        ClicableElement(_voteValue);
        ClicableElement(_voteButton);
        //Verifying the Vote massage after Registration
        String actualMassageVoteResult = driver.findElement(_voteResult2).getTagName();
        Assert.assertEquals(loadProp.getProperty("expectedMassageVoteResult"), "vote(s)...", actualMassageVoteResult);
    }

    public void getProdcuttitles()
    {
       // Get the Product List fro the homePage using the List array
        driver.get(loadProp.getProperty("url"));
        //List array Declaration for Sor the Product adn to know the product Size
        List<WebElement> prodcutTitles = driver.findElements(_Productlist);
        System.out.println(prodcutTitles.size());
        for (WebElement e : prodcutTitles)
        {
            System.out.println(e.getText());
            System.out.println("-----------------");

        }
    }
public void navigateToFaceBookPage()
{
    //Click on the FaceBook page on the Bottom of the HomePage
    ClicableElement(_faceBookLink);

}
public void searchProductName(String name)
{
    //Prodcut Search on the Search box on the Homepage ( using the parametrised method)
    inputText(_ProdcutName,name);
    //Click on the Search Button after enter the Product name
    ClicableElement(_Submitbutton);
    //Using the lsit array to find  out the product in the list
    List<WebElement> produclist = driver.findElements(_Productlist2);
    for (WebElement e : produclist)
    {
        // verifying the product name from the Srting and comparing the product name
        Assert.assertTrue(e.getText().contains(name));
    }

}
public void clickOnTheNopCommerceNewRelease()
{
    //Click on the NewRelese Button on the bottom page
        ClicableElement(_NewRelease);
}
public void clickOnVoteButtontoverify()
{
        ClicableElement(_voteButton);
    // Switching to Alert
    Alert alert = driver.switchTo().alert();
    // Capturing alert message.
    String alertMessage= driver.switchTo().alert().getText();
    Assert.assertEquals(alertMessage,"Please select an answer","Massage not verified");
    // Displaying alert message
    System.out.println(alertMessage);
    alert.accept();

}

}
