package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewRelesePage extends Utils
{
    LoadProp loadProp=new LoadProp();
    private By _AddNewCommenttitles = By.id("AddNewComment_CommentTitle");
    private By _AddNewComment=By.id("AddNewComment_CommentText");
    private By _CommentButton = By.xpath("//div[@class=\"buttons\"]//button");
    private By _CommentNotification = By.className("notifications");
    private By _CommentsText = By.className("comment-text");

    public void VerifyUserIsOnNewRelesePage()
    {
//Verifying user on the New Relese Page after clicking on news relese Button
        Assert.assertTrue(driver.getCurrentUrl().contains("nopcommerce-new-release"));
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText(),"nopCommerce new release!","Not on the Correct page");


    }
    public void UserLeaveCommentSucessfully()
    {
        //Add the new comment titles
        inputText(_AddNewCommenttitles,loadProp.getProperty("CommentTiles"));
        //Add the massage to the comment box
        inputText(_AddNewComment,loadProp.getProperty("AddNewComment"));
        //Click on the Comment Submit Button
        ClicableElement(_CommentButton);
        //Verify the Massage showing after click on submit button
        Assert.assertEquals(driver.findElement(_CommentNotification).getText(),"News comment is successfully added.");
        //Using the array List how many comments added and finding my added comment is at the last
        List<WebElement> commentlist = driver.findElements(_CommentsText);
        int lastlocator = commentlist.size() -1;
        String commentverification = "";
        String mylastcomment = "";
        for (int i = 0; i < commentlist.size();i++)
        {
            commentverification = commentlist.get(i).getText();
            mylastcomment = commentlist.get(lastlocator).getText();

            }
        //Verifying my comment is Showing on hte comment panel
        Assert.assertTrue(commentverification.contains("products are very good"));
        //Verifying my Comment is in the last position
        Assert.assertEquals(mylastcomment,"products are very good","its not last one");

    }
}



