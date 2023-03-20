package com.cydeo.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {



    /*
    Creating a private constructor so we are closing access to the object of this class from outside of the class
     */
    private Driver(){}

    /*
    we make webdriver private because we wants to close access from outside of the class
    we make it static we will use it in a static method and call it through the class
     */
    // private static WebDriver driver;

    private static InheritableThreadLocal<WebDriver> driverPool= new InheritableThreadLocal<>();



    /*
    Create a re-useable utility method which will retrun same driver instance when we call it
     */
    public static WebDriver getDriver(){

        if(driverPool.get()== null){// if driver is null i want u to create me a new browser driver chrome firefox etc but if not null return me the existing one

            /*
            We read our browser type from configuration.properties.
            This way, we can control which browser is opened from outside of our code.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depeneding on the browser type that will be returned from the configuration properties file switch statement will determine the case, and open the matching browser
             */
            switch(browserType){// each thread have own singekton
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }


        }

        return driverPool.get();// if driver not null return driver
    }



    /*
    This method will make sure our driver value is always null after using quit() method
     */
    public static void closeDriver(){
        if(driverPool.get() !=null){// if driver not null , means if there is existing session
            driverPool.get().quit(); // this line terminate existing session , means kill it complettly
            driverPool.remove(); // we are assign driver value null to make sure when u close the browser it will be null again so when i call my getDriver method next time it will create a new driver for us
        }
    }


// so after we make it null the singleon will make another session id for our driver as we make it null


// now its capable of providing multiple driver  by usinf get set and remove method
    // we did parallel testing by getting driver using threadlocal which provide drivers for each thrad and then use plugin to run life cycle
    // if we run from cukes runner cant run
    // the only way to execute plugin is to come and go to test and run it









}
