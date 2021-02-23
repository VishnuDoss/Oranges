package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wrapperclasses.ActionItems;
import wrapperclasses.BrowserInitiation;

public class HomePage extends ActionItems{
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="account-name")
	public  WebElement accountName;
	
	@FindBy (id="user-dropdown")
	public  WebElement user;
	
	@FindBy (xpath="//*[text()='Logout']")
	public  WebElement logOut;
	
	@FindBy (xpath="//*[text()='PIM']")
	public  WebElement pim;
	
	@FindBy (xpath="//*[text()='Employee List']")
	public  WebElement employeeList;
	
	public  void accountVerification(String user) throws Exception{
	System.out.println("Account Verification");
	System.out.println(accountName.getText());
	Thread.sleep(5000);
	switch (user)
	{
	case "admin": Assert.assertEquals(accountName.getText(), "Jacqueline White");
	System.out.println("Logged in as "+user);
	break;
	case "_ohrmSysAdmin_": Assert.assertEquals(accountName.getText(), "System Admin");
	System.out.println("Logged in as "+user);
	break;
	case "linda": Assert.assertEquals(accountName.getText(), "Linda Anderson");
	System.out.println("Logged in as "+user);
	break;
	case "kevin": Assert.assertEquals(accountName.getText(), "Kevin Mathew");
	System.out.println("Logged in as "+user);
	break;
	
	}
		
		
	}
	
	public  void logOut() throws Exception {
		
		clickElement(user);
		Thread.sleep(2000);
		clickElement(logOut);
	}
	
    public  void pim() throws Exception {
		
		clickElement(pim);
		Thread.sleep(2000);
	}

public  void empList() throws Exception {
	
	clickElement(employeeList);
	Thread.sleep(2000);
}
	
public  void fetchEmpDetails() throws Exception {

	/*
	 * String empId=driver.findElement(By.
	 * xpath("//*[text()='Odis  Adalwin ']/preceding-sibling::td[1]")).getText();
	 * String
	 * empName=driver.findElement(By.xpath("//*[text()='Odis  Adalwin ']")).getText(
	 * ); String empJob=driver.findElement(By.
	 * xpath("//*[text()='Odis  Adalwin ']/following-sibling::td[1]")).getText();
	 * String empStatus=driver.findElement(By.
	 * xpath("//*[text()='Odis  Adalwin ']/following-sibling::td[2]")).getText();
	 * String empUnit=driver.findElement(By.
	 * xpath("//*[text()='Odis  Adalwin ']/following-sibling::td[3]")).getText();
	 * String empCenter=driver.findElement(By.
	 * xpath("//*[text()='Odis  Adalwin ']/following-sibling::td[4]")).getText();
	 * String empLocation=driver.findElement(By.
	 * xpath("//*[text()='Odis  Adalwin ']/following-sibling::td[5]")).getText();
	 */
	/*
	 * System.out.println(empId+" "+empName+" "+empJob+" "+empStatus+" "+empUnit+" "
	 * +empCenter+" "+empLocation);
	 */
	
}	

}
