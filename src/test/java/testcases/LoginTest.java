package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LogInPage;
import wrapperclasses.BrowserInitiation;

public class LoginTest extends BrowserInitiation{
	
	
	@Test
	@Parameters({"user"})
	public void Login(String user) throws Exception {
		LogInPage login =new LogInPage(driver);
		HomePage homePage=new HomePage(driver);
		login.login(user);
		homePage.accountVerification(user);
		homePage.logOut();
	}

}
