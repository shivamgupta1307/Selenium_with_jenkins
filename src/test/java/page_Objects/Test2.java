package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test2 extends BasePage {
	
	
	public Test2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
