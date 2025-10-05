package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="input-firstname")
	WebElement txtFirstname ;
	
	@FindBy(id="input-lastname")
	WebElement txtLastname;
	
	@FindBy(id="input-email")
	WebElement txtEmailid;
	
	@FindBy(id="input-telephone")
	WebElement txtPhoneNo;

	@FindBy(id="input-password")
	WebElement txtPasswrd;
	
	@FindBy(id="input-confirm")
	WebElement txtConpass;
	
	//@FindBy(name="newsletter")
	//WebElement btnClick;
	
	@FindBy(name="agree")
	WebElement txtChekbox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement clickBTN;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void firstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void lastName(String lName)
	{
	    txtLastname.sendKeys(lName);
	}
	public void emailID(String email)
	{
		txtEmailid.sendKeys(email);
	}
	public void phoneNumber(String number)
	{
		txtPhoneNo.sendKeys(number);
	}
	public void password(String pass)
	{
		txtPasswrd.sendKeys(pass);
	}
	public void confirmPass(String conPass)
	{
		txtConpass.sendKeys(conPass);
	}
	public void clickChek()
	{
		txtChekbox.click();
	}
	public void submitBTN()
	{
		clickBTN.click();
	}
	public String getConfirmMsg()
	{
		try {
	return	(msgConfirmation.getText());
		}catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
}
