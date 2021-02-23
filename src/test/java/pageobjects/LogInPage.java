package pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrapperclasses.ActionItems;
import wrapperclasses.BrowserInitiation;

public class LogInPage extends ActionItems{
	
	
	public LogInPage(WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy (xpath="//*[@class='btn btn-primary dropdown-toggle']")
	public WebElement loginDiffRoll;
	
	@FindBy (xpath="//*[@data-username='admin']")
	public WebElement admin;
	
	@FindBy (xpath="//*[@data-username='kevin']")
	public WebElement kevin;
	
	@FindBy (xpath="//*[@data-username='linda']")
	public WebElement linda;
	
	@FindBy (xpath="//*[@data-username='_ohrmSysAdmin_']")
	public WebElement sysAdmin;

	
	public void login(String user) throws Exception {
		clickElement(loginDiffRoll);
		if(user.equalsIgnoreCase("admin")) {
			clickElement(admin);
			}
		
		else if(user.equalsIgnoreCase("linda")) {
			clickElement(linda);
			}
		
		else if(user.equalsIgnoreCase("kevin")) {
			clickElement(kevin);
			}
		
		else if(user.equalsIgnoreCase("_ohrmSysAdmin_")) {
			clickElement(sysAdmin);
			}
		
	}
	
}
