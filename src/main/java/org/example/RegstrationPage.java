package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegstrationPage extends Utils{

    public void userEnterRegstationDeatiles (){
        // select male and female
        ClicableElement(By.xpath("//input [@id=\"gender-male\"]"));

        //driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Autoamtion");
        findelemnt(By.xpath("//input[@name='FirstName']"),"Autommation");

        //driver.findElement(By.id("LastName")).sendKeys("LastName");
        findelemnt(By.id("LastName"),"Lastname");
        //String= "your reagstration is complect"

        //Added date of birth
//
        Select birthday = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")));
        birthday.selectByValue("31");
        Select birthmonth = new Select((driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"))));
        birthmonth.selectByVisibleText("May");
        Select brithyear = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")));
        brithyear.selectByVisibleText("1985");

        //driver.findElement(By.id("Email")).sendKeys("abcd" + randomdate() + "@gmail.com");
        findelemnt(By.id("Email"),"abcd" + randomdate() + "@gmail.com");

        //driver.findElement(By.id("Password")).sendKeys("abc123");
        findelemnt(By.id("Password"),"abc123");

        //driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
        findelemnt(By.id("ConfirmPassword"),"abc123");

        //driver.findElement(By.id("")).click();
        ClicableElement(By.id("register-button"));



    }
}
