package script;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class ValidLogin extends BaseTest{

	@Test(priority=1,groups={"login","smoke"})
	public void testA(){	
		String un = Utility.getCellValue(XL_PATH,"ValidLogin", 1, 0);
		String pw = Utility.getCellValue(XL_PATH,"ValidLogin", 1, 1);
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickSignIn();
	}
}
