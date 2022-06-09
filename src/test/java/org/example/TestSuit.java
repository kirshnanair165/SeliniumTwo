package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage = new HomePage();
    RegstrationPage regstrationPage= new RegstrationPage();
    RegstrationCompletedPage regstrationCompletedPage=new RegstrationCompletedPage();
    ProductEmailFriendPage productEmailFriendPage = new ProductEmailFriendPage();
    EmailToFriendComplected emailToFriendComplected= new EmailToFriendComplected();
    CurencySelectionPage curencySelectionPage = new CurencySelectionPage();
    ComputerProductPage computerProductPage= new ComputerProductPage();
    DesktopProductPage desktopProductPage = new DesktopProductPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
    FaceBookPage faceBookPage=new FaceBookPage();
    NewRelesePage newRelesePage= new NewRelesePage();

    @Test
    public void UserShouldAbleToLoginSuccessfully()
    {
        //click on registration button.
        homePage.clickOnRegstrationButton();
        //user enter the registration details
        regstrationPage.userEnterRegstationDeatiles();
        //user verify the registration is successful or not
        regstrationCompletedPage.userVerifyTheRegstrationSucessfull();
    }

    @Test
    public void userShouldAbleToRefereAProductToFriendSucessfully()
    {
        //Click on Resistration BUtton
        homePage.clickOnRegstrationButton();
        //register user
        regstrationPage.userEnterRegstationDeatiles();
        //User verify the registration
        regstrationCompletedPage.userVerifyTheRegstrationSucessfull();
        //navigate to teh Product page and click on email to fried and fill the details and Click on  Submit button
        productEmailFriendPage.registredUserReferProductToFriendSucesscully();
        //Verifying the product has been referred to your friend successfully
        emailToFriendComplected.userAbleTosendEmailtoFriendSucessfully();
    }

    @Test
    public void UserShouldAbleToSelectTheCurency()
    {
        //open the home Page and Select the Currency dollar and verified
        curencySelectionPage.userShouldAbleToSelectTheCurencyDollar();
        //open the home Page and Select the Currency Euro and verified
        curencySelectionPage.userShouldAbleToSelectTheCurencyEuro();
    }

    @Test
    public void UserShouldAbleToAddProductSuccessfully()
    {
        //On home page Click on Computer Button
        homePage.clickOnComputerCategoryButton();
        //On Computer page Click on Desktop product
        computerProductPage.ClickOnNDesktopProdcutButton();
        //On Desktop page Click on product Build your won computer and build the product your own choice
        desktopProductPage.userShouldAbleToBuildYourOwnComputer();
        //Go to the Shopping cart
        homePage.clickOnShoppingCartButton();
        //Verify the product added successfully
        shoppingCartPage.VerifyTheProductInTheShoppingCart();
    }
    @Test
    public void userShouldAbletoVoteSucessfully()
    {
        //Only Registered USer can vote,click on vote button to verify that
        homePage.clickOnVoteButton();
        // Click on Registration button
        homePage.clickOnRegstrationButton();
        //Enter the deatiles to complete the registration
        regstrationPage.userEnterRegstationDeatiles();
        regstrationCompletedPage.userVerifyTheRegstrationSucessfull();
        //Click on vote button again and verify
        homePage.ClickOnVoteButtonAfterRegistration();


    }
    @Test
    public void productTitles()
    {
        //get the product titles from home page
        homePage.getProdcuttitles();
    }
@Test
    public void userShouldAbleToNavigateToDemoNopcommerceFacebookPageSucessfully()
{
       //Click on the faceBook button on the bottom page
        homePage.navigateToFaceBookPage();
        //verify the Facebook page on the other tab
        faceBookPage.verifyUserIsOnFaceBookPage();
}

@Test
    public void UerShouldAbleToSearchProductsName()
{
      //On the search bar Search product
       homePage.searchProductName("Nike");
}
@Test
    public void UserShouldAbleToLeaveCommetSucessfully()
{
       //Click on the New release Page on the Bottom panel
        homePage.clickOnTheNopCommerceNewRelease();
        //Verify the new Release page
        newRelesePage.VerifyUserIsOnNewRelesePage();
        //Add some new Comments adn verify your comments are displayed correctly
        newRelesePage.UserLeaveCommentSucessfully();
}
@Test
    public void userShouldAbleToAcceptTheAlert()
{
     //Click on the vote Button and handle the popup window
        homePage.clickOnVoteButtontoverify();


}
}
