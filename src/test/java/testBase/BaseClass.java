package testBase;

import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.logging.log4j.core.util.NetUtils;
import org.apache.logging.log4j.status.StatusConsoleListener;
import org.apache.logging.log4j.status.StatusListener;
import org.apache.logging.log4j.status.StatusLogger;



public class BaseClass {
	
	
	

	  public WebDriver driver;
		public Logger logger;
		public Properties p;
		
		@BeforeTest
		@Parameters({"os","browser"})
		public void setup(String os,String br)
		{
			logger=LogManager.getLogger(this.getClass());
			
			switch(br.toLowerCase())
			{
			case "chrome":driver=new ChromeDriver();break;
			case "edge":driver=new EdgeDriver();break;
			case "firefox":driver=new FirefoxDriver();break;
			default :System.out.println("Invalid browser name..");return;
			
			}
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			
			
			
		}
		
		@AfterTest
		public void teardown()
		{
		driver.quit();	
		}
		
		public String randomeString()
		{
			String generatedstring=RandomStringUtils.randomAlphabetic(5);
		    return generatedstring;
		}
		public String randomeNumber()
		{
			String generatednumber=RandomStringUtils.randomNumeric(10);
		    return generatednumber;
		}
		
		public String randomeAlphaNumberic()
		{
			String generatedstring=RandomStringUtils.randomAlphabetic(3);
			String generatednumber=RandomStringUtils.randomNumeric(3);
			
			return (generatedstring+"@"+generatednumber) ;
		}


}
