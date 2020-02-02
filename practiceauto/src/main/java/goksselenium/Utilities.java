package goksselenium;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Utilities {
	
	
	public WebDriver driver;
	
	public void login() throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream fil=new FileInputStream("//Users//gokuldas//eclipse-workspace//TestNGpractice//src//test//data.properties");
		prop.load(fil);	
		
		if(prop.getProperty("browser").equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "//Users//gokuldas//Browsers//chromedriver");
		driver = new ChromeDriver();
		}
		
		else if(prop.getProperty("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();	
		}
		else
			
		{
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}


