package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {
    public static String randomdate()
    {
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyHHmmss");
        return formatter.format(date);
    }

    public static void takeSnapShot(String fileName){
        //convert web driver object to take Screenshot
        TakesScreenshot screenshot=((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(srcFile,new File("target\\Screen\\"+fileName+randomdate()+".png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void inputText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

   public static void searchProdcut(By by,String text,By by1) {

   }

    public static void ClicableElement(By by){
        driver.findElement(by).click();
    }
    public static void threadSleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    public static void driverWaitelementToBeClickable(int time,By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void driverwaitUrlcontains(int time,String Url)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlContains( ""));
    }
    public static void driverWaitelementToBeSelected(int time,By by )
    {
        WebDriverWait wiat = new WebDriverWait(driver,Duration.ofSeconds(time));
        wiat.until(ExpectedConditions.elementToBeSelected(by));
    }
    public static void driverwaitnumberOfElementsToBeMoreThan(int time ,By by,int number)
    {
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by,number ));
    }
    public static void diverWaitUrl(int time ,String url)
    {
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(""));
    }
    //veriy the URL reusable method
    public static void verifyCurrentUrl(String Url){
        Assert.assertEquals(driver.getCurrentUrl(),Url);

    }


}
