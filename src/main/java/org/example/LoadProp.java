package org.example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    //Load Properties Re-Usable method to get the test data
    // only you need one time in the project (Refer to google|)
    static Properties prop=new Properties();
    static FileInputStream input;
    static String propertiesFileLocation="src/test/java/TestConfig/Testdata.properties";

    public String getProperty(String key)
    {
        try {
            input=new FileInputStream(propertiesFileLocation);
            prop.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}


