package testCase;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import page_Objects.AccountRegistrationPage;
import page_Objects.BasePage;
import page_Objects.HomePage;
import testBase.BaseClass;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger; //log4j
//import org.apache.logging.log4j.core.Logger;

public class TC001AccountRegistrationTest extends BaseClass{
	
	
	
	@Test
	public void verify_Account_registration()
	{
		logger.info("**** Starting TC001_AccountRegistrationTest ****");
		try {		
		HomePage homepage=new HomePage(driver);
		
		homepage.clickMyAccount();
		logger.info("Click on myAccount Link");
		homepage.clickRegister();
		logger.info("Click on Register Link");
		AccountRegistrationPage regPage= new AccountRegistrationPage(driver);	
	    
		logger.info("Providing customer details...");
		
		//	regPage.firstName("sorabh");
	//	regPage.lastName("jain");
  //	regPage.emailID("sorabhjain123@gmail.com");//iIWsX@gmail.com	
	//  regPage.phoneNumber("9998725652");
	//	regPage.password("Jain@1234");
	//	regPage.confirmPass("Jain@1234");
		
		
	//Randomly generated the data	
		regPage.firstName(randomeString().toUpperCase());
	
	    regPage.lastName(randomeString().toUpperCase());
     
		regPage.emailID(randomeString()+"@gmail.com");//randomly generated the email
	
		regPage.phoneNumber(randomeNumber());
		
		String pass=randomeAlphaNumberic();
		
		regPage.password(pass);
		regPage.confirmPass(pass);
		
		
		
		regPage.clickChek();
		regPage.submitBTN();
		
		logger.info("Validating expected message.. ");
	String confmsg=	regPage.getConfirmMsg();
	Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("test failed..");
		    logger.debug("Debug log..");
		    Assert.fail();
		}
		
		logger.info("**** Finished  TC001_AccountRegistrationTest ****");
	}
	
	
	
	
	
}
