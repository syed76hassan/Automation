package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel;
import Page.LoginPage;

public class Val extends BaseTest {

	
	@Test(priority=1,groups= {"Login","Smoke"})
	public void TestValidLogin()
	{
		String un = Excel.getValue(XL_PATH, "valid", 1, 0);
		String ps=Excel.getValue(XL_PATH, "valid", 1, 1);
		
		LoginPage l=new LoginPage(driver);
		l.SetUserName(un);
		l.SetPassword(ps);
		l.ClickLogin();
	}
}
