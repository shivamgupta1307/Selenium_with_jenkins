package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	
	//creat constractar
	
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
		
		
	
	}
	

}
