package com.cydeo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- Create the object Properties class (this will able to read from properties type of file)
    private static Properties properties = new Properties();

//i want to make it static to make it eun before anything, because
    // my code should read from configuration what type of browser its opening etc
    // what type of env , username , password etcc

    static{

        try {

            //2-We need to open the file in java memory using fileInputStream
            FileInputStream file = new FileInputStream("Configuration.properties");
            //3- Load the properties object using FileInputStream Object
            properties.load(file);
            // close the File after loading it
            file.close(); // its better to close it rather than garbage collector




        } catch (IOException e) {
            System.out.println("File not found in the Configuration class");
            e.printStackTrace();
        }


    }



    // simple utility method helps to read the logic made above
    // this keyword go to the property file and see the value

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);


    }






}
