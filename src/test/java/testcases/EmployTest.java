package testcases;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LogInPage;
import wrapperclasses.BrowserInitiation;

public class EmployTest extends BrowserInitiation{
	
	@Test
	@Parameters({"user"})
	public void Login(String user) throws Exception {
		
		LogInPage login =new LogInPage(driver);
		HomePage homePage=new HomePage(driver);
		login.login(user);
		homePage.accountVerification(user);
		homePage.pim();
		homePage.empList();
		homePage.fetchEmpDetails();
		
	}

}
