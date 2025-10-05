package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@id=\"top-links\"]/ul/li[2]/a")
	WebElement lnkMyaccount;
	//div[@id="top-links"]/ul/li[2]/a

	@FindBy(xpath="//div[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement lnkRegister ;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	public void clickRegister()
	{
		lnkRegister.click();
	}
	

}
