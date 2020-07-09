package com.weborders.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static { //only running once before everything else

        //2- get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";


        try {
            //3- we need to open the file
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);

            //5- close.file
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to find configuration.properties");

        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }


}
