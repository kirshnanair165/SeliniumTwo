package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegstrationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _gender = By.xpath("//input [@id=\"gender-male\"]");
    private By _firstName = By.xpath("//input[@name='FirstName']");
    private By _lastName = By.id("LastName");
    private By _dateOfBirthDay = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _dateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _dateOfBirthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _emailId = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickRegister = By.id("register-button");

    public void userEnterRegstationDeatiles() {


        // select male and female
        ClicableElement(_gender);

        //driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Autoamtion");
        inputText(_firstName, loadProp.getProperty("Firstname"));

        //driver.findElement(By.id("LastName")).sendKeys("LastName");
        inputText(_lastName, loadProp.getProperty("LastName"));

        //Added date of birth
//
        Select birthday = new Select(driver.findElement(_dateOfBirthDay));
        birthday.selectByValue(loadProp.getProperty("dobDay"));
        Select birthmonth = new Select(driver.findElement(_dateOfBirthMonth));
        birthmonth.selectByVisibleText(loadProp.getProperty("dobMonth"));
        Select brithyear = new Select(driver.findElement(_dateOfBirthYear));
        brithyear.selectByVisibleText(loadProp.getProperty("dobYear"));

        //Enter te email Id
        inputText(_emailId, (loadProp.getProperty("emailFistPart") + randomdate() + loadProp.getProperty("emailSecondPart")));

        //driver.findElement(By.id("Password")).sendKeys("abc123");
        inputText(_password, loadProp.getProperty("Password"));

        //driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
        inputText(_confirmPassword, loadProp.getProperty("ConfirmPasword"));

        //driver.findElement(By.id("")).click();
        ClicableElement(_clickRegister);


    }
}
