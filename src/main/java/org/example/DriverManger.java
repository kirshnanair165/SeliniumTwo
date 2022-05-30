package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManger extends Utils {

    String browserName = "edge";
    public void openBrowser() {

        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
            driver = new ChromeDriver();


        }else if( browserName.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if ( browserName.equalsIgnoreCase("edge")){

            System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else
            System.out.println("The given driver is wrong "+browserName);




        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeBrowser()
    {
        driver.quit();
    }


}
