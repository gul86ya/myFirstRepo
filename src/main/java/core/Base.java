package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {
     public static WebDriver driver;
     public static Properties proporties;
     public static Logger logger;
     private String propertyPath =".\\src\\test\\resources\\input\\property.properties";
     private String log4jPath =".\\src\\test\\resources\\input\\log4j.properties";
   
     /**
      *We creat a constructor here to initialize the variable values from 
      *properties file
      */
     public Base() {
     
     try {
		BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
		properties = new Properties();
		properties.load(reader);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    
     PropertyConfigurator.configure(log4jPath);
     
  } 
 /**
  * this method should return the url value from properties file.
  * 
  * @return
  */
     public static String getUrl() {
    	 String url = properties.getProperty("url");
    	 return url;
     }
     /**
      * This method should return value of browser we define in our properties file
      * 
      * @return
      */
     public stastic String getBrowser() {
    	 String browser = properties.getProperty("browser");
    	 
     }
      
     public void openBrowser() {
    	 driver.get(geturl());
     }
     
     /**
      * This method will close all opened browsers once it is called
      */
     public static void tearDown() {
    	 driver.close();
    	 driver.quet();
     }
     /**
      * This method will run cross browser , means we can change value of browser 
      * in propreties file and it will run test cases on specified browser
      */
     public static void browser() {
    	 String browserName = getBrowser();
    	 switch(browserName) {
    	 case"chrome":
    		 WebDriverManager.chromdriver().setup();
    	     driver = new ChromeDriver();
    	     break;
    	 case"ff":
    		 WebDriverManager.firefoxdriver().setup();
    		 driver = new EdgeDriver();
    		 break;
    	 case"edge":
    		 WebDriverManager.edgedriver().setup();
    		 driver = new EdgeDriver();
    		 break;
   default:
	   WebDriverManager.chromedriver().setup();
	   driver = new chromedriver().setup();
	   driver = ChromeDriver();
    			  }
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	 //driver.manage()deleteAllCoocies();// this method will de;ete all store coockies of
     }
     
}
