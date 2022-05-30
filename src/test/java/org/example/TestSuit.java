package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    RegstrationPage regstrationPage= new RegstrationPage();
    RegstrationCompletedPage regstrationCompletedPage=new RegstrationCompletedPage();
    ProductEmailFriendPage productEmailFriendPage = new ProductEmailFriendPage();
    EmailToFriendComplected emailToFriendComplected= new EmailToFriendComplected();
    CurencySelectionPage curencySelectionPage = new CurencySelectionPage();
    ComputerProductPage computerProductPage= new ComputerProductPage();


    @Test
    public void UserShouldAbleToLoginSuccessfully() {

        //click on registration button.
        homePage.clickOnRegstrationButton();
        //user enter the registration details
        regstrationPage.userEnterRegstationDeatiles();
        //user verify the registration is successful or not
        regstrationCompletedPage.userVerifyTheRegstrationSucessfull();

    }

    @Test
    public void userShouldAbleToRefereAProductToFriendSucessfully(){

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
    public void UserShouldAbleToSelectTheCurency(){
        //open the home Page and Select the Currency dollar and verified
        curencySelectionPage.userShouldAbleToSelectTheCurencyDollar();
        //open the home Page and Select the Currency Euro and verified
        curencySelectionPage.userShouldAbleToSelectTheCurencyEuro();

    }

    @Test
    public void UserShouldAbleToAddProductSuccessfully(){

        homePage.clickOnComputerComputerCategoryButton();
        computerProductPage.ClickOnNDesktopProdcutButton();




    }
}
