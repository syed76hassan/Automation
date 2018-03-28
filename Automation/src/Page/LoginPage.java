package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pstb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Loginbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement Errmsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SetUserName(String un)
	{
		untb.sendKeys(un);
	}
	
	public void SetPassword(String ps)
	{
		pstb.sendKeys(ps);
	}
	
	public void ClickLogin()
	{
		Loginbtn.click();
	}
}
