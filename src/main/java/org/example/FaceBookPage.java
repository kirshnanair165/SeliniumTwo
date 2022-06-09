package org.example;

import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    public void verifyUserIsOnFaceBookPage()
    {

        String MainWindow = driver.getWindowHandle();
// To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext())
        {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow))
            {
// Switching to Child window
                driver.switchTo().window(ChildWindow);
                System.out.println(driver.getCurrentUrl() + "  my url");
                Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce", "Url Not matched");
            }
        }
    }
}